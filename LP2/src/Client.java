
public class Client extends Person implements Actions {
    private Account account;

    // Cria a conta com os dados
    public Client(String name, int age, double salary, double fixedExpenses) {
        super(name, age);
        if (salary < fixedExpenses) {
            throw new IllegalArgumentException("Salário menor que despesas fixas");
        }
        this.account = new Account(fixedExpenses, salary);
        System.out.println("Successfully registered client. Salary: $" + salary + " Fixed Expense: $" + fixedExpenses);
        // Lugar onde pode ser utilizado as exeções
    }

    public void getBalance() {
        System.out.println("Seu saldo atual é de: R$" + account.getBalance());
    }

    public void getMonthlyExpenses() {
        System.out.println("Suas despesas até o momento foi de: R$" + account.getMonthlyExpenses());
    }

    public void getMonthlyIncome() {
        System.out.print("Seus ganhos até o momento foram de: " + account.getMonthlyIncome());
    }

    public void getTransiction(int x) {
        account.getTransiction(x);
    }

    public void getAllTransictions() {
        account.getAllTransictions();
    }

    @Override
    public void valueIn(double amount, String commentary) {
        account.valueIn(amount, commentary);
    }

    @Override
    public void valueOut(double amount, String commentary) {
        account.valueOut(amount, commentary);
    }

}
