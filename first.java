import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę przedmiotów: ");
        int ileprzedmiotow = scanner.nextInt();
        double[] tablicaocen= new double[ileprzedmiotow];
        for (int i = 0; i < ileprzedmiotow; i++) {
            System.out.print("Podaj ocenę z przedmiotu " + (i + 1) + ": ");
            tablicaocen[i] = scanner.nextDouble();
        }
        
        double suma = 0;
        
        for (double ocena : tablicaocen){
          suma += ocena;
        }
        double srednia = suma / ileprzedmiotow;
        System.out.println("Średnia ocen: " + srednia);
        scanner.close();
    }
}