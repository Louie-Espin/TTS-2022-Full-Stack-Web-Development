package asu.lfespino;

public class Entry {

    private final String firstName;
    private final String lastName;
    private final String phoneNum;
    private final String emailAddress;

    public Entry(String fName, String lName, String pNum, String email) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNum = pNum;
        this.emailAddress = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return  "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Phone Number: " + phoneNum + '\n' +
                "Email Address: " + emailAddress + '\n';
    }
}
