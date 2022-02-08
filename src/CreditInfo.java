public class CreditInfo {
    int yearInfo;
    double monthRateInfo;
    Person personCreditInfo;
    Account balanceInfo;

    double balanceSum = yearInfo * 12 * monthRateInfo;

    CreditInfo(int year, double monthRate, Person personCredit, Account balance){
        yearInfo = year;
        monthRateInfo = monthRate;
        personCreditInfo = personCredit;
        balanceInfo.balance1 = balance.balance1;

    }

    void creditInfo (){
        System.out.println("Pan " + personCreditInfo.firstName1 + " " + personCreditInfo.lastName1 +
                " ma do spłaty " + (balanceInfo.balance1 - balanceSum));
    }
}
