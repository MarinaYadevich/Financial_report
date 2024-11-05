package by.practice.yadevich.financial_report;

import by.practice.yadevich.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FinancialReport {
    private List<Transaction> transactions;

    public FinancialReport() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }
    public void generateReport(){
        if(transactions.isEmpty()){
            System.out.println("No transactions.");
            return;
        }
        double sumAmount = 0;
        System.out.println("-----Financial Report-----");
        for(Transaction transaction:transactions){
            transaction.displayTransactionInfo();
            System.out.println("--------------------");
            sumAmount += transaction.getAmount();
        }
        System.out.println("Total amount of transactions: " + sumAmount);
    }
}
