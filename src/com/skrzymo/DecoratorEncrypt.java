package com.skrzymo;

import java.util.LinkedList;

public class DecoratorEncrypt extends Decorator {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public DecoratorEncrypt(IMailBox message) {
        super(message);
    }

    public void send(String message){
        super.send(encrypt(message));
    }

    public LinkedList<String> read() {
        return super.read();
    }

    public static String encrypt(String message)
    {
        message = message.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < message.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(message.charAt(i));
            int keyVal = (3 + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
}
