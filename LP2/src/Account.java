
import java.util.LinkedHashMap;

public class Account implements Actions{
    private double balance;
    private double fixedExpenses;
    private double monthlyExpenses;
    private double monthlyIncome;
    private double salary;
    private Integer index = 1;

    private LinkedHashMap<Integer, String> historicMoviments = new LinkedHashMap<Integer, String>();
    //private ArrayList<String> historicMoviments = new ArrayList<String>();
    //perguntar como eu faco para salvar o valor e o comentario em um array 

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


    
    public double getMonthlyExpenses(){
        return this.monthlyExpenses + this.fixedExpenses;
    }
    
    public double getMonthlyIncome(){
        return this.monthlyIncome;
    }

    public void getTransiction(int x){
        System.out.println(historicMoviments.get(x));
        
    }
    
    public void getAllTransictions(){
        //System.out.println(historicMoviments);
        for (int i = 1; i <= historicMoviments.size(); i++) {
            System.out.println(historicMoviments.get(i));
        }

    }

    @Override
    public void valueIn(double amount, String commentary){
        this.balance += amount;
        this.monthlyIncome += amount;
        //historicMoviments.add("Income of " + amount + ", Description: " + commentary);
        historicMoviments.put(index, "Income of " + amount + ", Description: " + commentary);
        index ++;
        System.out.println("Income of: " + amount + ", Description: " + commentary);
        System.out.println("Your balance is: $" + this.balance);
        
    }
    @Override
    public void valueOut(double amount, String commentary){
        this.balance -= amount;
        this.monthlyExpenses += amount;
        historicMoviments.put(index, "Expense of " + amount + ", Description: " + commentary);
        index ++;
        System.out.println("Expense of: " + amount + ", Description: " + commentary);
        //historicMoviments.add("Expense of " + amount + ", Description: " + commentary);
        System.out.println("Your balance is: $" + this.balance);
        if(this.balance == 0){
            System.out.println("You have no money left");
        }
    }

}
