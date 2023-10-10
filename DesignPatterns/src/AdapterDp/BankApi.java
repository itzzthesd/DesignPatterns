package AdapterDp;

public interface BankApi {
    double getBalance(String acc);

    boolean sendMoney(String fromAcc, String toAcc, double amt);
}
