package ro.teamnet.zth.appl.dao;

import ro.teamnet.zth.api.em.EntityManager;
import ro.teamnet.zth.api.em.EntityManagerImpl;
import ro.teamnet.zth.api.em.EntityUtils;
import ro.teamnet.zth.appl.domain.Department;

/**
 * Created by Ana.Diaconu on 14-Jul-17.
 */
public class DepartmentDao {
    private EntityManager em;

    public DepartmentDao(){
        this.em = new EntityManagerImpl();
    }

    public Department findById (Long id){
        return em.findById(Department.class,id);
    }

    public Long getNextIdVal (String columnIdName){
        return em.getNextIdVal(EntityUtils.getTableName(Department.class), columnIdName);
    }

    public Department insert (Department department){
        return (Department) em.insert(department);
    }

    public Department update (Department department){
        return em.update(department);
    }

    public void delete (Department department){
        em.delete(department);
    }
}
