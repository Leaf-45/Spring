package edu.wctc.beans;

import edu.wctc.Sale;
import edu.wctc.iface.IShippingPolicy;
import org.springframework.stereotype.Component;

@Component
public class FlatRateShipping implements IShippingPolicy
{

    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(5);
    }
}
