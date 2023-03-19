import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task 1 & 2
        int [] weights = new int [] {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.print(weights[i]+ ", ");}

        double[] higt = new double[]{1.57, 7.654, 9.986};
        for (int u = 0; u < 3; u++) {
            System.out.print(higt[u]+ ", ");}

        int[] width = new int[]{15, 14, 13, 12, 11, 10, 9, 8};
        for (int y = 0; y < 8; y++) {
            System.out.print(width[y] + ", ");}
        System.out.println( );


        // Task 3
        int [] weights1 = new int [] {1, 2, 3};
        for (int x = 2; x > -1; x--) {
            System.out.print(weights1[x]+ ", ");}

        double[] higt1 = new double[]{1.57, 7.654, 9.986};
        for (int z = 2; z > -1; z--) {
            System.out.print(higt1[z]+ ", ");}

        int[] width1 = new int[]{15, 14, 13, 12, 11, 10, 9, 8};
        for (int w = 7; w > -1; w--) {
            System.out.print(width1[w] + ", ");}

        System.out.println();
        // Task 4

        int [] weight = new int [] {1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0 );{
                weight[i]++;
                System.out.println(Arrays.toString(weight));
            }
        }



    }



}



