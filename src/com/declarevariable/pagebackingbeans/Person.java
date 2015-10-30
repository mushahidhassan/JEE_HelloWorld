package com.declarevariable.pagebackingbeans;

/**
 * Created by m on 10/30/2015.
 * Parent Class
 */
public class Person {
    private int ssn;
    public Person(){}

    public Person(int ssn){
        this.ssn = ssn;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
}
