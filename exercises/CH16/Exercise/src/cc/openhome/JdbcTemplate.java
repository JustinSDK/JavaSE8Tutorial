package cc.openhome;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    class DefaultPreparedStatementSetter implements PreparedStatementSetter {
        private Object[] params;
        DefaultPreparedStatementSetter(Object[] params) {
            this.params = params;
        }
        @Override
        public void setValues(PreparedStatement ps) throws SQLException {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
        }
    }

    public int update(String sql, final Object... params) {
        return update(sql, new DefaultPreparedStatementSetter(params));
    }

    public int update(String sql, PreparedStatementSetter psst) {
        return ((Integer) execute(sql, psst));
    }

    public List<Map> queryForList(String sql) {
        return queryForList(sql, new Object[]{});
    }

    public List<Map> queryForList(String sql, final Object... params) {
        return queryForList(sql, new DefaultPreparedStatementSetter(params));
    }

    public List<Map> queryForList(String sql, PreparedStatementSetter psst) {
        return (List<Map>) execute(sql, psst);
    }

    public Object execute(String sql, PreparedStatementSetter psst) {
        Object result;
        try(Connection conn = dataSource.getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            psst.setValues(stmt);
            if (stmt.execute()) {
                result = rows(stmt);
            } else {
                result = stmt.getUpdateCount();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private List<Map> rows(PreparedStatement stmt) throws SQLException {
        ResultSet rs = stmt.getResultSet();
        List<String> columnNames = columnNames(rs);
        
        List<Map> rows = new ArrayList<>();
        while (rs.next()) {
            Map<String, Object> row = new HashMap();
            for (String columnName : columnNames) {
                row.put(columnName, rs.getObject(columnName));
            }
            rows.add(row);
        }
        return rows;
    }

    private List<String> columnNames(ResultSet rs) throws SQLException {
        List<String> columnNames = new ArrayList<>();
        ResultSetMetaData meta = rs.getMetaData();
        int columnCount = meta.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            columnNames.add(meta.getColumnName(i));
        }
        return columnNames;
    }
}
