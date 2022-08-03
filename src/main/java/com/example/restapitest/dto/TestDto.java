package com.example.restapitest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestDto {

    private String id;
    private String name;

    @JsonProperty("phone_number") //주는건 스네이크
    private String phoneNumber; //받는건 카멜인 경우

    @JsonProperty("OTP")
    private String OTP; //카멜도 스네이크 케이스도 아닌 경우

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", OTP='" + OTP + '\'' +
                '}';
    }
}
