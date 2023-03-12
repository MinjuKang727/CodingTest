package zero_base.src.Baekjoon.Java;
// 수들의 합2 - Clear
// https://www.acmicpc.net/problem/2003

/*
입력1:
4 2
1 1 1 1
출력1: 3

입력2:
10 5
1 2 3 4 2 5 3 1 1 2
출력2: 3
*/

import java.util.Arrays;
import java.util.Scanner;

public class SilverIV2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sum = new int[N];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (sum[j] >= M) {
                    continue;
                } else {
                    sum[j] += A[i];
                }
            }
        }

        long result = Arrays.stream(sum).filter(i -> i == M).count();
        System.out.println(result);

    }
}
