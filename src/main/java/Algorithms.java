
import java.util.Arrays;


import static java.lang.Math.abs;

public class Algorithms {

    public static String tobinary(int num) {
        String result = "";
        while (num / 2 != 0) {
            result = String.valueOf(num % 2) + result;
            num /= 2;
        }
        if (num == 1)
            result = "1" + result;
        else result = "0";
        return result;
    }

    public static int[] swap(int firstNum, int secondNum) {
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        return new int[]{firstNum, secondNum};
    }

    public static int maxNum(int firstNum, int secondNum) {
        return (firstNum + secondNum + abs(firstNum - secondNum)) / 2;
    }

    public static boolean entryString(String firstString, String secondString) {
        return sortString(firstString).equals(sortString(secondString));
    }

    private static String sortString(String string) {
        char[] charsArray = string.toCharArray();
        Arrays.sort(charsArray);
        return String.valueOf(charsArray);
    }

    public static String rollString(String string) {
        char[] charsArray = string.toCharArray();
        int indexSym = 0;
        String result = "";
        String word = "";
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == ' ') {

                if (i - indexSym >= 5) {
                    word = "";
                    for (int j = i - 1; j >= indexSym; j--) {
                        word += charsArray[j];
                    }
                }
                word += charsArray[i];
                result += word;
                indexSym = i + 1;
                word = "";
            } else if (i == charsArray.length - 1) {
                if (i + 1 - indexSym >= 5) {
                    word = "";
                    for (int j = i; j >= indexSym; j--) {
                        word += charsArray[j];
                    }
                } else word += charsArray[i];
                result += word;
            } else word += charsArray[i];
        }


        return result;
    }


}
