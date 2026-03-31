package com.company.analytics.main;

import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String args[])
    {
        SalesReport sales= new SalesReport();
        EmplyoeePerformance emp=new EmplyoeePerformance();
        System.out.println("Company Combined Report:");
        sales.printData();
        emp.printEmployeePerformance();
    }
}
