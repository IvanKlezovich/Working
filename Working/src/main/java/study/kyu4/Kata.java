package study.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata {
    public static String sumStrings(String a, String b) {
        while (a.length() != b.length()){
            if(a.length() > b.length()) b = "0" + b;
            else a = "0" + a;
        }
        a = "0" + a;
        b = "0" + b;
        char[] numA = a.toCharArray(), numB = b.toCharArray();
        String answer = "";
        int r = 0;
        for(int i = numA.length -1; i >= 0; i--){
            int c = Character.getNumericValue(numA[i]) + Character.getNumericValue(numB[i]);
            if (c + r > 9) {
                answer = (c + r) % 10 + answer;
                r = (c + r) / 10;
            } else {
                answer = (c + r) % 10 + answer;
                r = 0;
            }
        }
        while(answer.charAt(0) == '0') answer = answer.substring(1);
        return answer;
    }
    @Test
    public void test() {
        assertEquals("579", sumStrings("123", "456"));
    }
}
