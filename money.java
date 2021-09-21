public class money {
    private int accountNo;
    private String name;

    public void transfer() {
        System.out.println("I love You");
    }

    class transfer extends money {
        public void transfer() {
            System.out.println(" She can also say I loveyou too");
        }
    }

    public int getaccountNo() {
        return accountNo;
    }

    public String getname() {
        return name;
    }

    public void setaccountNo(int newaccountNo) {
        accountNo = newaccountNo;
    }

    public void setname(String newname) {
        name = newname;
    }

    public static void main(String[] args) {
        money obj = new money();
        obj.setaccountNo(2000);
        obj.setname("Hanzala");
        obj.transfer();
        System.out.println("he can say his salary is " + obj.getaccountNo());
        // transfer too = new transfer();
        // too.transfer();
    }

}
