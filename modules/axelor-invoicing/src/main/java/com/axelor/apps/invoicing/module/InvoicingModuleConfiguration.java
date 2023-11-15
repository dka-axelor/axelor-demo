package com.axelor.apps.invoicing.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.invoicing.service.InvoiceService;
import com.axelor.apps.invoicing.service.InvoiceServiceImpl;
import com.axelor.apps.invoicing.service.OrderService;
import com.axelor.apps.invoicing.service.OrderServiceImpl;

public class InvoicingModuleConfiguration  extends AxelorModule {
    @Override
    protected void configure() {
        bind(OrderService.class).to(OrderServiceImpl.class);
        bind(InvoiceService.class).to(InvoiceServiceImpl.class);
    }

}
