package leetcode.easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if ( i != 0 && s.charAt(i) == 'M' && s.charAt(i - 1) == 'C') {
                sum += 900;
                continue;
            }
            if (s.charAt(i) == 'M') {
                sum += 1000;
                continue;
            }
            if (i != 0 && s.charAt(i) == 'D' && s.charAt(i - 1) == 'C') {
                sum += 400;
                continue;
            }
            if (s.charAt(i) == 'D') {
                sum += 500;
                continue;
            }
            if (i != 0 && s.charAt(i) == 'C' && s.charAt(i - 1) == 'X') {
                sum += 90;
                continue;
            }
            if (s.charAt(i) == 'C') {
                if((i + 1 != s.length()) && (s.charAt(i + 1) == 'D' ||  s.charAt(i + 1) == 'M')){
                    continue;
                }
                sum += 100;
                continue;
            }
            if (i != 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'X') {
                sum += 40;
                continue;
            }
            if (s.charAt(i) == 'L') {
                sum += 50;
                continue;
            }
            if (i != 0 && s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') {
                sum += 9;
                continue;
            }
            if (s.charAt(i) == 'X') {
                if ((i + 1 != s.length()) && (s.charAt(i + 1) == 'L' ||  s.charAt(i + 1) == 'C')){
                    continue;
                }
                sum += 10;
                continue;
            }
            if (i != 0 && s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') {
                sum += 4;
                continue;
            }
            if (s.charAt(i) == 'V') {
                sum += 5;
                continue;
            }
            if (s.charAt(i) == 'I') {
                if((i + 1 != s.length()) && (s.charAt(i + 1) == 'V' ||  s.charAt(i + 1) == 'X')){
                    continue;
                }
                sum += 1;
            }
        }
        return sum;
    }
}
