package ISP_interface_segregation_principle.problematic_code;

public class Seller implements User{
    @Override
    public void canBuy() {

    }

    @Override
    public void canSell() {

    }

    @Override
    public void canApprove() {
        //   this is unnecessary method to override
    }

    @Override
    public void canModify() {

    }
}
