package org.example.Basics.OOPS;

public class CreditCard {
    private String cardNo;
    private String userName;

    public CreditCard(String cardNo, String name){
        this.cardNo = cardNo;
        this.userName = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getUserName() {
        return userName;
    }
}
