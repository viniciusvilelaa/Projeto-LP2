import java.util.ArrayList;

public class LP2Finance {
    public ArrayList<Client> clients;

    public LP2Finance(){
        this.clients = new ArrayList<Client>();
    }

    public void createClient(String name, int age, double salary, double fixedExpenses){
        Client client = new Client(name, age, salary, fixedExpenses);
        this.clients.add(client);
    }

    
    
    public void allClients(){
        for(Client client : clients){
            System.out.println("Client " + client.getName());            
        }
    }
}
