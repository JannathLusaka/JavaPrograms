public class MarksDistribution {
    public static void main(String[] args) {
        int totalMark=100;
        int totalquestion=15;
        int i=0;
        int j=0;
        for(i=0;i<totalquestion; i++){
            j=totalquestion-i;
            if(((5*i)+(j*10))==totalMark){
            break;
            }
        }
        System.out.println("5 mark question is "+i);
        System.out.println("10 mark question is "+j);
    }
}
