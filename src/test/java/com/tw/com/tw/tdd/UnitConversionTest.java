package com.tw.com.tw.tdd;

import com.tw.tdd.Measurement;
import com.tw.tdd.UnitConversion;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitConversionTest {

    @Test
    public void shouldConvertInchToInch() {

        TestCase.assertEquals(new Measurement(1, "inch"), UnitConversion.convertToInch(new Measurement(1, "inch")));

    }

    @Test
    public void shouldConvertToInch() {
        assertEquals(new Measurement(12, "inch"), UnitConversion.convertToInch(new Measurement(1, "foot")));
        assertEquals(new Measurement(36, "inch"), UnitConversion.convertToInch(new Measurement(1, "yard")));
        assertEquals(new Measurement(0.393701f, "inch"), UnitConversion.convertToInch(new Measurement(1, "cm")));

    }

    @Test
    public void shouldCompareMeasurements() {
        assertEquals(true, UnitConversion.checkIfMeasurementIsEqual(new Measurement(12, "inch"), new Measurement(1, "foot")));

    }
}
