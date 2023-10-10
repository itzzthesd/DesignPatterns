package AdapterDp;

public class IciciBankAdapter implements BankApi{
    @Override
    public double getBalance(String acc) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amt) {
        return false;
    }
}
