package com.topics.assertion;

/**
 * Two types of assertion, simple and really simple
 * The difference between the two is that the simple version adds a second
 * expression separated from the first (boolean expression) by a colon—this
 * expression's string value is added to the stack trace. Both versions throw an
 * immediate AssertionError.
 * <p>
 * java -ea MainClass, java -enableassertions MainClass
 * java -da MainClass, java -disableassertions MainClass
 * <p>
 * <p>
 * 1. Don’t Use Assertions to Validate Arguments to a public Method.
 * 2. Do Use Assertions to Validate Arguments to a private Method.
 */
public class AssertionExample {
    private static int x = 10;
    private static int y = 5;

    //Really Simple :
    private static void doReallySimpleAssert() {
        assert (y < x);
        // more code assuming y is greater than x
    }

    //Simple:
    private static void doSimpleAssert() {
        assert (y > x) : "y is " + y + " and x is " + x;
        // more code assuming y is greater than x
    }

    static void assertionStatementExamples() {
        int x = 1;
        boolean b = true;
        // the following six are legal assert statements
        assert (x == 1);
        assert (b);
        assert true;
        assert (x == 1) : x + " message example test value";
        assert (x == 1) : aReturnExample();
        //assert (x == 1) : new ValidAssert();
        // the following six are ILLEGAL assert statements
/*      assert (x = 1); // none of these are booleans
        assert (x);
        assert 0;
        assert (x == 1) : ; // none of these return a value
        assert (x == 1) : noReturn();
        assert (x == 1) : ValidAssert va;*/
    }

    static int aReturnExample() {
        return 1;
    }

    public static void main(String[] args) {
        assertionStatementExamples();
        doReallySimpleAssert();
        doSimpleAssert();
    }

    // Never code like this : (it will modify only when assert is enabled)
    public void inCorrectUseOfAssert() {
        assert (modifyThings());
        // continues on
    }

    public boolean modifyThings() {
        y = x++;
        return true;
    }
}
