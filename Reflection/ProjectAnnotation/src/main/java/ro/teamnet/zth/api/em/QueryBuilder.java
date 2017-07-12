package ro.teamnet.zth.api.em;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Ana.Diaconu on 12-Jul-17.
 */
public class QueryBuilder {

    private QueryType queryType;
    private Object tableName;
    private List <ColumnInfo> queryColumns;
    private List <Condition> conditions;

    public String getValueForQuery(Object value) {
        if (value instanceof String) return "'" + value + "'";
        if (value instanceof Date) {
            DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
            return "TO_DATE('" + dateFormat.format((Date) value) + "','mm-dd-YYYY'";
        }
        return value.toString();
    }

//    public QueryBuilder addCondition (Condition condition){
//        conditions.add(condition);
//    }



}
