public class BankAccount {
    String AccountNumber;
    String AccountName;
    float Balance;

    BankAccount(String accountNumber, String accountName, float balance) {
        this.AccountNumber = accountNumber;
        this.AccountName = accountName;
        this.Balance = balance;
    };

    void credits() {
        System.out.println("User Account-Number: " + AccountNumber);
        System.out.println("User Account-Name: " + AccountName);
        System.out.println("User Account-Balance: " + Balance);
    }

    public static void main(String args[]) {
        BankAccount obj1 = new BankAccount("01-121-222-446-485", "Hanzala Hashmi", 200000);
        BankAccount obj2 = new BankAccount("02-979-675-824-341", "Laiba", 90000);
        BankAccount obj3 = new BankAccount("03-428-931-985-850", "Ratan", 1000);
        obj1.credits();
        System.out.println("---------");
        obj2.credits();
        System.out.println("---------");
        obj3.credits();
    }
};