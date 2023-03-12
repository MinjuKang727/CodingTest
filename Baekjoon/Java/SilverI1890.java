package zero_base.src.Baekjoon.Java;
// 점프
// https://www.acmicpc.net/problem/1890

/*
입력1:
4
2 3 3 1
1 2 1 3
1 2 3 1
3 1 1 0
출력1: 3
*/

import java.util.Arrays;
import java.util.Scanner;

class BoardGame {
    int wayCnt = 0;
    int size;
    int[][] gameBoard;


    BoardGame(int[][] gameBoard) {
        this.gameBoard = gameBoard;
        this.size = this.gameBoard.length;
    }

    public void findWay(int[] rowColIdx) {
        int move = this.gameBoard[rowColIdx[0]][rowColIdx[1]];

        if (move == 0) {
            this.wayCnt++;
        }

        if (rowColIdx[0] + move < this.size) {
            rowColIdx[0] += move;
            this.findWay(rowColIdx);
        }

        if (rowColIdx[1] + move < this.size) {
            rowColIdx[1] += move;
            this.findWay(rowColIdx);
        }
    }
}
public class SilverI1890 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int move = sc.nextInt();
                board[i][j] = move;
            }
            sc.nextLine();
        }

        BoardGame boardGame = new BoardGame(board);

        int[] start = {0, 0};
        boardGame.findWay(start);
        System.out.println(boardGame.wayCnt);
    }
}
