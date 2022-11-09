import java.util.*;

class UniqeWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input :");
        String input = scanner.nextLine();
        System.out.println("Total unique words :" + countUniqueWord(input));
    }

    public static int countUniqueWord(String input) {
        String[] words = input.replace(".","").split("\\s+");
        return Math.toIntExact(Arrays.stream(words).distinct().count());
    }

}