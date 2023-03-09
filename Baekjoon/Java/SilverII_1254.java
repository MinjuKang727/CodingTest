package zero_base.src.Baekjoon.Java;
// 팰린드롬 만들기
// https://www.acmicpc.net/problem/1254
/*
입력1: abab
출력1: 5

입력2: abacaba
출력2: 7

입력3: qwerty
출력3: 11

입력4: abdfhdyrbdbsdfghjkllkjhgfds
출력4: 38
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SilverII_1254 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int centerIdx = S.length() / 2 - 1;
        LinkedList<Character> postPalindrome = new LinkedList<>();

        if (centerIdx >= S.length() / 2) {
            for (int i = 0; i < centerIdx; i++) {
                postPalindrome.addFirst(S.charAt(i));
            }
            for (int i = centerIdx + 1; i < S.length(); i++) {
                if ((char)postPalindrome.peek() == S.charAt(i)) {
                    postPalindrome.poll();
                } else {
                    break;
                }
            }

            if (postPalindrome.size() == 0) {

            }
        }

//        do {
//            palindromeFlag = true;
//
//            for (int i = 1; i <= centerIdx + 1; i++) {
//                if (centerIdx + i < S.length()) {
//                    if (S.charAt(centerIdx - i + 1) != S.charAt(centerIdx + i)) {
//                        palindromeFlag = false;
//                        centerIdx++;
//                        break;
//                    }
//                } else if (centerIdx + i >= S.length() && palindromeFlag == true){
//                    S += S.charAt(i);
//                }
//            }
//
//            if (palindromeFlag == true) {
//                System.out.println(S.length());
//                return;
//            }
//
//            palindromeFlag = true;
//            for (int i = 1; i <= centerIdx; i++) {
//                if (centerIdx + i < S.length()) {
//                    if (S.charAt(centerIdx - i) != S.charAt(centerIdx + i)) {
//                        palindromeFlag = false;
//                        break;
//                    }
//                } else if (centerIdx + i >= S.length() && palindromeFlag == true){
//                    S += S.charAt(i);
//                }
//
//            }
//
//        } while (palindromeFlag == false);
//
//        System.out.println(S.length());

    }
}
