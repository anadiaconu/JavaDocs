package exercise3;

/**
 * Created by Ana.Diaconu on 07-Jul-17.
 */
public class StudentExtension extends Student {

    public StudentExtension(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public StudentExtension() {
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getFirstName().hashCode();

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return (getFirstName().equals(student.getFirstName())) ;
    }
}
