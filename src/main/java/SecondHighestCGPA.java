public class SecondHighestCGPA {
    public static void main(String[] args) {
      double[] CGPA  ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
      double max=CGPA[0];
      double secondMax=CGPA[0];
      for(int i=0; i<CGPA.length; i++){
          if(CGPA[i]>max){
              secondMax=max;
              max=CGPA[i];
          }
          if(CGPA[i]>secondMax && CGPA[i]<max){
              secondMax=CGPA[i];
          }
      }
        System.out.println("Second highest CGPA: "+secondMax);
    }
}
