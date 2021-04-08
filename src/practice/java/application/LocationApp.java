package practice.java.application;

import practice.java.data.City;
import practice.java.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); Error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
