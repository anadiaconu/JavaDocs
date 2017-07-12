package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ana.Diaconu on 12-Jul-17.
 */
public class EntityUtils {

    public EntityUtils() {
        throw new UnsupportedOperationException();
    }

    public static String getTableName(Class entity){
        return ((Table)entity.getAnnotation(Table.class)).name();
    }

    public static List<String> getColumns(Class entity){
        List ColumnInfoList = new ArrayList<>();
        Field [] fields = entity.getDeclaredFields();
        for(int i=0; i<fields.length; i++) {
            ColumnInfo co = new ColumnInfo();
           if(fields[i].isAnnotationPresent(Column.class)) {
               co.setDbColumnName(fields[i].getAnnotation(Column.class).name());
               co.setColumnType(fields[i].getType());
               co.setColumnName(fields[i].getName());
               co.setId(false);
           }
           if(fields[i].isAnnotationPresent(Id.class)){
               co.setDbColumnName(fields[i].getAnnotation(Id.class).name());
               co.setColumnType(fields[i].getType());
               co.setColumnName(fields[i].getName());
               co.setId(true);
            }
            if(co != null)
                ColumnInfoList.add(co);
        }
        return ColumnInfoList;
    }

    public static Object castFromSqlType(Object value, Class wantedType){
        if(value == null) return value;
        if(value instanceof BigDecimal){
            BigDecimal bd = (BigDecimal) value;
            if (wantedType.getClass().equals(Integer.TYPE)) return bd.intValue();
            if(wantedType.getClass().equals(Long.TYPE)) return bd.longValue();
            if(wantedType.getClass().equals(Float.TYPE)) return bd.floatValue();
            if(wantedType.getClass().equals(Double.TYPE)) return bd.doubleValue();
        }
        return value;
    }

    public static List<Field> getFieldsByAnnotations (Class clazz, Class annotation){
        List flds = new ArrayList<>();
        Field [] fields = clazz.getDeclaredFields();
        for(int i = 0; i<fields.length; i++)
            if(fields[i].isAnnotationPresent(annotation))
                flds.add(fields[i].getName());
        return flds;

    }

    public static Object getSqlValue (Object object) {
        if (object.getClass().isAnnotationPresent(Table.class)) {
            Field[] fields = object.getClass().getDeclaredFields();
            for(int i=0; i<fields.length; i++){
                if(fields[i].isAnnotationPresent(Id.class)) {
                    fields[i].setAccessible(true);
                    return fields[i];
                }
            }

        }
        return object;
    }
}
