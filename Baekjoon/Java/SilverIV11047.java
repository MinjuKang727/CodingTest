package zero_base.src.Baekjoon.Java;
// 동전0 - Clear!
// https://www.acmicpc.net/problem/11047

/*
입력1:
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
출력1: 6

입력2:
10 4790
1
5
10
50
100
500
1000
5000
10000
50000
출력2: 12
*/


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SilverIV11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int moneyCnt = 0;

        LinkedList moneyTypes = new LinkedList();

        for (int i = 0; i < N; i++) {
            moneyTypes.addFirst(Integer.parseInt(sc.nextLine()));
        }
        Collections.sort(moneyTypes, Collections.reverseOrder());

        while (K != 0) {
            int money = (int)moneyTypes.poll();
            moneyCnt += K / money;
            K %= money;
        }
        System.out.println(moneyCnt);
    }
}
