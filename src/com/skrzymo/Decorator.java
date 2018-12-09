package com.skrzymo;

import java.util.LinkedList;

abstract class Decorator implements IMailBox {

        protected IMailBox message;

        public Decorator (IMailBox message){
            this.message = message;
        }

        public void send(String message){
            this.message.send(message);
        }

        public LinkedList<String> read() {
            return this.message.read();
        }
}
