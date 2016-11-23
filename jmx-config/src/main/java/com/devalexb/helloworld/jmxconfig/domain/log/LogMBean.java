package com.devalexb.helloworld.jmxconfig.domain.log;

/**
 * @author Alex Bogatikov
 *         Created on 23/11/2016.
 */
public interface LogMBean {

    boolean isEnable();

    void enable();

    void disable();

}
