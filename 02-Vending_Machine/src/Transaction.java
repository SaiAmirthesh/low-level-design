public class Transaction {
    int Selected;
    double amount;

    public Transaction(int selected, double amount) {
        Selected = selected;
        this.amount = amount;
    }

    public int getSelected() {
        return Selected;
    }

    public void setSelected(int selected) {
        Selected = selected;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
