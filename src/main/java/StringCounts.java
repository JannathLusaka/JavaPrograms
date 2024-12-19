public class StringCounts {
    public static void main(String[] args) {
        String str="I am a SQA Engineer";

       String[] words =str.split(" ");
        System.out.println("Words: "+words.length);

        char[] chars=str.toCharArray();
        int characters=0;
        for(int i=0; i< chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            characters++;
        }
        System.out.println("Chars: "+characters);


        int vowels=0;
        int consonent=0;
        for(int i=0; i<str.length(); i++){
           char letter= Character.toLowerCase(str.charAt(i));
            if(letter=='a' || letter == 'e' || letter =='i' || letter =='o' || letter == 'u'){
                vowels++;
            }
            else if (letter==' ') {

                continue;
            }
            else{
                consonent++;
            }
        }
        System.out.println("Vowel: "+vowels);
        System.out.println("Consonent: "+consonent);

    }
    }


