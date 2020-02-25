package programmers.arthur;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;


/**
 * Created or Modified by arthur on 2020/02/24
 */
public class Greedy42862Test {
    Random random = new Random();
    int n = 0;
    int[] lost;
    int[] reserve;

    int lostLength;
    int reserveLength;
    int lostCount;
    int reserveCount;

    @Before
    public void setUp() throws Exception {
//        while (n <= 6 ) {
//            n = random.nextInt(30);
//        }
//        n = 7;
    }

    @Test
    public void solution() {
        /**
         * Greedy42862Test
         * solution
         * author : arthur
         * date : 2020/02/24
         * descr : 체육복
         */
        ////////////////////////// GIVEN //////////////////////////
        Greedy42862 greedy42862 = new Greedy42862();
        n = 7;
        lost = new int[]{2, 3, 4};
        reserve = new int[]{1, 3, 5, 6};
        int answer = 7;

        int n2 = 5;
        int[] lost2 = new int[]{2, 4};
        int[] reserve2 = new int[]{1, 3, 5};
        int answer2 = 5;
        ////////////////////////// WHEN //////////////////////////

        ////////////////////////// THEN //////////////////////////
        assertThat(answer, equalTo(greedy42862.solution(n, lost, reserve)));
        assertThat(answer2, equalTo(greedy42862.solution(n2, lost2, reserve2)));
    }
}