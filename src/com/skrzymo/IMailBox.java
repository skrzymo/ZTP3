package com.skrzymo;

import java.util.LinkedList;

public interface IMailBox {

    public void send(String a);

    public LinkedList<String> read();
}
