package BOJ_begin;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {

        int num = 0;
        int[] nnum;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        nnum = new int[num];

        for(int i=0; i<num; i++) {
            nnum[i] = sc.nextInt();
        }

        Arrays.sort(nnum);

        for(int i : nnum) {
            System.out.println(i);
        }
    }
}
