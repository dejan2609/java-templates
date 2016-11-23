package com.devalexb.helloworld.jmxconfig.domain.log;

/**
 * @author Alex Bogatikov
 *         Created on 23/11/2016.
 */
public class Log implements LogMBean {

    private volatile boolean enable;

    @Override
    public boolean isEnable() {
        return this.enable;
    }

    @Override
    public void enable() {
        changeValue(true);
    }

    @Override
    public void disable() {
        changeValue(false);
    }

    private synchronized void changeValue(boolean newValue) {
        this.enable = newValue;
    }

}
