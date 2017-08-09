package com.tw.tdd;

import com.tw.tdd.Measurement;

public class UnitConversion {
    enum ConversionRatesToInchForLength {
        mm(0.0393701f), cm(0.393701f), inch(1), foot(12), yard(36);

        float conversionRate;

        ConversionRatesToInchForLength(float conversionRate) {
            this.conversionRate = conversionRate;
        }
    }

    public static Measurement convertToInch(Measurement measurement) {
        return new Measurement(measurement.value * ConversionRatesToInchForLength.valueOf(measurement.type).conversionRate, "inch");
    }

    public static boolean checkIfMeasurementIsEqual(Measurement measurement1, Measurement measurement2) {

        return convertToInch(measurement1).equals(convertToInch(measurement1));
    }


}
