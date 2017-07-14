package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.util.Date;

/**
 * Created by Ana.Diaconu on 14-Jul-17.
 */
@Table(name = "employees")
public class Employee {

    @Id(name = "employee_id")
    private Long id;

    @Column(name = "first_name")
    private String fName;

    @Column(name = "last_name")
    private String lName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "hire_date")
    private Date hire;

    @Column(name = "job_id")
    private String job;

    @Column(name = "salary")
    private Long salary;

    @Column(name = "commission_pct")
    private Long comm;

    @Column(name = "manager_id")
    private Long manager;

    @Column(name = "department_id")
    private Long dept;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getComm() {
        return comm;
    }

    public void setComm(Long comm) {
        this.comm = comm;
    }

    public Long getManager() {
        return manager;
    }

    public void setManager(Long manager) {
        this.manager = manager;
    }

    public Long getDept() {
        return dept;
    }

    public void setDept(Long dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (fName != null ? !fName.equals(employee.fName) : employee.fName != null) return false;
        if (!lName.equals(employee.lName)) return false;
        if (!email.equals(employee.email)) return false;
        if (phone != null ? !phone.equals(employee.phone) : employee.phone != null) return false;
        if (hire != null ? !hire.equals(employee.hire) : employee.hire != null) return false;
        if (!job.equals(employee.job)) return false;
        if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
        if (comm != null ? !comm.equals(employee.comm) : employee.comm != null) return false;
        if (manager != null ? !manager.equals(employee.manager) : employee.manager != null) return false;
        return dept != null ? dept.equals(employee.dept) : employee.dept == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + lName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (hire != null ? hire.hashCode() : 0);
        result = 31 * result + job.hashCode();
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        return result;
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
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", comm=" + comm +
                ", manager=" + manager +
                ", dept=" + dept +
                '}';
    }
}
