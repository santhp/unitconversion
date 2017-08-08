package com.tw.test;

public class Measurement {
    float value;
    String type;

    enum ConversionRatesToInchForLength{
        mm(0.0393701f),cm(0.393701f),inch(1),foot(12),yard(36);

        String type;
        float conversionRate;
        ConversionRatesToInchForLength (float conversionRate){
            this.conversionRate=conversionRate;
        }

    }


    public Measurement(float value,String type) {
        this.value=value;
        this.type=type;
    }


    @Override
    public boolean equals(Object obj) {
        Measurement measurement = (Measurement)obj;
            return measurement.value * ConversionRatesToInchForLength.valueOf(measurement.type).conversionRate == value * ConversionRatesToInchForLength.valueOf(type).conversionRate ;
    }

    @Override
    public String toString() {
        return "value :" + value +" type :" + type;
    }
}
