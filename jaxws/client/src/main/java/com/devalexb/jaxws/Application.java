package com.devalexb.jaxws;

import com.devalexb.jaxws.handler.LogSoapMsgHandler;
import com.devalexb.jaxws.service.HelloWorld;
import com.devalexb.jaxws.service.WSService;
import com.devalexb.jaxws.service.WSService_Service;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Bogatikov
 *         Created on 12/11/2016.
 */
public class Application {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdl = new URL("http://127.0.0.1:8080/WSService?wsdl");
        WSService_Service service = new WSService_Service(wsdl);
        HandlerResolver handlerResolver = new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<>();
                handlerList.add(new LogSoapMsgHandler("./build/tmp"));
                return handlerList;
            }
        };
        service.setHandlerResolver(handlerResolver);
        WSService wsService = service.getWSService();
        HelloWorld hw = wsService.geHelloWorld();
        System.out.println(hw.getHelloWorld());
    }

}
