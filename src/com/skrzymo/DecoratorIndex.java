package com.skrzymo;

import java.util.LinkedList;

public class DecoratorIndex extends Decorator {

    int index;

    public DecoratorIndex(IMailBox message) {
        super(message);
        this.index = 1;
    }

    public void send(String message){
        super.send(addIndex(message));
    }
    public LinkedList<String> read(){
        return super.read();
    }

    public String addIndex(String message){
        String indexString = Integer.toString(getIndex());
        String messageWithIndex = indexString + ": " + message;
        incrementIndex();
        return messageWithIndex;
    }

    private void incrementIndex(){
        this.index++;
    }

    private int getIndex(){
        return this.index;
    }
}
