package com.skrzymo;

import java.util.Date;
import java.util.LinkedList;

public class DecoratorDateSentMessage extends Decorator {

    public DecoratorDateSentMessage(IMailBox message) {
        super(message);
    }

    public void send(String message){
        super.send(addSentDate(message));
    }

    public LinkedList<String> read() {
        return super.read();
    }

    public String addSentDate(String message){

        Date date = new Date();

        String sentMessageWithDate = message +  " wysałano " + date.toString();
        return sentMessageWithDate;
    }
}
