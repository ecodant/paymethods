package com.paymethod.uni.co;

public class App 
{
    public static void main( String[] args ) throws NoSuchFieldException
    {
       PaymentFactory factory = new PaymentFactory();
       Payment nequiPayment = factory.getPaymethod(PaymentType.NEQUI);
       Payment PaypalPayment = factory.getPaymethod(PaymentType.PAYPAL);
       Payment daviplataPayment = factory.getPaymethod(PaymentType.DAVIPLATA);
       Payment efectyPayment = factory.getPaymethod(PaymentType.EFECTY);
       nequiPayment.createdPay();
       PaypalPayment.createdPay();
       daviplataPayment.createdPay();
       efectyPayment.createdPay();
    }
}
