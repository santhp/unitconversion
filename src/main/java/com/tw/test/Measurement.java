package com.tw.test;

public class Measurement {
    float value;
    String type;


    public Measurement(float value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        Measurement measurement = (Measurement) obj;
        return measurement.value == value && measurement.type.equals(type);
    }

    @Override
    public String toString() {
        return "(value :" + value + " type :" + type + ")";
    }
}
