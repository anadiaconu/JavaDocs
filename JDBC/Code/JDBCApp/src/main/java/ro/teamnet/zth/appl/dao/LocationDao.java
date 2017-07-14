package ro.teamnet.zth.appl.dao;

import ro.teamnet.zth.api.em.EntityManager;
import ro.teamnet.zth.api.em.EntityManagerImpl;
import ro.teamnet.zth.api.em.EntityUtils;
import ro.teamnet.zth.appl.domain.Location;

/**
 * Created by Ana.Diaconu on 14-Jul-17.
 */
public class LocationDao {
    private EntityManager em;

    public LocationDao(){
        this.em = new EntityManagerImpl();
    }

    public Location findById (Long id){
        return em.findById(Location.class,id);
    }

    public Long getNextIdVal (String columnIdName){
        return em.getNextIdVal(EntityUtils.getTableName(Location.class), columnIdName);
    }

    public Location insert (Location location){
        return (Location) em.insert(location);
    }

    public Location update (Location location){
        return em.update(location);
    }

    public void delete (Location location){
        em.delete(location);
    }
}
