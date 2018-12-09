package com.skrzymo;

import java.util.Date;
import java.util.LinkedList;

public class DecoratorDateReceiveMessage extends Decorator {

    public DecoratorDateReceiveMessage(IMailBox message) {
        super(message);
    }

    public void send(String message){
        super.send(message);
    }

    public LinkedList<String> read() {
        return addReceiveDate(super.read());
    }

    public LinkedList<String> addReceiveDate(LinkedList<String> messages){

        Date date = new Date();

        LinkedList<String> messagesWithReceiveDate = new LinkedList<String>();

        for(String message: messages) {
            String receiveMessageWithDate = message +  " odebrano " + date.toString();
            messagesWithReceiveDate.add(receiveMessageWithDate);
        }

        return messagesWithReceiveDate;
    }
}
