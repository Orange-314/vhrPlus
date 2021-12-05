package com.example.vhr_android_demo;

public final class Data {
    public static String[] EMPLOYEE_NAME = new String[500];

    public static String[] EMPLOYEE_DETAIL = new String[500];

    public static String[] SALARY_NAME = new String[100];

    public static String[] SALARY_DETAIL = new String[100];

    public static String[] SELECT_EMPLOYEE = new String[25];

    public static String[] SELECT_SALARY = new String[25];

    public static String[] HR_NAME = new String[25];

    public static String[] HR_DETAIL = new String[25];

    public static String[] getSelectEmployee() {
        return SELECT_EMPLOYEE;
    }

    public static void setSelectEmployee(String[] selectEmployee) {
        SELECT_EMPLOYEE = selectEmployee;
    }

    public static String[] getHrName() {
        return HR_NAME;
    }

    public static void setHrName(String[] hrName) {
        HR_NAME = hrName;
    }

    public static String[] getHrDetail() {
        return HR_DETAIL;
    }

    public static void setHrDetail(String[] hrDetail) {
        HR_DETAIL = hrDetail;
    }

    public static String[] getSelectSalary() {
        return SELECT_SALARY;
    }

    public static void setSelectSalary(String[] selectSalary) {
        SELECT_SALARY = selectSalary;
    }

    public static String[] getSalaryName() {
        return SALARY_NAME;
    }

    public static void setSalaryName(String[] salaryName) {
        SALARY_NAME = salaryName;
    }

    public static String[] getSalaryDetail() {
        return SALARY_DETAIL;
    }

    public static void setSalaryDetail(String[] salaryDetail) {
        SALARY_DETAIL = salaryDetail;
    }

    public static String[] getEmployeeName() {
        return EMPLOYEE_NAME;
    }

    public static void setEmployeeName(String[] employeeName) {
        EMPLOYEE_NAME = employeeName;
    }

    public static String[] getEmployeeDetail() {
        return EMPLOYEE_DETAIL;
    }

    public static void setEmployeeDetail(String[] employeeDetail) {
        EMPLOYEE_DETAIL = employeeDetail;
    }
}
