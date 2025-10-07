package liskovSubstitutionPrinciple;

public class MasterCard extends CreditCard implements InternationalPayment{
    @Override
    public void tapAndPay() {
        System.out.println("tap and pay payment of master card");

    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer payment of master card");

    }

    @Override
    public void InternationalPayment() {
        System.out.println("international payment of Master card");
    }
}
