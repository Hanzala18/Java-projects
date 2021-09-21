public class Bank {

    int getBalance() {
        return 0;
    }
}

class BankA extends Bank {

    int getBalance(int Getbalance) {
        return Getbalance;
    }
}

class BankB extends Bank {

    int getBalance(int Getbalance) {
        return Getbalance;
    }
}

class BankC extends Bank {

    int getBalance(int Getbalance) {
        return Getbalance;
    }
}

class Bankmain {

    public static void main(String args[]) {

        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        System.out.println("The bank A has:$" + a.getBalance(1000));
        System.out.println("The bank B has:$" + b.getBalance(1500));
        System.out.println("The bank C has:$" + c.getBalance(2000));
    }
}
