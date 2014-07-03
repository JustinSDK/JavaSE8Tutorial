package cc.openhome;

import java.io.*;
import javax.sql.rowset.*;

public class TMessageUtil {
    public static void writeXml(OutputStream outputStream)
                                throws Exception {
        try(WebRowSet rowset =
                           RowSetProvider.newFactory().createWebRowSet()) {
            rowset.setUrl("jdbc:mysql://localhost:3306/demo");
            rowset.setUsername("root");
            rowset.setPassword("openhome");
            rowset.setCommand("SELECT * FROM t_message");
            rowset.execute();
            rowset.writeXml(outputStream);
        }
    }
    public static void main(String[] args) throws Exception {
        TMessageUtil.writeXml(System.out);
    }
}
