package zero_base.src.Baekjoon.Java;
// 이차원 배열의 합 - Clear
// https://www.acmicpc.net/problem/2167
/*
입력1:
2 3
1 2 4
8 16 32
3
1 1 2 3
1 2 1 2
1 3 2 3
출력1:
63
2
36
*/
    import java.util.Arrays;
    import java.util.Scanner;
    public class SilverV2167 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();
            int[][] arr = new int[N][M];

            for (int i = 0; i < N; i++) {
                int[] temp = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j <M; j++) {
                    arr[i][j] = temp[j];
                }
            }

            int K = sc.nextInt();
            sc.nextLine();
            int[] sumOfArr = new int[K];

            for (int i = 0; i < K; i++) {
                int[] ijxy = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int[] rowRange = {ijxy[0] - 1, ijxy[2] - 1};
                int[] colRange = {Math.min(ijxy[1], ijxy[3]) - 1, Math.max(ijxy[1], ijxy[3]) - 1};

                for (int j = rowRange[0]; j <= rowRange[1]; j++) {
                    for (int k = colRange[0]; k <= colRange[1]; k++) {
                        sumOfArr[i] += arr[j][k];
                    }
                }
            }

            for (int sum: sumOfArr) {
                System.out.println(sum);
            }

        }
    }
