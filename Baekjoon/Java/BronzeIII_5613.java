package zero_base.src.Baekjoon;
// 백준(5613) 계산기 프로그램
/*
입력1:
1
+
1
=
출력1: 2

입력2:
10
-
21
*
5
=
출력2: -55

입력3:
100
/
3
*
3
=
출력3: 99

*/

import java.util.Scanner;

public class BronzeIII_5613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        sc.nextLine();
        String oper = "";

        while (!oper.equals("=")) {
            oper = sc.nextLine();

            if (oper.equals("*")) {
                answer *= sc.nextInt();
                sc.nextLine();
            } else if (oper.equals("/")) {
                answer /= sc.nextInt();
                sc.nextLine();
            } else if (oper.equals("+")) {
                answer += sc.nextInt();
                sc.nextLine();
            } else if (oper.equals("-")) {
                answer -= sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.println(answer);

    }
}
