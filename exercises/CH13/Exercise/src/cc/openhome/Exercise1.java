package cc.openhome;

import static java.lang.System.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.*;

public class Exercise1 {
    public static void main(String[] args) {
        // 今天
        Calendar calendar = Calendar.getInstance();
        showTitle(calendar);
        showDate(calendar);
    }

    private static void showTitle(Calendar calendar) {
        out.printf("%n%s%n%n", new SimpleDateFormat("yyyy-MM-dd EE")
                .format(calendar.getTime()));
        
        String[] weekDays = {"日", "一", "二", "三", "四", "五", "六"};
        for(String weekDay : weekDays) {
            out.printf("%s ", weekDay);
        }
        out.println();
    }
    
    private static void showDate(Calendar calendar) {
        Calendar cal = (Calendar) calendar.clone();
        // 今天是本月第幾天
        int dayOfMonth = cal.get(DAY_OF_MONTH);
        // 將月曆設為本月第一天
        cal.add(DAY_OF_MONTH, -dayOfMonth + 1);
        // 日曆現在是星期幾，注意get()傳回值是對應Calendar的列舉值
        // dayOfWeek 是用來排版用的
        int dayOfWeek = cal.get(DAY_OF_WEEK);
        // 顯示星期描述
        out.printf("%" + (2 * (dayOfWeek + 1)) + "s", "");
        for(int i = 1; i <= cal.getMaximum(DAY_OF_MONTH); 
                i++, dayOfWeek++) {
            out.printf("%2d ", i);
            if((dayOfWeek % 7) == 0) {
                out.println();
            }
        }
    }
}
