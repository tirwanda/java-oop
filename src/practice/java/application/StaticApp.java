package practice.java.application;

import static practice.java.data.Application.PROCESSOR;
import static practice.java.data.Constant.*;
import practice.java.data.Country;
import practice.java.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        System.out.println(MathUtil.sum(2,4,3,1,5));

        Country.City city = new Country.City();
        city.setName("Bekasi");
        System.out.println(city.getName());

        System.out.println(PROCESSOR);
    }
}
