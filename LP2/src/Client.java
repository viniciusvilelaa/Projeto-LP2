public class Client extends Person implements Movement{
    private Account account;

    //Cria a conta com os dados
    public Client (String name, int age, double salary, double fixedExpenses){
        super(name, age);
        this.account = new Account(fixedExpenses, salary);
        System.out.println("Cliente cadastrado corretamente, obrigado por utlizar LP2 Finance. Você tem um salario de: " + salary + "e tem um gasto fisico de: " + fixedExpenses);
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

    @Override
    public double getMonthlyExpenses(){
        return account.getMonthlyExpenses();
    }
    
    @Override
    public double getMonthlyIncome(){
        return account.getMonthlyIncome();
    }




}
