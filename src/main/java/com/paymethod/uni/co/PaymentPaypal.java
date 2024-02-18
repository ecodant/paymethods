package com.paymethod.uni.co;

public class PaymentPaypal implements Payment{

    @Override
    public void createdPay() {
        System.out.println("Ey, bro, you've selected Paypal as your payment.");
        
    }
    
}