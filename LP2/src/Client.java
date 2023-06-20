public class Client extends Person{
    private Account account;

    public Client (String name, int age, double salary, double fixedExpenses){
        super(name, age);
        this.account = new Account(fixedExpenses, salary);
    }

}
