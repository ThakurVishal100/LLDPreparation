package liskovSubstitutionPrinciple;

public abstract class CreditCard {
    private String CCName;

    private String ownerName;

    private String cardType;

    public abstract void tapAndPay();

    public abstract void onlineTransfer();
}
