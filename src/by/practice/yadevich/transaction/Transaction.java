package by.practice.yadevich.transaction;

public class Transaction {
    private String dateTransaction;
    private String descriptionTransaction;
    private double amount;

    public Transaction(String dateTransaction, String descriptionTransaction, double amount) {
        this.dateTransaction = dateTransaction;
        this.descriptionTransaction = descriptionTransaction;
        this.amount = amount;
    }
    public void displayTransactionInfo(){
        System.out.println("Transaction info: \n" +
                "Date transaction: " + dateTransaction + "\n" +
                "Description transaction: " + descriptionTransaction + "\n" +
                "Amount transaction: " + amount);
    }

    public double getAmount() {
        return amount;
    }
}
