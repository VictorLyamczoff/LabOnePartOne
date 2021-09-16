package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void FindPositiveMin() {

        MainActivity mainActivity = new MainActivity();
        int[] array = new int[]{10, 11, 88, 2, 12, 120};
        int result = mainActivity.getMin(array);
        int excepted =2;
        assertEquals(excepted, result);
    }
    @Test
    public void FindNegativeMin() {

        MainActivity mainActivity = new MainActivity();
        int[] array = new int[]{10, 11, 88, 2, 12, -120};
        int result = mainActivity.getMin(array);
        int excepted =-120;
        assertEquals(excepted, result);
    }
    @Test
    public void FindPositiveMax() {

        MainActivity mainActivity = new MainActivity();
        int[] array = new int[]{10, 11, 88, 2, 12, 120};
        int result = mainActivity.getMax(array);
        int excepted =120;
        assertEquals(excepted, result);
    }
    @Test
    public void FindNegativeMax() {

        MainActivity mainActivity = new MainActivity();
        int[] array = new int[]{-10, -11, -88, -2, -12, -120};
        int result = mainActivity.getMax(array);
        int excepted =-2;
        assertEquals(excepted, result);
    }
}