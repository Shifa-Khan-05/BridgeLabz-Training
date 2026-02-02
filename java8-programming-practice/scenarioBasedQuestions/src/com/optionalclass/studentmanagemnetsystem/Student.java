package com.optionalclass.studentmanagemnetsystem;

public class Student {
	    private int id;
	    private String email;
	    private String phone;
	    private String address;
	    private String nickname;
	    private String name;

	    public Student(int id, String name, String email, String phone,
	                   String address, String nickname) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.phone = phone;
	        this.address = address;
	        this.nickname = nickname;
	    }

	    public int getId() { return id; }
	    public String getEmail() { return email; }
	    public String getPhone() { return phone; }
	    public String getAddress() { return address; }
	    public String getNickname() { return nickname; }
	    public String getName() { return name; }
	}

