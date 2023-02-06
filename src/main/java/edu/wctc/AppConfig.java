package edu.wctc;

import edu.wctc.beans.*;
import edu.wctc.iface.ISalesInput;
import edu.wctc.iface.ISalesReport;
import edu.wctc.iface.IShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig
{

    @Bean
    public ISalesInput salesInput()
    {
        return new TextFileInput();
    }

    @Bean
    public ISalesReport salesReport()
    {
        return new SummarySalesReport();
    }

    @Bean
    public IShippingPolicy shippingPolicy()
    {
        return new FreeShipping();
    }
}
