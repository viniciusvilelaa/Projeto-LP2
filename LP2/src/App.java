import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int sair = 0;
        int opcao = 0;
        while(sair != 1){
            System.out.print("Seja bem vindo ao LP2 Finance\n");
            System.out.print("Digite seu Nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite seu salário: ");
            double salario = sc.nextDouble();
            System.out.print("Digite suas despesas fixas: ");
            double despesas = sc.nextDouble();
            try{
                Client cliente = new Client(nome, idade, salario, despesas);
                System.out.println("Qual opcão deseja realizar?");
                System.out.println("1 - Informar gasto");
                System.out.println("2 - Informar ganho");
                System.out.println("3 - Ver saldo");
                System.out.println("4 - Ver despesas mensais");
                System.out.println("5 - Ver ganhos mensais");
                System.out.println("6 - Ver movimentações");
                System.out.println("7 - Sair");
                opcao = sc.nextInt();
                if (opcao == 1){
                    System.out.println("Digite o valor do gasto e informe tambem pequena descrição sobre o gasto:  ");
                    double gasto = sc.nextDouble();
                    String comentario = sc.nextLine();
                    cliente.valueOut(gasto, comentario);
                }
                
            }catch(IllegalArgumentException e){
                System.out.println("Salario nao pode ser menor que despesas fixas, o programa sera encerrado");
                sair = 1;
            }
            
            sair = 1;
            
        }
        
        
        
        
        
        
        
        
        
        /*try{
            Client cliente = new Client("João", 20, 1200, 500);
        }catch(IllegalArgumentException e){
            System.out.println("Erro");
        }*/
        
        /*cliente.valueIn(100, "Salário");
        cliente.valueIn(500, "sell");
        cliente.valueOut(100, "comida");
        cliente.getBalance();
        cliente.getMonthlyExpenses();
        cliente.getMonthlyIncome();
        cliente.getMovimentacoes(0);
        cliente.getMovimentacoes(1);*/

        
        


    }
}
