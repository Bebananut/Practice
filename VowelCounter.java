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
        for(int i = 0 ; i<input.length() ; i++ ){
            char character = input.charAt(i);
            if(isVowel(character)){
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char character){
        List<String> vowels = Arrays.asList("a", "e", "i", "o","u");
        char characterLowerCase = Character.toLowerCase(character);
        return vowels.contains(Character.toString(characterLowerCase));
    }

}
