package exercise3;

/**
 * Created by Ana.Diaconu on 07-Jul-17.
 */
public class StudentExtension4 extends Student {

    public StudentExtension4(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public StudentExtension4() {
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + super.getFirstName().hashCode();
        result = 31 * result + super.getLastName().hashCode();
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        if (!getFirstName().equals(student.getFirstName())) return false;
        return (getLastName().equals(student.getLastName()));
    }
}
