package com.nkma.nangkhieumaianh.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;

public class LogUTil {
    ExtentReports extent;

    private static LogUTil instance;

    public static LogUTil getInstance(){
        if(instance == null)
            instance = new LogUTil();
        return instance;
    }

    private LogUTil(){
        extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/report.html", true);
        extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
    }

    public ExtentTest startTest(String title, String desc){
        return extent.startTest(title,desc);
    }

    public void endTest(ExtentTest logger){
        extent.endTest(logger);
    }

    public void flush(){
        extent.flush();
        extent.close();
    }
}
