package edu.wctc;

import edu.wctc.iface.ISalesInput;
import edu.wctc.iface.ISalesReport;
import edu.wctc.iface.IShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportGenerator
{
    private final ISalesInput salesInput;
    private final ISalesReport salesReport;
    private final IShippingPolicy shippingPolicy;

    @Autowired
    public ReportGenerator(ISalesInput salesInput, ISalesReport salesReport, IShippingPolicy shippingPolicy)
    {
        this.salesInput = salesInput;
        this.salesReport = salesReport;
        this.shippingPolicy = shippingPolicy;
    }

    public void generateReport(){
        List<Sale> allSales = salesInput.getSales();
        for(Sale aSale : allSales)
            shippingPolicy.applyShipping(aSale);
        salesReport.generateReport(allSales);
    }
}
