package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNo5ThenNo() {
        int[] input = {1, 2, 3, 4};
        int result = FindLoop.indexOf(input, 5);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4ThenN3() {
        int[] input = {1, 2, 3, 4};
        int result = FindLoop.indexOf(input, 4);
        int expect = 3;
        assertThat(result, is(expect));
    }
}