package com.example.app;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScannerArgumentResolverTest {

    @Test
    public void testResolve() throws Exception {
        ScannerArgumentResolver resolver = new ScannerArgumentResolver();
        try (ByteArrayInputStream stream = new ByteArrayInputStream("100 200".getBytes())) {
            Argument argument = resolver.resolve(stream);
            assertThat(argument.getA(), is(100));
            assertThat(argument.getB(), is(200));
        }
    }
}