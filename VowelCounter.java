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
            Character character = input.charAt(i);
            if(isVowel(character)){
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(Character character){
        Character characterLowerCase = Character.toLowerCase(character);
        return (characterLowerCase.equals('a')||characterLowerCase.equals('e')||characterLowerCase.equals('i')
        ||characterLowerCase.equals('o')||characterLowerCase.equals('u'));
    }

}
