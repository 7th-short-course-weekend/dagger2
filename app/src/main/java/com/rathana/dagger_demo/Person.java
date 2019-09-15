package com.rathana.dagger_demo;

import javax.inject.Inject;

public class Person {

    private String name;
    private String gender;

    private  Address address;

    public Person() { }

    //    @Inject
//    public Person(Address address) {
//        this.address = address;
//    }


    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }

    //@Inject
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

