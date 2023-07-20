
public class Client extends Person implements Actions {
    private Account account;

    // Cria a conta com os dados
    public Client(String name, int age, double salary, double fixedExpenses) {
        super(name, age);
        if (salary < fixedExpenses) {
            throw new IllegalArgumentException("Your salary is less than your fixed expenses. The program will be closed.");
        }
        this.account = new Account(fixedExpenses, salary);
        System.out.println("Successfully registered client. Salary: $" + salary + " Fixed Expense: $" + fixedExpenses);
        // Lugar onde pode ser utilizado as exeções
    }

    

    public void getMonthlyExpenses() {
        System.out.println("Your expenses: $" + account.getMonthlyExpenses());
    }

    public void getMonthlyIncome() {
        System.out.println("Your earnings: $" + account.getMonthlyIncome());
    }

    public void getTransiction(int x) {
        
        account.getTransiction(x);
    }

    public void getAllTransictions() {
        account.getAllTransictions();
    }

    @Override
    public void valueIn(double amount, String commentary, String Date) {
        account.valueIn(amount, commentary, Date);
    }

    @Override
    public void valueOut(double amount, String commentary, String Date) {
        account.valueOut(amount, commentary, Date);
    }

    @Override
    public void getBalance() {
        System.out.println("Your balance is: $" + account.getBalance());
    }

}
