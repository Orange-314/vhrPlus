package com.example.vhr_android_demo;

public final class Data {
    public static String[] EMPLOYEE_NAME = new String[500];

    public static String[] EMPLOYEE_DETAIL = new String[500];

    public static String[] SALARY_NAME = new String[100];

    public static String[] SALARY_DETAIL = new String[100];

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
