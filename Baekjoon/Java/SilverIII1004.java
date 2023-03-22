package zero_base.src.Baekjoon.Java;
// 어린왕자
// https://www.acmicpc.net/problem/1004

/*
입력1:
2
-5 1 12 1
7
1 1 8
-3 -1 1
2 2 2
5 5 1
-4 5 1
12 1 1
12 1 2
-5 1 5 1
1
0 0 2
출력1:
3
0

입력2:
3
-5 1 5 1
3
0 0 2
-6 1 2
6 2 2
2 3 13 2
8
-3 -1 1
2 2 3
2 3 1
0 1 7
-4 5 1
12 1 1
12 1 2
12 1 3
102 16 19 -108
12
-107 175 135
-38 -115 42
140 23 70
148 -2 39
-198 -49 89
172 -151 39
-179 -52 43
148 42 150
176 0 10
153 68 120
-56 109 16
-187 -174 8
출력2:
2
5
3
*/

import java.util.Scanner;
public class SilverIII1004 {

    public static boolean inFlag (int x1, int y1, int c_x, int c_y, int r) {
        if (Math.sqrt((x1 - c_x) * (x1 - c_x) + (y1 - c_y) * (y1 - c_y)) < r) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int x1, y1, x2, y2, planetCnt;
        int[] result = new int[T];

        for (int i = 0; i < T; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            sc.nextLine();
            planetCnt = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < planetCnt; j++) {
                int c_x = sc.nextInt();
                int c_y = sc.nextInt();
                int r = sc.nextInt();
                sc.nextLine();
                boolean inFlag;

                if (inFlag(x1, y1, c_x, c_y, r) != inFlag(x2, y2, c_x, c_y, r)) {
                    result[i]++;
                }
            }
        }

        for (int cnt: result) {
            System.out.println(cnt);
        }
    }
}
