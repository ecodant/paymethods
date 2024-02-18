package com.paymethod.uni.co;

public class PaymentNequi implements Payment{

    @Override
    public void createdPay() {
       System.out.println("You've selected Nequi as your payment");
        
    }
    
}