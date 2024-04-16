package study.kyu4;

public class Kata {
    public static String sumStrings(String a, String b) {
        StringBuilder aBuilder = new StringBuilder(a);
        StringBuilder bBuilder = new StringBuilder(b);
        while (aBuilder.length() != bBuilder.length()){
            if(aBuilder.length() > bBuilder.length()) bBuilder.insert(0, "0");
            else aBuilder.insert(0, "0");
        }
        b = bBuilder.toString();
        a = aBuilder.toString();
        a = "0" + a;
        b = "0" + b;
        char[] numA = a.toCharArray(), numB = b.toCharArray();
        StringBuilder answer = new StringBuilder();
        int r = 0;
        for(int i = numA.length -1; i >= 0; i--){
            int c = Character.getNumericValue(numA[i]) + Character.getNumericValue(numB[i]);
            if (c + r > 9) {
                answer.insert(0, (c + r) % 10);
                r = (c + r) / 10;
            } else {
                answer.insert(0, (c + r) % 10);
                r = 0;
            }
        }
        while(answer.charAt(0) == '0') answer = new StringBuilder(answer.substring(1));
        return answer.toString();
    }
}
