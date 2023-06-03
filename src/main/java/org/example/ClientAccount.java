package org.example;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.time.LocalDate;

public class ClientAccount {

    @CsvBindByName
    private Integer id;
    @CsvBindByName(column = "first_name")
    private  String firstName;
    @CsvBindByName(column = "last_name")
    private  String lastName;
    @CsvBindByName
    private  int age;
    @CsvBindByName
    private  String street;
    @CsvBindByName
    private  String city;
    @CsvBindByName
    private  String state;
    @CsvBindByName(column = "zip_code")
    private  int zipCode;
    @CsvBindByName(column = "account_balance")
    private  Long accountBalance;
    @CsvBindByName(column = "color_pick")
    private  String colorPick;
    @CsvBindByName(column = "account_creation_date")
    @CsvDate(value = "MM-dd-yyyy")
    private LocalDate accountCreationDate;

    @CsvBindByName(column = "card_types")
    private String cardTypes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getColorPick() {
        return colorPick;
    }

    public void setColorPick(String colorPick) {
        this.colorPick = colorPick;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public String getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(String cardTypes) {
        this.cardTypes = cardTypes;
    }

    @Override
    public String toString() {
        return "ClientAccount{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", accountBalance=" + accountBalance +
                ", colorPick='" + colorPick + '\'' +
                ", dateOfBirth=" + accountCreationDate +
                ", cardTypes=" + cardTypes +
                '}';
    }
}
