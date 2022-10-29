import java.util.*;
class VowelCounter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input :");
        String input = sc.nextLine();
        System.out.println("Total vowel :"+countVowel(input));
    }

    public static int countVowel(String input){
        int count = 0;
        input = input.toLowerCase();
        for(int i = 0 ; i<input.length() ; i++ ){
            String splitCharactor = input.substring(i, i+1);
            if(splitCharactor.equals("a")||splitCharactor.equals("e")||splitCharactor.equals("i")
                ||splitCharactor.equals("o")||splitCharactor.equals("u")){
                count++;
            }
        }
        return count;
    }
}
