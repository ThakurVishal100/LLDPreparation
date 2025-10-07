package liskovSubstitutionPrinciple;

public class VisaCard extends CreditCard implements InternationalPayment{

    @Override
    public void tapAndPay() {
        System.out.println("tap and pay payment of Visa Card");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("onlineTransfer payment of Visa card");
    }

    @Override
    public void InternationalPayment() {
        System.out.println("international payment of Visa card");
    }
}
