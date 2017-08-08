package com.tw.test;

public class UnitConversion {
    public static Measurement convertToInch(Measurement measurement) {
        Measurement converted = measurement;
        /*if(measurement.type.equals("foot")){
            converted =  new Measurement(12 * measurement.value,"inch");
        } else if(measurement.type.equals("yard")) {
            converted = new Measurement(36 * measurement.value, "inch");
        } else if (measurement.type.equals("cm")){
            converted = new Measurement(0.393701f * measurement.value,"inch");
        }*/
        return measurement;
    }

}
