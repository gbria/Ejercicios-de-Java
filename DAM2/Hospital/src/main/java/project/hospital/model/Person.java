package project.hospital.model;

public class Person {
    private String dni;
    private String name;
    private String surname;
    private String email;
    private int phone;

    public Person() {
        this.dni = "";
        this.name = "";
        this.surname = "";
        this.email = "";
        this.phone = 0;
    }

    public Person(String dni, String name, String surname, String email, int phone) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Persona: " +
                "Dni: " + dni + '\'' +
                ", Nom: " + name + '\'' +
                ", Cognoms: " + surname + '\'' +
                ", Email: " + email + '\'' +
                ", Telefon: " + phone +
                '}';
    }
}
