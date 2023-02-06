package edu.wctc.beans;

import edu.wctc.Sale;
import edu.wctc.iface.IShippingPolicy;
import org.springframework.stereotype.Component;

@Component
public class FreeShipping implements IShippingPolicy
{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0);
    }
}
