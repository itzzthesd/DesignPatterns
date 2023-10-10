package AdapterDp;

import AdapterDp.thirdParty.YesbankApi;

public class YesBankAdapter implements BankApi{

    private YesbankApi yesbankApi = new YesbankApi();
    @Override
    public double getBalance(String acc) {
        return yesbankApi.getBalance(Integer.parseInt(acc));
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amt) {
        try {
            yesbankApi.transfer((int) amt, Integer.parseInt(fromAcc), Integer.parseInt(toAcc));
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
