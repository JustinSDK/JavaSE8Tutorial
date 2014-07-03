package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;

public class MemberDemo {
    public static void main(String[] args) throws IOException {
        Member[] members = {
                    new Member("B1234", "Justin", 90), 
                    new Member("B5678", "Monica", 95), 
                    new Member("B9876", "Irene", 88)
        };
        for(Member member : members) {
            member.save();
        }
        out.println(Member.load("B1234"));
        out.println(Member.load("B5678"));
        out.println(Member.load("B9876"));
    }
}
