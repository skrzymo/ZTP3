package com.skrzymo;

public class Main {

    public static void main(String[] args) {

        IMailBox mailBox = new DecoratorDateSentMessage(new DecoratorDateReceiveMessage(new DecoratorIndex(new DecoratorFilter(new DecoratorCensor(new MailBox(), "inna"), "sale"))));

        mailBox.send("wiadomość");
        mailBox.send("inna wiadomość");
        mailBox.send("wiadomośc sale");

        IMailBox mailBox2 = new DecoratorEncrypt(new DecoratorDateSentMessage(new DecoratorDateReceiveMessage(new DecoratorIndex(new MailBox()))));

        mailBox2.send("jakaś zaszyfrowana wiadomość");
        mailBox2.send("inna zaszyfrowana wiadomość");

        System.out.println("------mailBox------");
        mailBox.read().forEach(System.out::println);
        System.out.println("------mailBox2------");
        mailBox2.read().forEach(System.out::println);



    }
}
