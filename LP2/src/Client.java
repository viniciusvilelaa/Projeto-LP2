public class Client extends Person{
    private Account account;

    //Cria a conta com os dados
    public Client (String name, int age, double salary, double fixedExpenses){
        super(name, age);
        this.account = new Account(fixedExpenses, salary);
        System.out.println("Cliente cadastrado corretamente, obrigado por utlizar LP2 Finance. Você tem um salario de: " + salary + "e tem um gasto fisico de: " + fixedExpenses);
        //Lugar onde pode ser utilizado as exeções
    }

    public void deposit(double amount, String commentary){
        account.valueIn(amount, commentary);
    }

    public void withdraw(double amount, String commentary){
        account.valueOut(amount, commentary);
    }

    public double monthlyExpensesClient(){
        return account.getMonthlyExpenses();
    }
    
    public double monthlyIncomeClient(){
        return account.getMonthlyIncome();
    }




}
