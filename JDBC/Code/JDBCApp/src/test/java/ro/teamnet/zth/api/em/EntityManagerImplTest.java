package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.dao.EmployeeDao;
import ro.teamnet.zth.appl.domain.Department;
import ro.teamnet.zth.appl.domain.Employee;
import ro.teamnet.zth.appl.domain.Location;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ana.Diaconu on 13-Jul-17.
 */
public class EntityManagerImplTest {

    public static void main(String[] args) {
        EntityManagerImpl emi = new EntityManagerImpl();
//        System.out.println(emi.findById(Department.class,(long)10));
//        System.out.println(emi.getNextIdVal("DEPARTMENTS","DEPARTMENT_ID"));
//        Department d = new Department();
//        d.setDepartmentName("Programming");
//        d.setLocation((long)2500);
//        System.out.println(emi.insert(d));
//        System.out.println(emi.findAll(Department.class).size());
//        System.out.println(emi.findAll(Department.class));
//        Department d2 = new Department();
//        d2.setLocation((long)1700);
//        d2.setId((long)271);
//        d2.setDepartmentName("IT");
//        System.out.println(emi.update(d2));

//        Department d3 = new Department();
//        d3.setLocation((long)1700);
//        d3.setId((long)271);
//        d3.setDepartmentName("IT");
//        emi.delete(d3);

//        Location loc = new Location();
//        loc.setCity("Bucuresti");
//        loc.setPostalCode("9675456");
//        loc.setStateProvince("buc");
//        loc.setStreetAddress("cbsaikud");
//        emi.insert(loc);

//        Location loc1 = new Location();
//        loc1.setCity("Bucuresti");
//        loc1.setPostalCode("96754356");
//        loc1.setStateProvince("buc");
//        loc1.setStreetAddress("cbsaicekud");
//        emi.insert(loc1);

//        Map<String, Object> map = new HashMap<>();
//        map.put("city","Bucuresti");
//        map.put("state_province","buc");
//
//        System.out.println(emi.findByParams(Location.class,map));

        EmployeeDao ed = new EmployeeDao();
        System.out.println(ed.findEmployees("str"));

    }

}
