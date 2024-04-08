package com.sanjay.Problems;
class Employee{
int SalaryPerMonth;
int BonusForTwoMonths;

    public Employee(int salaryPerMonth, int bonusForTwoMonths) {
        SalaryPerMonth = salaryPerMonth;
        BonusForTwoMonths = bonusForTwoMonths;
//        TotalSalary();
        System.out.println("Total Salary is :"+ TotalSalary());
    }
    int TotalSalary(){
        return (BonusForTwoMonths + 2*SalaryPerMonth);
    }
}
class Executive extends Employee{

    public Executive(int salaryPerMonth, int bonusForTwoMonths) {
        super(salaryPerMonth, bonusForTwoMonths);
    }
}
public class Problem5 {
    public static void main(String[] args) {
        Executive salary = new Executive(40000,5000);

    }
}
