package programmers.bbbnam;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Greedy42862Test {
    @Test
    public void testAll() {
        testCase1();
        testCase2();
        testCase3();
    }

    @Test
    public void testCase1() {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int result = 5;
        Greedy42862 greedy42862 = new Greedy42862();
        assertThat(greedy42862.solution(n,lost,reserve), is(result));
    }

    @Test
    public void testCase2() {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        int result = 4;
        Greedy42862 greedy42862 = new Greedy42862();
        assertThat(greedy42862.solution(n,lost,reserve), is(result));
    }

    @Test
    public void testCase3() {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int result = 2;
        Greedy42862 greedy42862 = new Greedy42862();
        assertThat(greedy42862.solution(n,lost,reserve), is(result));
    }
}