package exercise2;

/**
 * Created by Radu.Hoaghe on 20.04.2015.
 */
public class Student {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final Double averageGrade;

    public Student(Integer id, String firstName, String lastName, Double averageGrade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    // Override the toString() method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

    // Override the equals() method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!id.equals(student.id)) return false;
        if (!firstName.equals(student.firstName)) return false;
        if (!lastName.equals(student.lastName)) return false;
        return averageGrade.equals(student.averageGrade);
    }

        // TODO Exercise 2 c1) Check if the current instance is the same instance as the one from Object o
        // TODO Exercise 2 c2) Check if Object o is null
        // TODO Exercise 2 c3) Check if Object o class type is the same as the current instance's type
        // TODO Exercise 2 c4) Now you know for sure that the Object o is of type Student so you
        // TODO need to cast it to a Student type object
        // TODO Exercise 2 c5) Check if all the fields from Student class are equal to the ones from
        // TODO Exercise 2 c5) Object o (id, lastName, firstName, averageGrade)
        // TODO Exercise 2 d) After you finished implementing equals method go to TODO Exercise 2 e) from Exercise2 class


    // TODO Exercise 2 g) Override the hashCode() method
    // TODO Exercise 2 g) Hint: Don't forget to include in the hashCode result all the fields from
    // TODO Exercise 2 g) the Student class

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + averageGrade.hashCode();
        return result;
    }
}
