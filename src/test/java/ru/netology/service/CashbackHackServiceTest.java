package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;


class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void remain1000 (){

        int expected = 1000;
        int actual = service.remain(0);
        Assert.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void remain200 (){

        int expected = 200;
        int actual = service.remain(800);
        Assert.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void remainZero(){

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void remain1 (){

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void remain999 (){

        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(actual,expected);
    }
}