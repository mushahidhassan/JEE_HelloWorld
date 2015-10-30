package com.declarevariable.pagebackingbeans;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Created by m on 10/27/2015.
 * This class is inherited by the parent Person class and implements two interfaces
 */
@ManagedBean(name = "userBean")
public class UserBean extends Person implements Serializable, Game {

    private static final long serialVersionUID = 1L;
    private String name;
    private String lname;

    public UserBean(){}

    public UserBean(String name, String lname, int ssn){
        this.name = name;
        this.lname = lname;
        setSsn(ssn);
    }

    public String getLname() {
        return lname;
    }
    public String getName (){ return name; }

    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String welcomeString(){
        return "Greetings " + lname +", "+name+". Your Identification Number is " + getSsn() +" and " +likesToPlay();
    }

    @Override
    public String likesToPlay() {
        return lname + " we know you Like to play table tennis";
    }
}
