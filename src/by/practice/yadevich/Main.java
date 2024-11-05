package by.practice.yadevich;

import by.practice.yadevich.financial_report.FinancialReport;
import by.practice.yadevich.transaction.Transaction;

public class Main {
    public static void main(String[] args) {

        FinancialReport financialReport = new FinancialReport();
        financialReport.addTransaction(new Transaction("24.10.2024",
                "Payment for goods.", -50));
        financialReport.addTransaction(new Transaction("20.10.2024",
                "Payment for goods.", -100));
        financialReport.addTransaction(new Transaction("10.10.2024",
                "Replenishment of funds.", 1000));

        financialReport.generateReport();
    }
}
