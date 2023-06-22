


public class Client extends Person implements Movement{
    private Account account;

    //Cria a conta com os dados
    public Client (String name, int age, double salary, double fixedExpenses){
        super(name, age);
        this.account = new Account(fixedExpenses, salary);
        System.out.println("Successfully registered client. Salary: $" + salary + " Fixed Expense: $" + fixedExpenses);
        //Lugar onde pode ser utilizado as exeções
    }
    


    @Override
    public void valueIn(double amount, String commentary){
        account.valueIn(amount, commentary);
    }

    @Override
    public void valueOut(double amount, String commentary){
        account.valueOut(amount, commentary);
    }

    
    public void getMonthlyExpenses(){
        System.out.println(account.getMonthlyExpenses());
    }
    
    
    public void getMonthlyIncome(){
        account.getMonthlyIncome();
    }




}
