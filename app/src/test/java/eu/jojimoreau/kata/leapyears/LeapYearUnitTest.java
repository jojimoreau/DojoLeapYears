package eu.jojimoreau.kata.leapyears;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearUnitTest {
    KataCheckerMain myActivity = new KataCheckerMain();
    @Test
    public void leapCheck_should_returnFalse() {
        // All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
        assertEquals(myActivity.leapCheck(2017), false);
        assertEquals(myActivity.leapCheck(2018), false);
        assertEquals(myActivity.leapCheck(2019), false);

        // All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year)
        assertEquals(myActivity.leapCheck(1700), false);
        assertEquals(myActivity.leapCheck(1800), false);
        assertEquals(myActivity.leapCheck(1900), false);
        assertEquals(myActivity.leapCheck(2100), false);
    }

    @Test
    public void leapCheck_should_returnTrue() {
        // All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year)
        assertEquals(myActivity.leapCheck(2000), true);

        // All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016)
        assertEquals(myActivity.leapCheck(2008), true);
        assertEquals(myActivity.leapCheck(2012), true);
        assertEquals(myActivity.leapCheck(2016), true);
    }
}