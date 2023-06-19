public class Account extends Person {
    private double balance;
    private double fixedExpenses;
    private double monthlyExpenses;
    private double monthlyIncome;


    public Account(String name, int age, double salary, double balance, double fixedExpenses) {
        super(name, age, salary);
        this.fixedExpenses = fixedExpenses;
        this.balance = salary - fixedExpenses;
    }

    public void deposity(double amount, String commentary){
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + this.getName() + "'s account. " + "description: " + commentary);
        this.monthlyIncome += amount;
        
    }

    public void withdraw(double amount, String commentary){
        this.balance -= amount;
        System.out.println("Withdrew " + amount + " from " + this.getName() + "'s account. " + "description: " + commentary);
        this.monthlyExpenses += amount;
    }


    public double getBalance(){
        return this.balance;
    }

    public double getFixedExpenses(){
        return this.fixedExpenses;
    }

    public double getMonthlyExpenses(){
        return this.monthlyExpenses - this.fixedExpenses;
    }

    public double getMonthlyIncome(){
        return this.monthlyIncome;
    }   




}
