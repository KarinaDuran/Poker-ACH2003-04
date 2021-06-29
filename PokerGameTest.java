import org.junit.Rule;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class PokerGameTest {

    Table table;

    String test1;
    String test2;
    // FullHouse
    String test3;
    // FourKind
    String test4;
    // ""
    String test5;
    // Pair
    String test6;
    // TwoPair
    String test7;
    // ThreeKind
    String test8;
    // Straight
    String test9;
    // Flush
    String test10;
    // StraightFlush
    String test11;

    String test1Result;
    String test2Result;
    String test3Result;
    String test4Result;
    String test5Result;
    String test6Result;
    String test7Result;
    String test8Result;
    String test9Result;
    String test10Result;
    String test11Result;

    @Before
    public void setup() {

        table = new Table();

        test1 = "14o 13o 12o 11o 10o";
        test2 = "14o 13c 12o 11o 9o";
        test3 = "14o 14c 14p 2e 2o";
        test4 = "13o 13c 13e 13p 5e";
        test5 = "14o 12c 13e";
        test6 = "11p 11c 2o 3e 5p";
        test7 = "5p 5o 7e 7c 4c";
        test8 = "4o 4p 4c 2o 6e";
        test9 = "2c 5p 4o 3e 6p";
        test10 = "3c 8c 14c 5c 11c";
        test11 = "2c 3c 4c 5c 6c";

        test1Result = "14o 13o 12o 11o 10o RoyalFlush";
        // Na verdade, como esse teste contem 5 cartas, alterei para HighCard o
        // verificador
        test2Result = "14o 13c 12o 11o 9o HighCard";
        test3Result = "14p 14o 14c 2o 2e FullHouse";
        test4Result = "13p 13o 13c 13e 5e FourKind";
        test5Result = "14o 12c 13e ";
        test6Result = "11p 11c 5p 3e 2o Pair";
        test7Result = "7e 7c 5p 5o 4c TwoPair";
        test8Result = "6e 4p 4c 4o 2o ThreeKind";
        test9Result = "6p 5p 4o 3e 2c Straight";
        test10Result = "14c 11c 8c 5c 3c Flush";
        test11Result = "6c 5c 4c 3c 2c StraightFlush";
    }

    @Rule
    public Timeout timeout = new Timeout(5, TimeUnit.SECONDS);

    @Test
    public void test1() {

        assertEquals(test1Result, table.individualTest(test1));
    }

    @Test
    public void test2() {

        assertEquals(test2Result, table.individualTest(test2));
    }

    @Test
    public void test3() {
        assertEquals(test3Result, table.individualTest(test3));
    }

    @Test
    public void test4() {
        assertEquals(test4Result, table.individualTest(test4));
    }

    @Test
    public void test5() {
        assertEquals(test5Result, table.individualTest(test5));
    }

    @Test
    public void test6() {
        assertEquals(test6Result, table.individualTest(test6));
    }

    @Test
    public void test7() {
        assertEquals(test7Result, table.individualTest(test7));
    }

    @Test
    public void test8() {
        assertEquals(test8Result, table.individualTest(test8));
    }

    @Test
    public void test9() {
        assertEquals(test9Result, table.individualTest(test9));
    }

    @Test
    public void test10() {
        assertEquals(test10Result, table.individualTest(test10));
    }

    @Test
    public void test11() {
        assertEquals(test11Result, table.individualTest(test11));
    }
}