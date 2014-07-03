package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;

public class TMessageInfoDemo {
    public static void main(String[] args) 
            throws IOException, ClassNotFoundException {
        TMessageInfo tMessageInfo = 
                new TMessageInfo(new SimpleConnectionPoolDataSource());
        out.println("名稱\t型態\t為空\t預設");
        tMessageInfo.getAllColumnInfo().forEach(info -> {
            out.printf("%s\t%s\t%s\t%s%n",
                    info.getName(),
                    info.getType(),
                    info.isNullable(),
                    info.getDef());
        });
    }
}
