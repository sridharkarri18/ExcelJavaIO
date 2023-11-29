package org.example;


public class UserDetails {

    private String Name;
    private int Age;

    private String Role;

    public UserDetails(String name, int age, String role) {
        Name = name;
        Age = age;
        Role = role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
