package ru.netology.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn100() {

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn400() {

        int amount = 1600;
        int expected = 400;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn4() {

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn999() {

        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn0() {

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}