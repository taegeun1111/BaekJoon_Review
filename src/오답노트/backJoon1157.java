package 오답노트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backJoon1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //알파벳 : 26
        String str[] = new String[]{"A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // aAz BBxxabc
        String input = br.readLine();

        String[] split = input.toUpperCase().split("");

        //카운트를 세는 법은? //제일 많은 수를 반환???? //2
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (split[i].equals(str[j])){
//                    split[i]
                }
            }
        }

    }
}
