public class Lowest2ndLowestHeight {
    public static void main(String[] args) {
        int[] height={40,50,51,42,53,43,38,48,41,45};
        int lowest= height[0];
        int secondlowest=height[0];

        for(int i=0; i<height.length;i++){
            if (height[i]<lowest){
                int temp=lowest;
                lowest=height[i];
                secondlowest=temp;
            }
            if(height[i]<secondlowest && height[i]>lowest){
                secondlowest=height[i];
            }
        }
        System.out.println("Lowest baby height: "+lowest);
        System.out.println("Second lowest baby height: "+secondlowest);
    }
}
