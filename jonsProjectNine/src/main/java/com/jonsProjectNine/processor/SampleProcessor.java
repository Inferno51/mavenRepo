package com.jonsProjectNine.processor;

import org.springframework.context.ApplicationEvent;
import org.springframework.jmx.export.annotation.ManagedResource;


import com.ebay.jetstream.event.EventException;
import com.ebay.jetstream.event.JetstreamEvent;
import com.ebay.jetstream.event.support.AbstractEventProcessor;
import com.ebay.jetstream.management.Management;

@ManagedResource(objectName = "Event/Processor", description = "SampleProcessor")
public class SampleProcessor extends AbstractEventProcessor {
    private JetstreamEvent lastEvent;
    
    @Override
    public void afterPropertiesSet() throws Exception {
        Management.addBean(getBeanName(), this);
    }

    public JetstreamEvent getLastEvent() {
        return lastEvent;
    }

    @Override
    public int getPendingEvents() {
        return 0;
    }

    @Override
    public void pause() {
        
    }

    @Override
    protected void processApplicationEvent(ApplicationEvent event) {
        
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void sendEvent(JetstreamEvent event) throws EventException {
        lastEvent = event;
        super.incrementEventRecievedCounter();
        System.out.println(event);
        super.fireSendEvent(event);
        super.incrementEventSentCounter();
    }

    public void setLastEvent(JetstreamEvent lastEvent) {
        this.lastEvent = lastEvent;
    }

    @Override
    public void shutDown() {
        
    }

}