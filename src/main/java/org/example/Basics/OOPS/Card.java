package org.example.Basics.OOPS;

abstract public class Card {
    private String cardNo;
    private String userName;

    public Card(String cardNo, String name){
        this.cardNo = cardNo;
        this.userName = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getUserName() {
        return userName;
    }

    abstract void pay();
}
