package com.example.prepataionforl3.pattern.abstractfactory;

import com.example.prepataionforl3.pattern.abstractfactory.product.Laptop;
import com.example.prepataionforl3.pattern.abstractfactory.product.Phone;
import com.example.prepataionforl3.pattern.abstractfactory.product.TV;

public abstract class CompanyAbstractFactory {
    public abstract Phone createPhone();
    public abstract TV createTV();
    public abstract Laptop createLaptop();
}
