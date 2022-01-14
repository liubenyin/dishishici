package com.sict.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class hahaha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        double a1=sc.nextDouble();
        System.out.println("请输入");
        double a2=sc.nextDouble();

        double sum = mul(a1,a2);
    }
    public static double mul(double a1,double a2){
        BigDecimal b1=new BigDecimal(Double.toString(a1));
        BigDecimal b2=new BigDecimal(Double.toString(a2));
        System.out.println(b1.multiply(b2).doubleValue());
        return b1.multiply(b2).doubleValue();
    }
}
