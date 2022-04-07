import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<Character> answers = new ArrayList<>();
        ArrayList<Character> key = new ArrayList<>();
        key.add('a');
        key.add('b');
        key.add('c');
        key.add('b');
        key.add('c');

        //creating questions
        for (int i = 1; i<=5; i++) {
            questions.add("Pyt" + i + "\n" + "Odp. a - a" + "\n" + "Odp. b - b" + "\n" + "Odp. c - c");
            System.out.println(questions.get(i-1));

            System.out.print("Odpowiedz: ");
            char answer = scanner.next().charAt(0);
            while (true) {
                if (answer == 'a' || answer == 'b' || answer == 'c') {
                    answers.add(answer);
                    break;
                } else {
                    System.out.print("Wprowadz poprawną odp. a, b lub c");
                    answer = scanner.next().charAt(0);
                }
            }
            System.out.println("------");
        }
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equals(key.get(i))) {
                score++;
            } else score--;
        }

        System.out.println("Uzyskałeś wynik " + score);

    }
}
