package com.demoedu.csumb;

/**
 * A utility class for unit conversions and other helpers.
 */
public class Utils {

    public static double ctof(double celsius){

        return (celsius * 1.8) +32 ;

    }

    public static double ftoc(double fahrenheit){

        return (fahrenheit - 32) / 1.8;

    }

}
