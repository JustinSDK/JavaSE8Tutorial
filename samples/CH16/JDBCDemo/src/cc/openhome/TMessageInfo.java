package cc.openhome;

import java.sql.*;
import java.util.*;
import javax.sql.DataSource;

public class TMessageInfo {
    private DataSource dataSource;
    
    public TMessageInfo(DataSource dataSource) {
        this.dataSource = dataSource;        
    }
    
    public List<ColumnInfo> getAllColumnInfo() {
        List<ColumnInfo> infos = null;
        try(Connection conn = dataSource.getConnection()) {
            DatabaseMetaData meta = conn.getMetaData();
            ResultSet crs = meta.getColumns("demo", null, "t_message", null);
            infos =  new ArrayList<>();
            while(crs.next()) {
                ColumnInfo info = toColumnInfo(crs);
                infos.add(info);
            }
        } 
        catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return infos;
    }

    private ColumnInfo toColumnInfo(ResultSet crs) throws SQLException {
        ColumnInfo info = new ColumnInfo();
        info.setName(crs.getString("COLUMN_NAME"));
        info.setType(crs.getString("TYPE_NAME"));
        info.setSize(crs.getInt("COLUMN_SIZE"));
        info.setNullable(crs.getBoolean("IS_NULLABLE"));
        info.setDef(crs.getString("COLUMN_DEF"));
        return info;
    }
} 
