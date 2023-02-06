package edu.wctc.beans;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesInput;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleInput implements ISalesInput
{
    @Override
    public List<Sale> getSales()
    {
        Scanner scanner = new Scanner(System.in);

        List<Sale> sales = new ArrayList<>();
        do {
            System.out.println("Enter the customer's name");
            String customer = scanner.nextLine();
            System.out.println("Enter the country's name");
            String country = scanner.nextLine();
            System.out.println("Enter the total cost of the order");
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the cost of tax");
            double tax = Double.parseDouble(scanner.nextLine());
            Sale sale = new Sale(customer, country, amount, tax);
            sales.add(sale);
            System.out.println("Q to stop and anything else to continue");
        } while (!Objects.equals(scanner.nextLine(), "Q"));

        return sales;
    }
}
