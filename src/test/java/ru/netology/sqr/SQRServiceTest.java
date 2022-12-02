package ru.netology.sqr;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SQRServiceTest {
    @Test
    public void calcTestWhenSomeNumbersFinded () {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;
        Assertion.assertEquals(expected, actual);
    }
    @Test
    public void calcTestWhenSomeNumbersNotFinded () {
        SQRService service = new SQRService();
        int actual = service.calc(10_000, 20_000);
        int expected = 0;
        Assertion.assertEquals(expected, actual);
    }
    @Test
    public void calcTestWhenSomeNumbersNotFinded () {
        SQRService service = new SQRService();
        int actual = service.calc(100, 105);
        int expected = 1;
        Assertion.assertEquals(expected, actual);
    }
}
