public class RemoveVowel {
    public static void main(String[] args) {
        String str="I am a SQA Engineer";
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char letter= Character.toLowerCase(str.charAt(i));
            if(letter=='a' || letter == 'e' || letter =='i' || letter =='o' || letter == 'u'){
               continue;
            }
            sb.append(letter);

        }
        System.out.println(sb);
    }
}
