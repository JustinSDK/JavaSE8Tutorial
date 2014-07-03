package cc.openhome;
import java.util.*;
public class Exercise2 {
   public static void main(String[] args) {
       String[] words = {"RADAR","WARTER START","MILK KLIM","RESERVERED","IWI"};
       for(String word : words) {
           if(isReversedWord(word)) {
               System.out.println(word);
           }
       }
    }   

    private static boolean isReversedWord(String word) {
        Deque<Character> characterDeque = toDeque(word.toCharArray());
        Character c1, c2;
        while((c1 = characterDeque.pollFirst()) != null && (c2 = characterDeque.pollLast()) != null) {
            if(!c1.equals(c2)) {
                return false;
            }
        }
        return true;
    }

    private static Deque<Character> toDeque(char[] cs) {
        Deque<Character> deque = new LinkedList<>();
        for(Character c : cs) {
            deque.offer(c);
        }
        return deque;
    }
}
