package liskovSubstitutionPrinciple;

public class RupayCard extends CreditCard implements UpiPaymentCard{

    @Override
    public void tapAndPay() {
        System.out.println("tap and pay payment of rupay card");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer payment of rupay card");

    }

    @Override
    public void UpiPayment() {
        System.out.println("upi payment of RupayCard");
    }
}
