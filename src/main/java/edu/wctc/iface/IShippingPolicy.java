package edu.wctc.iface;
import edu.wctc.Sale;
public interface IShippingPolicy {
    void applyShipping(Sale sale);
}
