package com.devalexb.jaxws.handler;

import org.apache.log4j.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import static javax.xml.ws.handler.MessageContext.*;

/**
 * @author Alex Bogatikov
 *         Created on 13/11/2016.
 */
public class LogSoapMsgHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger LOGGER = Logger.getLogger(LogSoapMsgHandler.class);

    private String fileNamePrefixRequest;
    private String fileNamePrefixResponse;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    public LogSoapMsgHandler(String logDir) {
        this.fileNamePrefixRequest = logDir + File.separator + "request-";
        this.fileNamePrefixResponse = logDir + File.separator + "response-";
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        try {
            //if this is a request, true for outbound messages, false for inbound
            Boolean isRequest = (Boolean) context.get(MESSAGE_OUTBOUND_PROPERTY);
            String fileNamePostfix = format.format(new Date());

            if (isRequest) {
                SOAPMessage msg = context.getMessage();
                writeMessageToFile(msg, new File(fileNamePrefixRequest + fileNamePostfix));

            } else {
                SOAPMessage msg = context.getMessage();
                writeMessageToFile(msg, new File(fileNamePrefixResponse + fileNamePostfix));
            }
        } catch (Exception ex) {
            LOGGER.error(ex);
        }
        return true;
    }

    private void writeMessageToFile(SOAPMessage msg, File file) {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            msg.writeTo(fos);
        } catch (Exception ex) {
            LOGGER.error(ex);
        }
    }

    @Override
    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        return true;
    }

    @Override
    public void close(MessageContext messageContext) {

    }
}
