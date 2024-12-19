public class NotesAmount {
    public static void main(String[] args) {
        int[] notes= {1000,500,200,100,50,20,10,5,2,1};
        int inputAmount= 546;
        int[] noteCount= new int[notes.length];
        for(int i=0; i<notes.length; i++){
            if (inputAmount >= notes[i]) {
                noteCount[i]= inputAmount/notes[i];
                inputAmount= inputAmount%notes[i];

            }
        }
        System.out.println("Notes count: ");
        for (int i=0; i<notes.length; i++){
            if(noteCount[i]!=0) {
                System.out.println(notes[i]+" : "+noteCount[i]);
            }
        }

    }
}
