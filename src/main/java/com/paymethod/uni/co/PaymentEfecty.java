package com.paymethod.uni.co;

public class PaymentEfecty implements Payment{

    @Override
    public void createdPay() {
        System.out.println("Ey, pal, you've selected Efecty as your payment, congratulations.");
        
    }
    
}