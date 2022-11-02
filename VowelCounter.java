import java.util.*;
import java.util.stream.Collectors;

class VowelCounter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input :");
        String input = scanner.nextLine();
        System.out.println("Total vowel :"+countVowel(input));
    }

    public static int countVowel(String input) {
        List<Character> characters  = input.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        return (int) characters.stream().filter(character -> isVowel(character)).count();
    }

    public static boolean isVowel(char character) { 
        char characterLowerCase = Character.toLowerCase(character);
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        return vowels.contains(characterLowerCase);
    }

}
