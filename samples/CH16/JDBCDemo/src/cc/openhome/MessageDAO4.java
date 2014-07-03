package cc.openhome;

import java.sql.*;
import java.util.*;
import javax.sql.rowset.*;

public class MessageDAO4 {
    private JdbcRowSet rowset;

    public MessageDAO4(
            String url, String user, String passwd) throws SQLException {
        rowset = RowSetProvider.newFactory().createJdbcRowSet();
        rowset.setUrl(url);
        rowset.setUsername(user);
        rowset.setPassword(passwd);
        rowset.setCommand("SELECT * FROM t_message");
        rowset.execute();
    }

    public void add(Message message) throws SQLException {
        rowset.moveToInsertRow();
        rowset.updateString(2, message.getName());
        rowset.updateString(3, message.getEmail());
        rowset.updateString(4, message.getMsg());
        rowset.insertRow();

    }

    public List<Message> get() throws SQLException {
        List<Message> messages = new ArrayList<>();
        rowset.beforeFirst();
        while (rowset.next()) {
            Message message = toMessage();
            messages.add(message);
        }
        return messages;
    }

    private Message toMessage() throws SQLException {
        Message message = new Message();
        message.setId(rowset.getLong(1));
        message.setName(rowset.getString(2));
        message.setEmail(rowset.getString(3));
        message.setMsg(rowset.getString(4));
        return message;
    }

    public void close() throws SQLException {
        if (rowset != null) {
            rowset.close();
        }
    }
}
