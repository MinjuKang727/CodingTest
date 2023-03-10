package zero_base.src.Baekjoon.Java;
// 괄호 - Clear!
// https://www.acmicpc.net/problem/9012

/*
입력1:
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(

출력1:
NO
NO
YES
NO
YES
NO

입력2:
3
((
))
())(()

출력2:
NO
NO
NO
 */
import java.util.LinkedList;
import java.util.Scanner;
public class SilverIV_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        String[] vpsFlags = new String[T];
        LinkedList list = new LinkedList();

        for (int i = 0; i < T; i++) {
            String VPS = sc.nextLine();
            String VPSFlag = "YES";
            for (String bracket: VPS.split("")) {
                if (bracket.equals("(")) {
                    list.add("(");
                } else if (!list.isEmpty()) {
                    if (list.peek().equals("(")) {
                        list.poll();
                    } else {
                        VPSFlag = "NO";
                        break;
                    }
                } else {
                    VPSFlag = "NO";
                    break;
                }
            }

            if (!list.isEmpty()) {
                VPSFlag = "NO";
            }

            vpsFlags[i] = VPSFlag;
            list.clear();
        }

        for (String tf: vpsFlags) {
            System.out.println(tf);
        }

    }
}
