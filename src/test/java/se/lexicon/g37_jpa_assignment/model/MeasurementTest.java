package se.lexicon.g37_jpa_assignment.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {

    Measurement testMeasurement;

    @BeforeEach
    public void setup() {
        testMeasurement = Measurement.HG;
    }

    @Test
    @DisplayName("Test1 Equal")
    public void test_equal() {
        Assertions.assertEquals("Hectogram", testMeasurement.getType());
    }
}
