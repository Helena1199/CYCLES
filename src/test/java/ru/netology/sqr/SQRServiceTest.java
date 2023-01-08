package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
    public void calcTestWhenSomeNumbersFinded() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWhenSomeNumbersNotFinded() {
        SQRService service = new
                SQRService();
        int actual = service.calc(10_000, 20_000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWhenSomeNumbNotFinded() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 105);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
