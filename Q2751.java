import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int i : list) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);

    }
}
