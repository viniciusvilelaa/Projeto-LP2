public class App {
    public static void main(String[] args) throws Exception {
        /*LP2Finance lp2Finance = new LP2Finance();
        lp2Finance.createClient("João", 20, 1000, 500);
        lp2Finance.allClients();*/
        Client cliente = new Client("João", 20, 1000, 500);
        cliente.valueIn(100, "Salário");
        cliente.valueIn(500, "sell");
    }
}
