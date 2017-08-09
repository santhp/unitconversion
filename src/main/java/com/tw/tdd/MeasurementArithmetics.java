package com.tw.tdd;

public class MeasurementArithmetics {


    public static Measurement addMeasurements(Measurement measurement1, Measurement measurement2) {

        Measurement measurement1InInches = UnitConversion.convertToInch(measurement1);
        Measurement measurement2InInches = UnitConversion.convertToInch(measurement2);
        return new Measurement(measurement1InInches.value + measurement2InInches.value, measurement1InInches.type);
    }
}

