package edu.wctc.beans;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesReport;

import java.io.Console;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummarySalesReport implements ISalesReport {
    @Override
    public void generateReport(List<Sale> salesList)
    {

        Map<String, double[]> summary = new HashMap<>();

        for (Sale sale : salesList)
        {
            double[] salesNumbers;
            if (!summary.containsKey(sale.getCountry())) salesNumbers = new double[]{0, 0, 0};
            else salesNumbers = summary.get(sale.getCountry());
            salesNumbers[0] += sale.getAmount();
            salesNumbers[1] += sale.getTax();
            salesNumbers[2] += sale.getShipping();
            summary.put(sale.getCountry(), salesNumbers);
        }
        System.out.printf("Total revenue from each country%nCountry  |  Amount  |  Tax  |  Shipping%n");
        summary.forEach((key, value) -> System.out.printf("%s  |   %.2f   |   %.2f  |   %.2f%n", key, value[0],
                value[1], value[2]));
    }
}
