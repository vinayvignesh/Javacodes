package Day7codes;

interface UPIPayment {
    void upiTransfer();
}

interface CreditCardPayment {
    void cardTransfer();
}

class PaymentGateway implements UPIPayment, CreditCardPayment {
    
    public void upiTransfer() {
        System.out.println("UPI Payment Successful");
    }

   
    public void cardTransfer() {
        System.out.println("Credit Card Payment Successful");
    }
}

public class Onlinepayment {
    public static void main(String[] args) {
        PaymentGateway payment = new PaymentGateway();
        payment.upiTransfer();
        payment.cardTransfer();
    }
}


    

