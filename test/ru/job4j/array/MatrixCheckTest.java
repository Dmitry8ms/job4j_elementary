package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal2() {
        char[][] input = {
                {' ', ' ', ' '},
                {'Y', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }
}