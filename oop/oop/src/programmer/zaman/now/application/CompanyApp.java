package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        //class outer
        Company company = new Company();
        company.setName("Programmer Zaman Now");

        Company.Employee employee = company.new Employee();
        employee.setName("Eko");

        System.out.println(employee.getName());
        //outputnya akan name dari outer classnya
        System.out.println(employee.getCompany());
    }
}
//contoh implementasi inner class
//untuk memanggil inner class, gunakan ".".

//keuntungannya
//inner class bisa membaca semua private member dari outer classnya
