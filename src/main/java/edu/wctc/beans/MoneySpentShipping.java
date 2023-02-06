package edu.wctc.beans;

import edu.wctc.Sale;
import edu.wctc.iface.IShippingPolicy;
import org.springframework.stereotype.Component;

@Component
public class MoneySpentShipping  implements IShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        if (sale.getAmount() >= 25) sale.setShipping(0);
        else sale.setShipping(8);
    }
}
