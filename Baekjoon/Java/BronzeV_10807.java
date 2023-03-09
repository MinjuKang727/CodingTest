package zero_base.src.Baekjoon;
/*
10807번 개수 세기

입력1:
11
1 4 1 2 4 2 4 2 3 4 4
2
출력1: 3

입력2:
11
1 4 1 2 4 2 4 2 3 4 4
5
출력2: 0
*/
import java.util.Scanner;
class BronzeV_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        sc.nextLine();
        int V = sc.nextInt();
        sc.nextLine();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (nums[i] == V) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}