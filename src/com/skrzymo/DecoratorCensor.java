package com.skrzymo;

import java.util.LinkedList;

public class DecoratorCensor extends Decorator {

    String censoringMessage;

    public DecoratorCensor(IMailBox message, String censoringMessage) {
        super(message);
        this.censoringMessage = censoringMessage;
    }

    public void send(String message){
        super.send(message);
    }
    public LinkedList<String> read(){
        return addCensor(super.read());
    }

    public LinkedList<String> addCensor(LinkedList<String> messages) {

        for(String message: messages) {
            if (message.toLowerCase().contains(censoringMessage.toLowerCase())) {
                int i = messages.indexOf(message);
                messages.set(i,message.toLowerCase().replace(censoringMessage, "***"));

            }
        }

        return messages;
    }
}
