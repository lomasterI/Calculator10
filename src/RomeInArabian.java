import java.util.HashMap;
import java.util.Map;

public class RomeInArabian {
    public static int transform_roman_numeral_to_number(String roman_numeral) {
        Map<Character, Integer> roman_char_dict = new HashMap<Character, Integer>();
        roman_char_dict.put('I', 1);
        roman_char_dict.put('V', 5);
        roman_char_dict.put('X', 10);
        roman_char_dict.put('L', 50);
        roman_char_dict.put('C', 100);
        roman_char_dict.put('D', 500);
        roman_char_dict.put('M', 1000);
        int res = 0;
        for (int i = 0; i < roman_numeral.length(); i += 1) {
            if (i == 0 || roman_char_dict.get(roman_numeral.charAt(i)) <= roman_char_dict.get(roman_numeral.charAt(i - 1)))
                res += roman_char_dict.get(roman_numeral.charAt(i));
            else
                res += roman_char_dict.get(roman_numeral.charAt(i)) - 2 * roman_char_dict.get(roman_numeral.charAt(i - 1));
        }
        return res;
    }
}