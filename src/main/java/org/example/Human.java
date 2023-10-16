package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
    private String name;
    //Changed address to protected so it can be accessed in student
    protected String address;
    private short age;

    // constructor that takes only three paras
    public Human(String name, short age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getAddress() ;

    public abstract void setAddress(String address);


    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

