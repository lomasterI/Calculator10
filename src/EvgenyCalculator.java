import java.util.Scanner;

public class EvgenyCalculator {

    public static void main(String[] args) {
        char sign;
        int total;
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        sign = in.next().charAt(0);
        String num2 = in.next();
        if (!isNumeric(num1) && !isNumeric(num2)) {
            int number_output1 = RomeInArabian.transform_roman_numeral_to_number(num1);
            int number_output2 = RomeInArabian.transform_roman_numeral_to_number(num2);
            switch (sign) {
                case '+':
                    total = number_output1 + number_output2;
                    int number_input = total;
                    String roman_numeral_output = ArabianInRome.transform_number_to_roman_numeral(number_input);
                    System.out.println(roman_numeral_output);
                    break;
                case '-':
                    total = number_output1 - number_output2;
                    int number_input1 = total;
                    String roman_numeral_output1 = ArabianInRome.transform_number_to_roman_numeral(number_input1);
                    System.out.println(roman_numeral_output1);
                    break;
                case '*':
                    total = number_output1 * number_output2;
                    int number_input2 = total;
                    String roman_numeral_output2 = ArabianInRome.transform_number_to_roman_numeral(number_input2);
                    System.out.println(roman_numeral_output2);
                    break;
                case '/':
                    total = number_output1 / number_output2;
                    int number_input3 = total;
                    String roman_numeral_output3 = ArabianInRome.transform_number_to_roman_numeral(number_input3);
                    System.out.println(roman_numeral_output3);
                    break;
            }

        }
        else  {
            int numeral1 = Integer.parseInt(num1);
            int numeral2 = Integer.parseInt(num2);
            switch (sign) {
                case '+':
                    total = numeral1 + numeral2;
                    System.out.println(total);
                    break;
                case '-':
                    total = numeral1 - numeral2;
                    System.out.println(total);
                    break;
                case '*':
                    total = numeral1 * numeral2;
                    System.out.println(total);
                    break;
                case '/':
                    total = numeral1 / numeral2;
                    System.out.println(total);
                    break;
            }

        }
    }

    private static boolean isNumeric(String num1) {
        if (num1 == null){
            return false;
        }
        try{
            double d = Double.parseDouble(num1);}
        catch (NumberFormatException nfe) {
            return false;}
        return true;
    } }
