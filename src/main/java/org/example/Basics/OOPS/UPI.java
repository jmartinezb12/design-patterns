package org.example.Basics.OOPS;

public class UPI implements PaymentMethod{
    String upiId;

    @Override
    public void pay() {
        System.out.println("Making payment via UPI "+upiId);
    }
}
