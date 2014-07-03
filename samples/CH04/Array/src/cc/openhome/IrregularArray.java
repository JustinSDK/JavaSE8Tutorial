package cc.openhome;

public class IrregularArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[] {1, 2, 3, 4, 5};
        arr[1] = new int[] {1, 2, 3};
        for(int[] row : arr) {
            for(int value : row) {
                System.out.printf("%2d", value);
            }
            System.out.println();
        }
    }
}