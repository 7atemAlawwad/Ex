public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("1234567890", "Hatem", 5000);
        Account account2 = new Account("1234567891", "Mohammed", 3000);
        System.out.println(account1.toString());
        System.out.println("\n-------------------------------");

        System.out.println(account2.toString());
        System.out.println("\n-------------------------------\n");

        System.out.println("Account 1 Credited 1220: " + account1.credit(1220) );
        System.out.println("\n-------------------------------\n");

        System.out.println("Account 2 debited 1043: " + account2.debit(1043) );

        System.out.println("Transfer Successful Account 1 to Account 2: " + account1.transferTo(account2, 1000) );
        System.out.println("\n-------------------------------\n");

        System.out.println(account1.toString());
        System.out.println("\n-------------------------------");
        System.out.println(account2.toString());

        System.out.println("\n-------------------------------\n");

        Employee employee1 = new Employee("1234567890", "Hatem", 5000);
        Employee employee2 = new Employee("1234567891", "Mohammed", 3000);
        System.out.println(employee1.toString());
        System.out.println("\n-------------------------------");
        System.out.println(employee2.toString());
        System.out.println("\n-------------------------------\n");
        System.out.println("Employee 1 Aunnaled Salary: " + employee1.AunnaledSalary() );
        System.out.println("\n-------------------------------\n");
        System.out.println("Employee 2 Aunnaled Salary: " + employee2.AunnaledSalary() );
        System.out.println("\n-------------------------------\n");
        System.out.println("Employee 1 Raised Salary 10%: " + employee1.raiseSalary(10) );
        System.out.println("\n-------------------------------\n");
        System.out.println("Employee 2 Raised Salary 15%: " + employee2.raiseSalary(15) );

    }
}
