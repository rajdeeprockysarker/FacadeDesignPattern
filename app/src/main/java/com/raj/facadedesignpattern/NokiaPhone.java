package com.raj.facadedesignpattern;

public class NokiaPhone implements Phone {
    @Override
    public String build() {
        return "Built using Microsoft OS";
    }
}
