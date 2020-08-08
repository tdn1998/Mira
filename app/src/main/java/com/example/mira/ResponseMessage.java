package com.example.mira;

public class ResponseMessage {

    String textMessage;
    int i;

    public ResponseMessage(String textMessage, int i) {
        this.textMessage = textMessage;
        this.i = i;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
