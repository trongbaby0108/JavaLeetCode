public class RomantoInteger {
    public static int romanToInt(String s) {
        int res = 0;
        s= s+" ";
        for (int i = 0; i < s.length(); i++) {
            String s1 = Character.toString(s.charAt(i));
            StringBuilder temp = new StringBuilder();
            try {
                temp.append(s.charAt(i));
                temp.append(s.charAt(i + 1));
            } catch (Exception ex) {
                return res;
            }
            String s2 = temp.toString();

            if (s1.equals("I")) {
                if (s2.equals("IV")) {
                    res += 4;
                    i++;
                } else if (s2.equals("IX")) {
                    res += 9;
                    i++;
                } else {
                    res += 1;
                }
            }
            if (s1.equals("V")) res += 5;

            if (s1.equals("X")) {
                if (s2.equals("XL")) {
                    res += 40;
                    i++;
                } else if (s2.equals("XC")) {
                    res += 90;
                    i++;
                } else {
                    res += 10;
                }
            }
            if (s1.equals("L")) res += 50;

            if (s1.equals("C")) {
                if (s2.equals("CD")) {
                    res += 400;
                    i++;
                } else if (s2.equals("CM")) {
                    res += 900;
                    i++;
                } else {
                    res += 100;
                }
            }
            if (s1.equals("D")) res += 500;
            if (s1.equals("M")) res += 1000;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("III"));
    }
}
