package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

/**
 * Created by Ana.Diaconu on 13-Jul-17.
 */
public class EntityManagerImplTest {

    public static void main(String[] args) {
        EntityManagerImpl emi = new EntityManagerImpl();
        System.out.println(emi.findById(Department.class,(long)10));
        System.out.println(emi.getNextIdVal("DEPARTMENTS","DEPARTMENT_ID"));
        Department d = new Department();
        d.setDepartmentName("Programming");
        d.setLocation((long)2500);
        System.out.println(emi.insert(d));
        System.out.println(emi.findAll(Department.class).size());
        System.out.println(emi.findAll(Department.class));
    }

}
