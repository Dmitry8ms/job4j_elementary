package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int res = Factorial.calc(5);
        int expect = 120;
        assertThat(res, is(expect));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int res = Factorial.calc(0);
        int expect = 1;
        assertThat(res, is(expect));
    }
}