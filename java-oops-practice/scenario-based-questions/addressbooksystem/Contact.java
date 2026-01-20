class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String city;
    private String state;

    public Contact(String firstName, String lastName, String phone,
                   String email, String city, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.state = state;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getCity() { return city; }
    public String getState() { return state; }

    // Setter example (for editing)
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Used for duplicate validation
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        return firstName.equalsIgnoreCase(other.firstName) &&
               lastName.equalsIgnoreCase(other.lastName);
    }
}
