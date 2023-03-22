package zero_base.src.Baekjoon.Java;
// 피보나치 함수
// https://www.acmicpc.net/problem/1003

/*
입력1:
3
0
1
3
출력1:
1 0
0 1
1 2

입력2:
2
6
22
출력2:
5 8
10946 17711
*/

import java.util.*;

public class SilverIII1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        LinkedList Ns = new LinkedList();
        int[][] result = new int[T][2];
        LinkedList temp = new LinkedList();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            sc.nextLine();
            Ns.add(N);

            if (N == 0) {
                result[i][0] = 1;
                result[i][1] = 0;
            } else if (N == 1) {
                result[i][0] = 0;
                result[i][1] = 1;
            } else {
                temp.add(N);
            }
        }

        Collections.sort(temp);

        int[] before0 = {1, 0};
        int[] before1 = {0, 1};
        int[] cur = {before0[0] + before1[0], before0[1] + before1[1]};
        int N = 2;

        while (!temp.isEmpty()) {
            int n = (int)temp.poll();

            while (N < n) {
                N++;
                before0 = before1.clone();
                before1 = cur.clone();
                cur[0] = before0[0] + before1[0];
                cur[1] = before0[1] + before1[1];
            }

            result[Ns.indexOf(n)][0] = cur[0];
            result[Ns.indexOf(n)][1] = cur[1];
        }

        for (int[] cnt: result) {
            System.out.println(cnt[0] + " " + cnt[1]);
        }
    }
}
