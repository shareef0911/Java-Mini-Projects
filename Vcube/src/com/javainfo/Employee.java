package com.javainfo;
public class Employee {

    public static void main(String[] args) {

        String employee_name = "Baji";
        int emp_id = 1;

        double salary = 10000;

        double pf = (salary / 100) * 3;
        double gst = (salary / 100) * 7;
        double arrival = (salary / 100) * 5;

        double m_salary = salary - pf - gst + arrival;
        double y_salary = m_salary * 12;

        System.out.println("Employee Name : " + employee_name);
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Salary : " + salary);
        System.out.println("PF : " + pf);
        System.out.println("GST : " + gst);
        System.out.println("Arrival : " + arrival);
        System.out.println("Monthly Salary : " + m_salary);
        System.out.println("Annual Income : " + y_salary);
    }
}