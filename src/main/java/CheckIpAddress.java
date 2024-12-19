import java.util.Scanner;

public class CheckIpAddress {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter IP Adress: ");
        String ipAddress= scanner.next();

        String[] subIP=ipAddress.split("\\.");

        boolean isValid=true;

        if (subIP.length != 4) {
            isValid = false;
        } else {
            for (int i = 0; i < subIP.length; i++) {
                String part = subIP[i];
                if (i == 0) {
                    if (part.startsWith("0") || part.length() == 1) {
                        isValid = false;
                        break;
                    }
                }
            }
        }
        if(isValid){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

    }
}
