import java.util.Random;

public class RandomNumFindMaxMin {
    public static void main(String[] args) {
        Random random= new Random();
        int[] numbers=new int[10];
        for(int i=0; i< numbers.length; i++){
            numbers[i]= random.nextInt(100);
            System.out.print(numbers[i]+" ");
        }
        int maxNum= numbers[0];
        int minNum= numbers[0];

        for(int j=0; j<numbers.length; j++){
            if(numbers[j]>maxNum){
                maxNum=numbers[j];
            }
            if(numbers[j]<minNum){
                minNum=numbers[j];
            }
        }
        System.out.println();
        System.out.println("Max generated number: "+maxNum);
        System.out.println("Min generated number: "+minNum);

    }
}
