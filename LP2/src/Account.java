public class Account implements Movement{
    private double balance;
    private double fixedExpenses;
    private double monthlyExpenses;
    private double monthlyIncome;
    private double salary;

    public Account(double fixedExpenses, double salary) {
        this.fixedExpenses = fixedExpenses;
        this.salary = salary;
        this.balance = salary - fixedExpenses;
    }


    public double getBalance(){
        return this.balance;
    }

    public double getFixedExpenses(){
        return this.fixedExpenses;
    }   

    public double getSalary(){
        return this.salary;
    }

    @Override
    public void valueIn(double amount, String commentary){
        this.balance += amount;
        this.monthlyIncome += amount;
        System.out.println("Deposit of " + amount + ", type: " + commentary);
    }
    @Override
    public void valueOut(double amount, String commentary){
        this.balance -= amount;
        this.monthlyExpenses += amount;
        System.out.println("Withdrawal of " + amount + ", type: " + commentary);
    }

    @Override
    public double getMonthlyExpenses(){
        return this.monthlyExpenses - this.fixedExpenses;
    }
    @Override
    public double getMonthlyIncome(){
        return this.monthlyIncome;
    }

    

}
