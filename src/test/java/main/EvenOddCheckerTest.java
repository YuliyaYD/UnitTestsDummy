//package main;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class EvenOddCheckerTest {
//    public static void main(String[] args) {
//        EvenOddCheckerTest evenOddCheckerTest = new EvenOddCheckerTest();
//        evenOddCheckerTest.checkEvenNumberTest();
//        evenOddCheckerTest.checkOddNumberTest();
//        evenOddCheckerTest.checkZeroTest();
//    }
//
//    @Test
//    public void checkEvenNumberTest() {
//        Assert.assertEquals(true, EvenOddChecker.check(10));
//    }
//
//    @Test
//    public void checkOddNumberTest() {
//        Assert.assertEquals(false, EvenOddChecker.check(-11));
//    }
//
//    @Test
//    public void checkZeroTest() {
//        Assert.assertEquals(true, EvenOddChecker.check(0));
//    }
//}