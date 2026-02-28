# Projekt: Konsolowy Multitool "CyberDesk" 💻
Opis: Zbudujesz interaktywny program w terminalu, który działa jak system operacyjny dla "agenta" lub "hakera". Program będzie działał w nieskończonej pętli, dopóki użytkownik nie zdecyduje się go zamknąć, i będzie oferował kilka modułów narzędziowych.

# Wymagania i funkcjonalności (mapowanie na Fazę 1):
## 1. Logowanie i Argumenty Startowe (CLI Arguments, Arrays, Strings, var)

Program musi być uruchamiany z argumentami linii poleceń: [Imię_Użytkownika] [Wiek] [Ranga].

Zapisz te dane do zmiennych, używając słowa kluczowego var.

Wyświetl spersonalizowane powitanie. Jeśli nie podano argumentów, program ma się zakończyć z odpowiednim komunikatem.

## 2. Główne Menu (Loops, Modern Switch, Scanner/BufferedReader)

Użyj Scanner lub BufferedReader do pobierania komend od użytkownika.

Zaimplementuj pętlę do-while lub while(true), która wyświetla menu i czeka na wybór.

Użyj nowoczesnego wyrażenia switch (switch expression z ->), aby obsługiwać wybór użytkownika (1: Analiza, 2: Uprawnienia, 3: Mapa, 4: Symulator błędu matematycznego, 5: Wyjście).

## 3. Moduł 1: Analizator Danych (1D Arrays, Strings, Pętle, Instrukcje warunkowe)

Pobierz od użytkownika długie zdanie.

Przekształć je na tablicę znaków (char[]).

Użyj pętli for lub enhanced for-each, aby zliczyć: samogłoski, spółgłoski i spacje.

Użyj operatora trójargumentowego (ternary operator), aby wyświetlić komunikat: "Zdanie jest długie" (jeśli > 20 znaków) lub "Zdanie jest krótkie".

## 4. Moduł 2: Zarządzanie Uprawnieniami (Bitwise Operators, Primitives, Casting)

Każdy plik w systemie ma uprawnienia zapisane w jednej zmiennej typu byte (od 0 do 7).

Odczyt (Read) = 4 (binarnie 100)

Zapis (Write) = 2 (binarnie 010)

Wykonywanie (Execute) = 1 (binarnie 001)

Zainicjuj zmienną byte uprawnienia = 0.

Użyj operatorów bitowych (|, &, ^, ~), aby nadać uprawnienie do odczytu i zapisu, a następnie sprawdź za pomocą &, czy użytkownik ma prawo do zapisu.

Zastosuj jawne rzutowanie (explicit casting), ponieważ operacje matematyczne w Javie domyślnie promują liczby do int.

## 5. Moduł 3: Skaner Terenu (2D Arrays, Nested Loops, Labels, Break/Continue)

Wygeneruj "mapę" jako tablicę dwuwymiarową int[][] o rozmiarze 5x5.

Wypełnij ją zerami, ale w jednym losowym (lub z góry ustalonym) miejscu wstaw liczbę 1 (ukryty cel).

Użyj zagnieżdżonych pętli for.

Zastosuj instrukcję break z etykietą (labeled statement), aby natychmiast przerwać obie pętle (zewnętrzną i wewnętrzną), gdy tylko program znajdzie 1, wypisując jego współrzędne.

## 6. Moduł 4: Symulator Błędu Matematycznego (Type Promotion, Widening/Narrowing)

Stwórz sytuację, w której agent musi podzielić zasoby (np. 10 apteczek na 3 drużyny).

Wykonaj operację int x = 10 / 3; i wypisz wynik. Następnie dodaj komentarz w konsoli programu, wyjaśniający (w oparciu o typy prymitywne), dlaczego wynik to 3, a nie 3.333.

Wykonaj tę samą operację, używając float i double, demonstrując automatyczną promocję typów w wyrażeniach (np. 10.0 / 3).

## 7. System Logowania (Varargs)

Napisz osobną metodę void logAction(String... messages).

Używaj tej metody w całym programie (np. gdy użytkownik wybiera opcję z menu, przekazuj logAction("Użytkownik", imie, "wybrał opcję", opcja)). Metoda powinna łączyć te zmienne argumenty i wyświetlać jako jeden log z timestampem lub po prostu jako połączony tekst.

# Checklista ukończenia Fazy 1 (Weryfikacja Projektu)
Gdy skończysz pisać ten program, zadaj sobie następujące pytania. Jeśli na wszystkie odpowiesz "TAK", jesteś gotów na Fazę 2 (Obiekty i Klasy).

[ ] Czy program pobiera zróżnicowane dane od użytkownika i reaguje na nie inaczej w zależności od warunków (if-else, switch)?

[ ] Czy z łatwością iterujesz po danych jedno- i dwuwymiarowych, wiedząc kiedy użyć for-each, a kiedy zwykłego for?

[ ] Czy rozumiesz i potrafisz wyjaśnić, co dzieje się z pamięcią i wartością podczas dzielenia całkowitoliczbowego (10/3) i rzutowania w dół (int -> byte)?

[ ] Czy w trakcie pisania potrafiłeś namierzyć błąd kompilacji lub błąd logiczny (np. nieskończona pętla, błąd indeksu w tablicy ArrayIndexOutOfBoundsException) czytając stack trace w konsoli?

[ ] Czy operatory bitowe (AND, OR) mają dla Ciebie sens w kontekście flag i uprawnień?
