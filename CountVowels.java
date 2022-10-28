import java.util.*;
class CountVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input :");
        String input = sc.nextLine();
        input = removeWasteCharacter(input);
        System.out.println("Total vowel :"+findVowels(input));
    }

    public static String removeWasteCharacter(String input){
        input = input.replace(" ", "").replace(".", "");
        return input; 
    }

    public static int findVowels(String input){
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
//    Mary and Samantha arrived at the bus station early but waited until noon for the bus.