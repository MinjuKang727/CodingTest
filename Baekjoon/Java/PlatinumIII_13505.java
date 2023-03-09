package zero_base.src.Baekjoon;
/*
13505번 - 두 수 XOR
https://www.acmicpc.net/problem/13505

입력1:
5
1 2 3 4 5
출력1: 7

입력2:
5
0 1 0 1 0
출력2: 1

입력3:
6
1 2 4 8 16 32
출력3: 48
*/

import zero_base.src.com.eightcruz.javastudy.CompareArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PlatinumIII_13505 {
//    public static int getXOR(int n1, int n2) {
//        int result = 0;
//        int exp = 0;
//
//        while (n1 != 0 || n2 != 0) {
//            if ((n1 == 0 && n2 % 2 == 1) || (n2 == 0 && n1 % 2 == 1) || n1 % 2 != n2 % 2) {
//                result += Math.pow(2, exp);
//            }
//            n1 /= 2;
//            n2 /= 2;
//            exp++;
//        }
//        return result;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int[] nums0 = new int[N];
        for (int i = 0; i < N; i++) {
            nums0[i] = sc.nextInt();
        }
        sc.nextLine();

        int[] nums = Arrays.stream(nums0).distinct().sorted().toArray();
        N = nums.length;
        int maxXOR = 0;

        for (int i = N; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
//                int temp = getXOR(nums[i], nums[j]);
                if (nums[i] + nums[j] < maxXOR) {
                    continue;
                }
                int temp = nums[i] ^ nums[j];
                if (temp > maxXOR) {
                    maxXOR = temp;
                }
            }
        }
        System.out.println(maxXOR);
    }
}
