package com.skrzymo;

import java.util.LinkedList;

public class MailBox implements IMailBox {

    LinkedList<String> mailBox = new LinkedList<String>();

    @Override
    public void send(String a){
        mailBox.add(a);
    }

    @Override
    public LinkedList<String> read(){
        return mailBox;
    }
}
