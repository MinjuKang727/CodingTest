package zero_base.src.Baekjoon.Java;
// 팰린드롬 만들기 - Clear!
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

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SilverII_1254 {

    public static boolean palindromeCK(String palindromeFront, String palindromeBack, boolean lenOfPalindromeOddFlag) {
        if (palindromeFront.startsWith(palindromeBack)) {
            if (lenOfPalindromeOddFlag == true) {
                System.out.println(palindromeFront.length() * 2 + 1);
                return true;
            } else {
                System.out.println(palindromeFront.length() * 2);
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean palindromeFlag = true;

        int centerIdx = S.length() / 2;
        boolean lenOfPalindromeOddFlag = false;

        do {
            lenOfPalindromeOddFlag = false;
            String palindromeFront = Arrays.stream(S.substring(0, centerIdx).split("")).reduce("", (x, y) -> y + x);
            String palindromeBack = Arrays.stream(S.substring(centerIdx).split("")).collect(Collectors.joining(""));

            palindromeFlag = palindromeCK(palindromeFront, palindromeBack, lenOfPalindromeOddFlag);

            if (palindromeFlag == true) {
                return;
            } else {
                lenOfPalindromeOddFlag = true;
                palindromeFront = Arrays.stream(S.substring(0, centerIdx).split("")).reduce("", (x, y) -> y + x);
                palindromeBack = Arrays.stream(S.substring(centerIdx + 1).split("")).collect(Collectors.joining(""));

                palindromeFlag = palindromeCK(palindromeFront, palindromeBack, lenOfPalindromeOddFlag);

                if (palindromeFlag == true) {
                    return;
                } else {
                    centerIdx++;
                }
            }
        } while (palindromeFlag == false);
    }
}
