public interface Movement {
    public void valueIn(double amount, String commentary);
    public void valueOut(double amount, String commentary);
    public double getMonthlyExpenses();
    public double getMonthlyIncome();
}
