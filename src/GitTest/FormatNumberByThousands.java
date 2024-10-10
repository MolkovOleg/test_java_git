package GitTest;

public class FormatNumberByThousands {
    public static void main(String[] args) {
        String number = "12345678";
        String delimeter = ",";

        String formattedNumber = formatNumberWithDelimeter(number, delimeter);

        System.out.println(formattedNumber);

    }

    public static String formatNumberWithDelimeter(String number, String delimeter) {
        StringBuilder formattedNumber = new StringBuilder();

        int length = number.length();
        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            char currentChar = number.charAt(i);
            formattedNumber.append(currentChar);

            count++;

            if (count % 3 == 0 && i != 0) {
                formattedNumber.append(delimeter);
            }
        }
        return formattedNumber.reverse().toString();
    }
}
