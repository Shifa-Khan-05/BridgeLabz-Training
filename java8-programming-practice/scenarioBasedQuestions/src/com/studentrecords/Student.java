package com.studentrecords;

public class Student {

    private int id;
    private String name;
    private int age;
    private String branch;
    private String gender;
    private String city;
    private int rank;
    private long contact;

    public Student(int id, String name, int age, String branch,
                   String gender, String city, int rank, long contact) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.contact = contact;
    }

    // ---------- Getters ----------

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public int getRank() {
        return rank;
    }

    public long getContact() {
        return contact;
    }

    // ---------- toString() ----------

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contact=" + contact +
                '}';
    }
}
