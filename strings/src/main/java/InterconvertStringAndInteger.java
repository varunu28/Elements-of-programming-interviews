public class InterconvertStringAndInteger {

    /*
    7.1
    */

    public static Integer stringToInt(String number) {
        int sign = 1;
        int idx = 0;
        int n = number.length();
        if (idx < n && !Character.isDigit(number.charAt(idx))) {
            sign = number.charAt(idx) == '-' ? -1 : 1;
            idx++;
        }
        int num = 0;
        while (idx < n) {
            num = num * 10 + number.charAt(idx) - '0';
            idx++;
        }
        return sign * num;
    }

    public static String intToString(Integer number) {
        StringBuilder sb = new StringBuilder();
        int sign = 1;
        if (number < 0) {
            sign = -1;
            number = Math.abs(number);
        }
        while (number > 0) {
            sb.append(number % 10);
            number /= 10;
        }
        String ans = sb.length() == 0 ? "0" : sb.reverse().toString();
        String appendSign = sign == -1 && !ans.equals("0") ? "-" : "";
        return appendSign + ans;
    }
}
