package com.ibm.test;

public class Main {

    private void test() {}

    protected int abc() {
        return 15;
    }

    protected String foo() {
        Main main = new Main();
        main.abc();
        return "test";
    }

    protected long timesTwo(long a) {
        return a * 2;
    }
}
