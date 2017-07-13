package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.database.DBManager;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ana.Diaconu on 13-Jul-17.
 */
public class EntityManagerImpl implements EntityManager {

    @Override
    public <T> T findById(Class<T> entityClass, Long id) {
        Connection con = DBManager.getConnection();
        String table = EntityUtils.getTableName(entityClass);
        List <ColumnInfo> columns = EntityUtils.getColumns(entityClass);
        Condition cond = new Condition();

        for (ColumnInfo c : columns) {
            if (c.isId()) {
                cond.setColumnName(c.getDbColumnName());
            }
        }
        cond.setValue(id);

        QueryBuilder qb = new QueryBuilder();
        qb.setTableName(table);
        qb.addQueryColumns(columns);
        qb.setQueryType(QueryType.SELECT);
        qb.addCondition(cond);

        String obtainedQuery = qb.createQuery();

        Statement s = null;
        try {
            s = con.createStatement();
            ResultSet rs = s.executeQuery(obtainedQuery);
            T t = null;
            while (rs.next()) {
                    t = entityClass.newInstance();
                    for (int i = 0; i < columns.size(); i++) {
                        Field field = t.getClass().getDeclaredField(columns.get(i).getColumnName());
                        field.setAccessible(true);
                        field.set(t, EntityUtils.castFromSqlType(rs.getObject(columns.get(i).getDbColumnName()),field.getType()));
                    }
            }
            return t;
        }catch (Exception e) {
            System.out.println("Exceptia este la prima metoda: " + e);
        }

    return null;
    }

    @Override
    public Long getNextIdVal(String tableName, String columnIdName) {
        try {
            Connection con = DBManager.getConnection();
            Statement statement = null;
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select max ("+columnIdName+") from "+tableName);
            if (rs.next()) {
                return rs.getLong(1)+1;
            }
        } catch (Exception e) {
            System.out.println("Exceptia este la a doua metoda: " +e);
        }
        return null;
    }

    @Override
    public <T> Object insert(T entity) {
        try {
        Connection con = DBManager.getConnection();
        String table = EntityUtils.getTableName(entity.getClass());
        List <ColumnInfo> columns = EntityUtils.getColumns(entity.getClass());
        Long aux = new Long(0);
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).isId()) {
                aux = getNextIdVal(table, columns.get(i).getDbColumnName());
                columns.get(i).setValue(aux);
            } else {

                Field field = entity.getClass().getDeclaredField(columns.get(i).getColumnName());
                field.setAccessible(true);
                columns.get(i).setValue(field.get(entity));
            }
        }

        QueryBuilder qb = new QueryBuilder();
        qb.setTableName(table);
        qb.addQueryColumns(columns);
        qb.setQueryType(QueryType.INSERT);

        String obtainedQuery = qb.createQuery();

        Statement statement = null;
        statement = con.createStatement();
        statement.executeQuery(obtainedQuery);
        return findById(entity.getClass(),aux);
        } catch (Exception e) {
            System.out.println("Exceptia este la a treia metoda: " +e);
        }

        return null;
    }

    @Override
    public <T> List<T> findAll(Class<T> entityClass) {
        try {

        Connection con = DBManager.getConnection();
        String table = EntityUtils.getTableName(entityClass);
        List <ColumnInfo> columns = EntityUtils.getColumns(entityClass);

        QueryBuilder qb = new QueryBuilder();
        qb.setTableName(table);
        qb.addQueryColumns(columns);
        qb.setQueryType(QueryType.SELECT);

        String obtainedQuery = qb.createQuery();

        Statement statement = null;
        statement = con.createStatement();
        ResultSet rs = statement.executeQuery(obtainedQuery);
        ArrayList<T>al = new ArrayList<T>();
        T t = null;
        while (rs.next()){
            t = entityClass.newInstance();

            for(int i=0;i<columns.size();i++){
                Field field = t.getClass().getDeclaredField(columns.get(i).getColumnName());
                field.setAccessible(true);
                field.set(t, EntityUtils.castFromSqlType(rs.getObject(columns.get(i).getDbColumnName()),field.getType()));

            }
            al.add(t);
        }
        return al;

        } catch (Exception e) {
            System.out.println("Exceptia este la a patra metoda: "+4);
        }


        return null;
    }

}