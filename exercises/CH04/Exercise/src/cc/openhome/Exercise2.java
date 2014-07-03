package cc.openhome;

public class Exercise2 {
    public static void main(String args[]) { 
        final int N = 52; 
        int[] poker = new int[N + 1]; 

        for(int i = 1; i <= N; i++) {
            poker[i] = i; 
        }

        for(int i = 1; i <= N; i++) { 
            int j = (int) (Math.random() * N);
            j = j == 0 ? 1 : j;
            int tmp = poker[i]; 
            poker[i] = poker[j]; 
            poker[j] = tmp; 
        } 

        char[] symbols = {'桃', '心', '磚', '梅'};
        
        for(int i = 1; i <= N; i++) { 
            System.out.print(symbols[(poker[i] - 1) / 13]);

            int remain = poker[i] % 13; 
            switch(remain) { 
                case  0: System.out.print(" K"); break; 
                case 12: System.out.print(" Q"); break; 
                case 11: System.out.print(" J"); break; 
                default: System.out.printf("%2d", remain); 
            } 
            System.out.printf("%c", i % 13 == 0 ? '\n' : ' '); 
        } 
    }     
}
