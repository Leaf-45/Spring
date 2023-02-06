package edu.wctc.beans;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesReport;

import java.util.List;

public class DetailSalesReport implements ISalesReport
{
    @Override
    public void generateReport(List<Sale> salesList)
    {
        System.out.println("Customer  |  Country  |  Amount  |  Tax  |  Shipping");
        for(Sale sale : salesList)
        {
            System.out.printf("%s  |   %s   |    %.2f   |   %.2f  |   %.2f%n", sale.getCustomer(), sale.getCountry(), sale.getAmount(),
                    sale.getTax(), sale.getShipping());
        }

    }
}
