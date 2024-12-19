import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchCgpa {
    public static void main(String[] args) {
        double[] cgpa= {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        for(int i=0; i< cgpa.length;i++) {
            for (int j = i + 1; j < cgpa.length; j++) {
                if (cgpa[i] > cgpa[j]) {
                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;

                }
            }
        }


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your CGPA: ");
        double targetCgpa= scanner.nextDouble();
        int value=  binarySeach(cgpa,targetCgpa);
        if(value != -1){
            System.out.println("Target found");
        }
        else{
            System.out.println("not found");
        }

    }
    public static int binarySeach(double[] cgpa, double targetCgpa){
        int left=0;
        int right=cgpa.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(cgpa [mid]==targetCgpa){
                return mid;
            }
            if(cgpa [mid]<targetCgpa){
                left=mid+1;
            }
            else {
                right=mid-1;
            }

        }
        return -1;
    }
}
