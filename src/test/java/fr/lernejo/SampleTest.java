package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest extends Sample{
    @Test
    public void fact_3_expected_6() {
        int n = 3;
        Sample sample = new Sample();
        Assertions.assertEquals(sample.fact(n), 6);
    }
}  