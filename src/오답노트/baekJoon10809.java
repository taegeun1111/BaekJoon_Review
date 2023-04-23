package 오답노트;

import java.io.IOException;
import java.util.Scanner;

public class baekJoon10809 {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[i] == -1){
                arr[ch -'a'] = i;
            }
        }

        for (int var : arr ) {
            System.out.print(var+" ");
        }


    }
}
