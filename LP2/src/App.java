import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int exit = 0;
        int option = 0;
        
        System.out.print("Welcome to LP2 Finance\n");
        System.out.print("Type your name: ");
        String name = sc.nextLine();
        System.out.print("Type your age: ");
        int age = sc.nextInt();
        System.out.print("Type your Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Type your fixed expenses: ");
        double expenses = sc.nextDouble();
        try{
            Client cliente = new Client(name, age, salary, expenses);
            while(exit != 1){
                
                Menu.openMenu();
                option = sc.nextInt();
                if(option == 1){
                    System.out.print("Enter the spend amount: ");
                    double amount = sc.nextDouble();
                    System.out.print("Type spend description: ");
                    String description = sc.nextLine();
                    description = sc.nextLine();
                    System.out.print("Type the date: ");
                    String date = sc.nextLine();
                    cliente.valueOut(amount, description, date);
                }else if(option == 2){
                    System.out.print("Enter the income amount: ");
                    double amount = sc.nextDouble();
                    System.out.print("Type de income description: ");
                    String description = sc.nextLine();
                    description = sc.nextLine();
                    System.out.print("Type the date: ");
                    String date = sc.nextLine();
                    cliente.valueIn(amount, description, date);
                }else if(option == 3){
                    cliente.getBalance();
                }else if(option == 4){
                    cliente.getMonthlyExpenses();
                }else if(option == 5){
                    cliente.getMonthlyIncome();
                }else if(option == 6){
                    System.out.println("Type the transaction number: ");
                    int movi = sc.nextInt();
                    try{
                        cliente.getTransiction(movi);
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Invalid transaction number");
                    }
                }else if (option == 7){
                    cliente.getAllTransictions();
                }else if(option == 8){
                    exit = 1;
                }
            }

                        
            
                
                
        }catch(IllegalArgumentException e){
            System.out.println("Salario nao pode ser menor que despesas fixas, o programa sera encerrado");
            exit = 1;
        }
            
        exit = 1;
            
             
        

        
        


    }
}
