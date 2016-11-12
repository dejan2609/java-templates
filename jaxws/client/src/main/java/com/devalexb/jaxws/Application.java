package com.devalexb.jaxws;

import com.devalexb.jaxws.service.HelloWorld;
import com.devalexb.jaxws.service.WSService;
import com.devalexb.jaxws.service.WSService_Service;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Alex Bogatikov
 *         Created on 12/11/2016.
 */
public class Application {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdl = new URL("http://127.0.0.1:8080/WSService?wsdl");
        WSService_Service service = new WSService_Service(wsdl);
        WSService wsService = service.getWSService();
        HelloWorld hw = wsService.geHelloWorld();
        System.out.println(hw.getHelloWorld());
    }

}
