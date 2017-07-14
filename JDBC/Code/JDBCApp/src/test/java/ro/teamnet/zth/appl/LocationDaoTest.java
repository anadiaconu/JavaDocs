package ro.teamnet.zth.appl;

import org.junit.Test;
import ro.teamnet.zth.api.em.EntityManagerImpl;
import ro.teamnet.zth.appl.dao.LocationDao;
import ro.teamnet.zth.appl.domain.Department;
import ro.teamnet.zth.appl.domain.Location;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ana.Diaconu on 14-Jul-17.
 */
public class LocationDaoTest {
    EntityManagerImpl emi = new EntityManagerImpl();
    LocationDao ld = new LocationDao();

    @Test
    public void findByIdTest(){
        assertEquals(emi.findById(Location.class, (long)10),ld.findById((long)10));
    }

    @Test
    public void getNextIdVal(){
        assertEquals(emi.getNextIdVal("LOCATIONS","LOCATION_ID"),ld.getNextIdVal("LOCATION_ID"));
    }

    @Test
    public void insert(){
        Location loc = new Location();
        loc.setCity("Bucuresti");
        loc.setPostalCode("111111");
        loc.setStateProvince("buc");
        loc.setStreetAddress("Vladimirescu");
        assertNotNull(ld.insert(loc));
    }

}
