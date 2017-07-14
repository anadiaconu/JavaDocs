package ro.teamnet.zth.appl.dao;

import ro.teamnet.zth.api.database.DBManager;
import ro.teamnet.zth.api.em.ColumnInfo;
import ro.teamnet.zth.api.em.EntityUtils;
import ro.teamnet.zth.appl.domain.Employee;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ana.Diaconu on 14-Jul-17.
 */
public class EmployeeDao {
    public List<Employee> findEmployees(String department) {
        try {
            Connection con = DBManager.getConnection();
            Statement statement = con.createStatement();
            List<ColumnInfo> columns = EntityUtils.getColumns(Employee.class);
            String query = "select employees.* " +
                    "from employees inner join departments on employees.department_id = departments.department_id " +
                    "where lower(departments.DEPARTMENT_NAME) like lower('%" + department + "%')";
            ArrayList<Employee> al = new ArrayList<>();
            Employee e = null;
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                e = new Employee();
                for (ColumnInfo c : columns) {
                    Field field = e.getClass().getDeclaredField(c.getColumnName());
                    field.setAccessible(true);
                    field.set(e, EntityUtils.castFromSqlType(rs.getObject(c.getDbColumnName()),field.getType()));
                }
                al.add(e);
            }
            return al;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exceptia este " + e);
        }
        return null;
    }
}
