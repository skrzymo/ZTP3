package com.skrzymo;

import java.util.LinkedList;

public class DecoratorFilter extends Decorator {

    String filteringMessage;

    public DecoratorFilter(IMailBox message, String filteringMessage) {
        super(message);
        this.filteringMessage = filteringMessage;
    }

    public void send(String message){
        super.send(message);
    }
    public LinkedList<String> read(){
        return addFilter(super.read());
    }

    public LinkedList<String> addFilter(LinkedList<String> messages) {

        for(String message: messages) {
            if (message.toLowerCase().contains(filteringMessage.toLowerCase())) {
                messages.remove(message);
            }
        }

        return messages;
    }
}
