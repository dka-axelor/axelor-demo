package com.axelor.apps.invoicing.service;

import com.axelor.apps.invoicing.db.Invoice;

import java.math.BigDecimal;

public interface InvoiceService {
    public BigDecimal computeExTaxTotalInvoiceValue(Invoice invoice);
    public BigDecimal computeInvoiceTotal(Invoice invoice);

    public void setStateSelectToValidate(Invoice invoice);
}
