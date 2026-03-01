import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        logAction(args);

        if (args.length < 3) {
            System.out.println("Missing login parameter(s)");
        } else {
            var userName = args[0];
            var age = Integer.parseInt(args[1]);
            var rank = args[2];

            System.out.println("Hello " + userName + "!");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            String selectedOption = "";

            while (!selectedOption.equals("5")) {
                System.out.println("Provide action name: \n1: Analiza, 2: Uprawnienia, 3: Mapa, 4: Symulator błędu matematycznego, 5: Wyjście");
                String userSelection = reader.readLine();

                switch (userSelection) {
                    case "1" -> {
                        System.out.println("Podaj dowolne zdanie, a program przeanalizuje jego strukturę: ");
                        String sentence = reader.readLine();
                        char[] letters = sentence.toCharArray();
                        int spaceCount = 0;
                        int vowelCount = 0;
                        int consonantCount = 0;
                        int specialCharactersCount = 0;
                        String VOWELS = "aeiouAEIOU";

                        for(char sign : letters) {
                            if(sign == ' ') {
                                spaceCount += 1;
                            } else if(Character.toLowerCase(sign) >= 'a' && Character.toLowerCase(sign) <= 'z') {
                                if (VOWELS.indexOf(sign) != -1) {
                                    vowelCount += 1;
                                } else {
                                    consonantCount += 1;
                                }
                            } else {
                                specialCharactersCount += 1;
                            }
                        }

                        int sentenceLength = sentence.length();
                        String res = (sentenceLength > 20) ? "Zdanie jest długie" : "Zdanie jest krótkie";

                        System.out.println(res);
                        System.out.println("Liczba samogłosek: " + vowelCount);
                        System.out.println("Liczba spacji: " + spaceCount);
                        System.out.println("Liczba spółgłosek: " + consonantCount);
                        System.out.println("Liczba znaków specialnych: " + specialCharactersCount);
                    }
                    case "2" -> {
                        byte permissions = 0;
                        permissions = (byte)(permissions | 4 | 2);
                        if ((permissions & 2) == 0b010) {
                            System.out.println("Masz prawo do zapisu");
                        }
                        else System.out.println("Brak praw do zapisu");
                    }
                    case "3" -> {
                        Random random = new Random();
                        int firstCoordinate = random.nextInt(5);
                        int secondCoordinate = random.nextInt(5);
                        int[][] areaMap = new int[5][5];
                        areaMap[firstCoordinate][secondCoordinate] = 1;
                        int foundRow = -1;
                        int foundCol = -1;
                        searchLoop:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                if (areaMap[i][j] == 1) {
                                    foundRow = i;
                                    foundCol = j;
                                    System.out.println("Znaleciono cel na Znaleziono cel na współrzędnych: " + foundRow + " | " + foundCol);
                                    break searchLoop;
                                }
                            }
                        }
                    }
                    case "4" -> {
                        int resources = 10;
                        int teams = 3;
                        int results = resources / teams;
                        System.out.println(results);
                        System.out.println("Typ int zwróci zawsze wartość całkowitą ucinają wartości po przecinku.");
                        System.out.println("Nawet jeśli wynik wynosiłby 3,99 to typ int zwróciłby 3");
                        double resultWithDecinamPlaces = (double) resources / teams;
                        System.out.println(resultWithDecinamPlaces);
                    }
                    case "5" -> System.out.println("Koniec programu");
                    default -> System.out.println("Unexpected value: " + userSelection);
                }
                selectedOption = userSelection;
            }
        }
    }

    static void logAction(String... messages) {
        if (messages.length == 0) {
            System.out.println("[LOG]: no params provided");
        } else
            System.out.println("[LOG]: " + String.join(" ",messages));
    }
}
