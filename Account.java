public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(){}

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return balance;
        }
        else {
//            System.out.println("\n-------------------------------\n");
//            System.out.println("Credit Successful");
//            System.out.println("Your new balance is: " + (balance + amount));
//            System.out.println("Your old balance is: " + balance);
        }
        return balance += amount;
    }
    public int debit(int amount){
        if (balance < amount) {
            System.out.println("Insufficient Funds");
            return balance;
        }
        else {
//            System.out.println("\n-------------------------------\n");
//            System.out.println("Debit Successful");
//            System.out.println("Your new balance is: " + (balance - amount));
//            System.out.println("Your old balance is: " + balance);
            return balance -= amount;
        }
    }
    public int transferTo(Account another, int amount){
        if (balance < amount) {
            System.out.println("Insufficient Funds");
            return balance;
        }
        else {
            balance -= amount;
            another.credit(amount);
//            System.out.println("\n-------------------------------\n");
//            System.out.println("Transfer Successful");
//            System.out.println("Your new balance is: " + another.getBalance());
//            System.out.println("Your old balance is: " + balance);
        }
        return another.credit(amount);
    }
    public String toString(){
        return "Account ID: "+id+" \nName: "+name+"\nBalance: "+balance;
    }



}
