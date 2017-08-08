package com.tw.test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MeasurementArithmeticsTest {


    @Test
    public void shouldAddSameMeasurementUnit() {
        assertEquals(new Measurement(12, "inch"), MeasurementArithmetics.addMeasurements(new Measurement(6, "inch"), new Measurement(6, "inch")));
        assertEquals(new Measurement(24, "inch"), MeasurementArithmetics.addMeasurements(new Measurement(20, "inch"), new Measurement(4, "inch")));
        assertEquals(new Measurement(1.9996073f, "inch"), MeasurementArithmetics.addMeasurements(new Measurement(2.579f, "cm"), new Measurement(2.5f, "cm")));

    }

    @Test
    public void shouldAddDifferentMeasurementUnit() {
        assertEquals(new Measurement(18, "inch"), MeasurementArithmetics.addMeasurements(new Measurement(6, "inch"), new Measurement(1, "foot")));

    }
}
