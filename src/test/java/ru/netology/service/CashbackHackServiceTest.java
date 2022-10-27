package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void remain1000 (){

        int expected = 1000;
        int actual = service.remain(0);
        org.junit.Assert.assertEquals(actual,expected);
    }
    @org.junit.Test
    public void remain200 (){

        int expected = 200;
        int actual = service.remain(800);
        org.junit.Assert.assertEquals(actual,expected);
    }
    @org.junit.Test
    public void remainZero(){

        int expected = 0;
        int actual = service.remain(1000);
        org.junit.Assert.assertEquals(actual,expected);
    }
    @org.junit.Test
    public void remain1 (){

        int expected = 1;
        int actual = service.remain(999);
        org.junit.Assert.assertEquals(actual,expected);
    }
    @org.junit.Test
    public void remain999 (){

        int expected = 999;
        int actual = service.remain(1001);
        org.junit.Assert.assertEquals(actual,expected);
    }
}