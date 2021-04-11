package practice.java.application;

import practice.java.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Kenebae.Id");

        Company company2 = new Company();
        company2.setName("StartApp");

        Company.Employee employee = company.new Employee();
        employee.setName("Edho Dwi Tirwanda");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Bambang");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
