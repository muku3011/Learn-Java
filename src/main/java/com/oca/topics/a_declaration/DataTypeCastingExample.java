package com.oca.topics.a_declaration;

public class DataTypeCastingExample {

    /*
        * Casting rules for primitive types
        */
    double aDoubleValue = 30000000000000000000.123438934;
    int doubleToInt = (int)aDoubleValue;        //stores max value 2147483647, makes sense!!
    byte doubleToByte = (byte)aDoubleValue;     //stores -1, why not 127?
    short doubleToShort = (short)aDoubleValue;  // stores -1, why not 32767?
    long doubleToLong = (long)aDoubleValue;     // stores 9223372036854775807, makes sense!!
    float doubleToFloat = (float)aDoubleValue;  // stores 3.0E19, 3.0 x 10^19  max value of float
    char doubleToChar = (char)aDoubleValue;     // what does this store?
    
    

}
