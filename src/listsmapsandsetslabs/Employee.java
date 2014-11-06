package listsmapsandsetslabs;

import java.util.*;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }
}
