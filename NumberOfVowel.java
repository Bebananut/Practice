import java.util.*;
class NumberOfVowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input :");
        String input = sc.nextLine();
        System.out.println("Total vowel :"+countVowel(input));
    }

    public static int countVowel(String input){
        int count = 0;
        String[] vowels = {"a","e","i","o","u"}; 
        input = input.toLowerCase();
        for(int i = 0 ; i<input.length() ; i++ ){
            String splitCharactor = input.substring(i, i+1);
            for(int j = 0 ; j<vowels.length;j++){
                if(splitCharactor.equals(vowels[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
