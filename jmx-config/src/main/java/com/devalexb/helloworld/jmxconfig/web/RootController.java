package com.devalexb.helloworld.jmxconfig.web;

import com.devalexb.helloworld.jmxconfig.domain.log.LogMBean;
import com.sun.javafx.binding.StringFormatter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alex Bogatikov
 *         Created on 23/11/2016.
 */
@Controller
public class RootController {

    private final static Logger LOGGER = Logger.getLogger(RootController.class);

    public final static String RESPONSE_TEMPLATE = "Hello world from %s blog! Now logging is: %s";

    private LogMBean logMBean;

    @Autowired
    public RootController(LogMBean logMBean) {
        this.logMBean = logMBean;
    }

    @RequestMapping(
            path = "/hello",
            method = {RequestMethod.GET}
    )
    public ResponseEntity<?> rootController() {
        String message = StringFormatter.format(RESPONSE_TEMPLATE, logMBean.isEnable()).getValue();
        if (logMBean.isEnable()) {
            LOGGER.info(message);
        }
        return ResponseEntity.ok(message);
    }

}
