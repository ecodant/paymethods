package com.paymethod.uni.co;

public class PaymentDaviplata implements Payment {

    @Override
    public void createdPay() {
        System.out.println("Ey, good one, you've selected Daviplata as your payment, congratulations.");
        
    }

}