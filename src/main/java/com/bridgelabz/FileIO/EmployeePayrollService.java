package com.bridgelabz.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    public static Scanner sc = new Scanner(System.in);

    public enum IOService {
        File_IO, Console_IO
    }

    List<EmployeePayrollData> payrollList;

    EmployeePayrollService(List<EmployeePayrollData> payrollList) {
        this.payrollList = payrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        employeePayrollService.writeEmployeePayrollData();
        employeePayrollService.readEmployeePayrollData();
    }

    private void writeEmployeePayrollData() {
        System.out.println("Enter Employee id");
        int id = sc.nextInt();
        System.out.println("Enter Employee name");
        String name = sc.next();
        System.out.println("Enter Employee Salary");
        double salary = sc.nextDouble();

        payrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void readEmployeePayrollData() {
        for (EmployeePayrollData employeePayrollData : payrollList) {
            System.out.println(employeePayrollData + " ");
        }
    }
}