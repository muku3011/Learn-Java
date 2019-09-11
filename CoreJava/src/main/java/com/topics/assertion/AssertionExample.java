package com.topics.assertion;

/**
 * Two types of assertion, simple and really simple
 * The difference between the two is that the simple version adds a second
 * expression separated from the first (boolean expression) by a colon—this
 * expression's string value is added to the stack trace. Both versions throw an
 * immediate AssertionError.
 *
 * java -ea, java -enableassertions
 * java -da, java -disableassertions
 *
 *
 * 1. Don’t Use Assertions to Validate Arguments to a public Method.
 * 2. Do Use Assertions to Validate Arguments to a private Method.
 *
 */
public class AssertionExample {
    private int x = 1;
    private int y = 5;

    //Really Simple :
    private void doReallySimpleAssert() {
        assert (y > x);
        // more code assuming y is greater than x
    }

    //Simple:
    private void doSimpleAssert() {
        assert (y > x) : "y is " + y + " x is " + x;
        // more code assuming y is greater than x
    }

    //Never code like this : (it will modify only when assert is enabled)
    public void doStuff() {
        assert (modifyThings());
        // continues on
    }
    public boolean modifyThings() {
        y = x++;
        return true;
    }



    public static void main(String[] args) {
        go();
    }

    static int aReturn() {
        return 1;
    }

    static void go() {
        int x = 1;
        boolean b = true;
        // the following six are legal assert statements
        assert (x == 1);
        assert (b);
        assert true;
        assert (x == 1) : x + " message example test value";
        assert (x == 1) : aReturn();
        //assert (x == 1) : new ValidAssert();
        // the following six are ILLEGAL assert statements
/*      assert (x = 1); // none of these are booleans
        assert (x);
        assert 0;
        assert (x == 1) : ; // none of these return a value
        assert (x == 1) : noReturn();
        assert (x == 1) : ValidAssert va;*/
    }


}
