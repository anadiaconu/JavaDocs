package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.util.Date;

/**
 * Created by Ana.Diaconu on 12-Jul-17.
 */
@Table(name = "EMPLOYEES")
public class Employee {

    @Id(name = "EMPLOYEE_ID")
    private long id;

    @Column(name = "FIRST_NAME")
    private String fName;

    @Column(name = "LAST_NAME")
    private String lName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phone;

    @Column(name = "HIRE_DATE")
    private Date hire;

    @Column(name = "JOB_ID")
    private Job job;

    @Column(name = "SALARY")
    private double salary;

    @Column(name = "COMMISSION_PCT")
    private double comm;

    @Column(name = "MANAGER_ID")
    private Employee manager;

    @Column(name = "DEPARTMENT_ID")
    private Department dept;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getHire() {
        return hire;
    }

    public void setHire(Date hire) {
        this.hire = hire;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", hire=" + hire +
                ", job=" + job +
                ", salary=" + salary +
                ", comm=" + comm +
                ", manager=" + manager +
                ", dept=" + dept +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (Double.compare(employee.salary, salary) != 0) return false;
        if (Double.compare(employee.comm, comm) != 0) return false;
        if (fName != null ? !fName.equals(employee.fName) : employee.fName != null) return false;
        if (!lName.equals(employee.lName)) return false;
        if (!email.equals(employee.email)) return false;
        if (phone != null ? !phone.equals(employee.phone) : employee.phone != null) return false;
        if (!hire.equals(employee.hire)) return false;
        if (!job.equals(employee.job)) return false;
        if (manager != null ? !manager.equals(employee.manager) : employee.manager != null) return false;
        return dept != null ? dept.equals(employee.dept) : employee.dept == null;
    }

//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (fName != null ? fName.hashCode() : 0);
//        result = 31 * result + lName.hashCode();
//        result = 31 * result + email.hashCode();
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        result = 31 * result + hire.hashCode();
//        result = 31 * result + job.hashCode();
//        temp = Double.doubleToLongBits(salary);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(comm);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (manager != null ? manager.hashCode() : 0);
//        result = 31 * result + (dept != null ? dept.hashCode() : 0);
//        return result;
//    }
}
