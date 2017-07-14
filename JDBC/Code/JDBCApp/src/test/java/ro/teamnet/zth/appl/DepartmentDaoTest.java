package ro.teamnet.zth.appl;

import org.junit.Test;
import ro.teamnet.zth.api.em.EntityManagerImpl;
import ro.teamnet.zth.appl.dao.DepartmentDao;
import ro.teamnet.zth.appl.dao.LocationDao;
import ro.teamnet.zth.appl.domain.Department;
import ro.teamnet.zth.appl.domain.Location;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ana.Diaconu on 14-Jul-17.
 */
public class DepartmentDaoTest {
    EntityManagerImpl emi = new EntityManagerImpl();
    DepartmentDao dd = new DepartmentDao();

    @Test
    public void findByIdTest(){
        assertEquals(emi.findById(Department.class, (long)10),dd.findById((long)10));
    }

    @Test
    public void getNextIdVal(){
        assertEquals(emi.getNextIdVal("DEPARTMENTS","DEPARTMENT_ID"),dd.getNextIdVal("DEPARTMENT_ID"));
    }

    @Test
    public void insert(){
        Department d = new Department();
        d.setDepartmentName("Programming");
        d.setLocation((long)2500);
        assertNotNull(dd.insert(d));
    }

}
