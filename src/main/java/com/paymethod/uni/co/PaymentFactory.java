package com.paymethod.uni.co;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    /*Implementación del hasMap, para tener solo una instancia de cada pago.*/
    private final static Map<PaymentType, Payment> payments = new HashMap<>(){{
        put(PaymentType.NEQUI, new PaymentNequi());
        put(PaymentType.PAYPAL, new PaymentPaypal());
        put(PaymentType.DAVIPLATA, new PaymentDaviplata());
        put(PaymentType.EFECTY, new PaymentEfecty());
    }};
    public Payment getPaymethod(PaymentType paymentType) throws NoSuchFieldException{
        return payments.get(paymentType);
        /*Switch Statement del código base.*/

        // return switch (paymentType) {
        //     case NEQUI -> new PaymentNequi();
        //     case PAYPAL -> new PaymentPaypal();
        //     case DAVIPLATA -> new PaymentDaviplata();
        //     case EFECTY -> new PaymentEfecty();
        //     default -> throw new NoSuchFieldException("The payment that you've provided is not available");
        // };
    }
}