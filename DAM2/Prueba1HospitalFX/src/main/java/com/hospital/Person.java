package com.hospital;

public class Person {
    private String dni;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;

    public Person() {
        this.dni = "";
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.phone = 0;
    }

    public Person(String dni, String firstName, String lastName, String email, int phone) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    //Sistema cutre para sacar los dni la tabla appointments
    @Override
    public String toString() {
        return  dni;
    }
}
