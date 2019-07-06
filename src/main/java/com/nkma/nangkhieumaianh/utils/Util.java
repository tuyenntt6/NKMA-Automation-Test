package com.nkma.nangkhieumaianh.utils;

import javax.swing.*;

public class Util {
    public static void sleep(long mil){
        try{
            Thread.currentThread().sleep(mil);
        }catch (Exception ex){

        }
    }
}
