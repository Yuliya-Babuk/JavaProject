package org.example;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void dateTest() {
        assertEquals(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE), "2021-09-03");
    }
}

