package zero_base.src.Baekjoon.Java;
// **터렛 - Clear!
// https://www.acmicpc.net/problem/1002

/*
입력1:
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5

출력1:
2
1
0
*/

import java.util.Scanner;
public class SilverIII1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        int x1, y1, r1, x2, y2, r2;
        int[] locCnt = new int[T];

        for (int i = 0 ; i < T; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();
            sc.nextLine();

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) {
                    locCnt[i] = -1;
                    continue;
                } else {
                    locCnt[i] = 0;
                    continue;
                }
            }

            double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            int maxR = Math.max(r1, r2);
            int minR = Math.min(r1, r2);

            if (distance < maxR) {
                if (distance + minR < maxR) {
                    locCnt[i] = 0;
                } else if (distance + minR == maxR) {
                    locCnt[i] = 1;
                } else {
                    locCnt[i] = 2;
                }
            } else {
                if (distance < r1 + r2) {
                    locCnt[i] = 2;
                } else if (distance == r1 + r2) {
                    locCnt[i] = 1;
                } else {
                    locCnt[i] = 0;
                }
            }
        }

        for (int cnt: locCnt) {
            System.out.println(cnt);
        }
    }
}
