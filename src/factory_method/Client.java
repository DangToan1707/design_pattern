package factory_method;

public class Client {

    public static void main(String[] args) {
        Bank bankTP = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bankTP.getBankName()); // TPBank
        Bank bankVietcom = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bankVietcom.getBankName()); // VietComBank
    }
}
