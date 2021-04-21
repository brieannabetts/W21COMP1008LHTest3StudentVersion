//Brieanna Betts
//1158732
package models;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Person {
    private String firstName, lastName, email;
    private String gender;
    private LocalDate birthday;

    public Person(String firstName, String lastName, String email, String gender, LocalDate birthday) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if (firstName.length() >= 2) {
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                this.firstName = firstName;
        }
        else
            throw new IllegalArgumentException("First name must have at least 2 characters");

    }


    public void setLastName(String lastName) {
            lastName = lastName.trim();
            if (lastName.length()>=2) {
                lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
                this.lastName = lastName;
            }
            else
                throw new IllegalArgumentException("Last name must have at least 2 characters");

    }

    public void setBirthday(LocalDate birthday) {
        if (birthday.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Birthday cannot be in the future");
        this.birthday = birthday;
    }

    public void setGender(String gender) {
    }
  
    public void setEmail(String email) {
    }

    public String getInitials()
    {
        return null;
    }

    public int getAge()
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
    
    @Override
    public String toString()
    {
        return null;
    }
}