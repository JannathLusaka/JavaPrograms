import java.util.Scanner;

public class CheckBinaryString {
    public static void main(String[] args) {
        System.out.println("Enter a binary number: ");
        Scanner scanner=new Scanner(System.in);
        String binaryNum= scanner.next();
        boolean isBinary=true;
        for(int i=0; i<binaryNum.length();i++){
            if(binaryNum.charAt(i)!='1' && binaryNum.charAt(i)!='0')
                isBinary=false;
            }
        System.out.println(isBinary);
        }
    }

