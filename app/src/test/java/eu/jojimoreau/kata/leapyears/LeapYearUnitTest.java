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

        // Other random test
        assertEquals(myAcctivity.leapCheck(1000), false);
        assertEquals(myAcctivity.leapCheck(1051), false);
        assertEquals(myAcctivity.leapCheck(1102), false);
        assertEquals(myAcctivity.leapCheck(1153), false);
        assertEquals(myAcctivity.leapCheck(1255), false);
        assertEquals(myAcctivity.leapCheck(1306), false);
        assertEquals(myAcctivity.leapCheck(1357), false);
        assertEquals(myAcctivity.leapCheck(1459), false);
        assertEquals(myAcctivity.leapCheck(1510), false);
        assertEquals(myAcctivity.leapCheck(1561), false);
        assertEquals(myAcctivity.leapCheck(1663), false);
        assertEquals(myAcctivity.leapCheck(1714), false);
        assertEquals(myAcctivity.leapCheck(1765), false);
        assertEquals(myAcctivity.leapCheck(1867), false);
        assertEquals(myAcctivity.leapCheck(1918), false);
        assertEquals(myAcctivity.leapCheck(1969), false);
    }

    @Test
    public void leapCheck_should_returnTrue() {
        // All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year)
        assertEquals(myActivity.leapCheck(2000), true);

        // All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016)
        assertEquals(myActivity.leapCheck(2008), true);
        assertEquals(myActivity.leapCheck(2012), true);
        assertEquals(myActivity.leapCheck(2016), true);

        // Other Random test
        assertEquals(myAcctivity.leapCheck(1104), true);
        assertEquals(myAcctivity.leapCheck(1208), true);
        assertEquals(myAcctivity.leapCheck(1312), true);
        assertEquals(myAcctivity.leapCheck(1416), true);
        assertEquals(myAcctivity.leapCheck(1520), true);
        assertEquals(myAcctivity.leapCheck(1624), true);
        assertEquals(myAcctivity.leapCheck(1728), true);
        assertEquals(myAcctivity.leapCheck(1832), true);
        assertEquals(myAcctivity.leapCheck(1936), true);
    }
}