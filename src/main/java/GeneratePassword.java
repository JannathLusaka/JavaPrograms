import java.util.Arrays;
import java.util.Random;

public class GeneratePassword {

    public static void main(String[] args) {
        String upperStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerStr = "abcdefghijklmnopqrstuvwxyz";
        String digitStr = "0123456789";
        String specialStr = "@#$%^&*";
        String allStr = upperStr + lowerStr + digitStr + specialStr;

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        char[] upChars = upperStr.toCharArray();
        char[] lowChars = lowerStr.toCharArray();
        char[] digitChars = digitStr.toCharArray();
        char[] specialChars = specialStr.toCharArray();
        char[] allChars = allStr.toCharArray();


        char[] pass = new char[8];

        pass[0] = upChars[random.nextInt(upChars.length)];
        pass[1] = lowChars[random.nextInt(lowChars.length)];
        pass[2] = digitChars[random.nextInt(digitChars.length)];
        pass[3] = specialChars[random.nextInt(specialChars.length)];


        for (int i = 4; i < pass.length; i++) {
            pass[i] = allChars[random.nextInt(allChars.length)];
        }

        for(int i=0;i< pass.length;i++) {
            int index = random.nextInt(pass.length);
            char temp = pass[index];
            pass[index] = pass[i];
            pass[i] = temp;
        }
        System.out.println(new String(pass));

    }
}
