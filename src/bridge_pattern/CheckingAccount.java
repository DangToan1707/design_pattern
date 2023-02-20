package bridge_pattern;

public class CheckingAccount implements Account{

    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }
}
