package org.zhengsongjun.pojo;

public class Address {
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;
}
