package study.kyu4;

public class Runes {

    public static int solveExpression(final String expressions) {
        int missingDigit = -1;
        char operator = ' ';
        String expression = expressions + " ";
        expression.replace("-", "+");
        String[] answer = new String[]{"", "", ""};
        int[] subAnswer = new int[3];
        int num = 0;
        for (int i = 0; i < expression.length() - 1; i++) {
            if (expression.charAt(i) != '*' && expression.charAt(i) != '+' && (expression.charAt(i) != '-' || expression.charAt(i + 1) != '-') && expression.charAt(i) != '=')
                answer[num] += expression.charAt(i);
            else if (expression.charAt(i) == '*' ||
                    expression.charAt(i) == '+' ||
                    (expression.charAt(i) == '-' &&
                            expression.charAt(i - 1) == '-') ||
                    expression.charAt(i) != '=') {
                operator = expressions.charAt(i);
                subAnswer[num] = answer[num].indexOf("?");
                num++;
            } else {
                subAnswer[num] = answer[num].indexOf("?");
                num++;
            }
        }
        subAnswer[num] = answer[num].indexOf("?");
        if (operator == '*') {
            int choice = 0;
            if ((answer[2].charAt(0) == '?' && answer[2].length() != 1) ||
                    (answer[1].charAt(0) == '?' && answer[1].length() != 1) ||
                    (answer[0].charAt(0) == '?' && answer[0].length() != 1)) choice = 1;
            for (int i = choice; i <= 9; i++) {
                    int a = Integer.parseInt(answer[0].replace('?', (char) (48 + i)));
                    int b = Integer.parseInt(answer[1].replace('?', (char) (48 + i)));
                    int c = Integer.parseInt(answer[2].replace('?', (char) (48 + i)));
                    if (a * b == c) {
                        return i;
                    }
                }
        }
        else if (operator == '+')
            for (int i = 0; i <= 9; i++) {
                int a = Integer.parseInt(answer[0].replace('?', (char) (48 + i)));
                int b = Integer.parseInt(answer[1].replace('?', (char) (48 + i)));
                int c = Integer.parseInt(answer[2].replace('?', (char) (48 + i)));

                if (a + b == c) {
                    return i;
                }
            }
        else if (operator == '-')
            for (int i = 0; i <= 9; i++) {
                int a = Integer.parseInt(answer[0].replace('?', (char) (48 + i)));
                int b = Integer.parseInt(answer[1].replace('?', (char) (48 + i)));
                int c = Integer.parseInt(answer[2].replace('?', (char) (48 + i)));

                if (a - b == c && answer[2].charAt(0) != '?'
                        && answer[1].charAt(0) != '?'
                        && answer[0].charAt(0) != '?') {
                    return i;
                }
            }
        return missingDigit;
    }
}