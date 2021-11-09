package com.example.vhr_android_demo;

public final class Data {
    public static String[] EMPLOYEE_NAME = new String[500];

    public static String[] EMPLOYEE_DETAIL = new String[500];


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
