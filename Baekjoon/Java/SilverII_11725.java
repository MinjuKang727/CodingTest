package zero_base.src.Baekjoon.Java;

// 백준 11725번 : 트리의 부모 찾기
// https://www.acmicpc.net/problem/11725
/*
입력1:
7
1 6
6 3
3 5
4 1
2 4
4 7
출력1:
4
6
1
3
1
4

입력2:
12
1 2
1 3
2 4
3 5
3 6
4 7
4 8
5 9
5 10
6 11
6 12

출력2:
1
1
2
3
3
4
4
5
5
6
6
*/


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class SilverII_11725 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        HashMap parentOfNode = new HashMap();
        parentOfNode.put("1", null);

        LinkedList<LinkedList> noParentNodes = new LinkedList();

        for (int i = 0; i < N - 1; i++) {
            String[] nodes = sc.nextLine().split(" ");

            if (parentOfNode.containsKey(nodes[0])) {
                parentOfNode.put(nodes[1], nodes[0]);
            } else if (parentOfNode.containsKey(nodes[1])) {
                parentOfNode.put(nodes[0], nodes[1]);
            } else {
                for (LinkedList list: noParentNodes) {
                    if (list.getFirst().equals(nodes[0])) {
                        list.addFirst(nodes[1]);
                        break;
                    } else if (list.getFirst().equals(nodes[1])) {
                        list.addFirst(nodes[0]);
                        break;
                    } else if (list.getLast().equals(nodes[0])) {
                        list.addLast(nodes[1]);
                        break;
                    } else if (list.getLast().equals(nodes[1])) {
                        list.addLast(nodes[0]);
                        break;
                    } else {
                        LinkedList temp = new LinkedList();

                        temp.add(nodes[0]);
                        temp.add(nodes[1]);

                        noParentNodes.add(temp);
                    }
                }
            }
        }

        while (noParentNodes.size() > 0) {
            String[] nodes = (String[])noParentNodes.poll();

            if (parentOfNode.containsKey(nodes[0])) {
                parentOfNode.put(nodes[1], nodes[0]);
            } else if (parentOfNode.containsKey(nodes[1])) {
                parentOfNode.put(nodes[0], nodes[1]);
            } else {
                noParentNodes.add(nodes);
            }
        }

        for (int i = 2; i <= N; i++) {
            System.out.println(parentOfNode.get(String.valueOf(i)));
        }
    }
}
