package pl.edu.ur.POLab3;

import java.util.Scanner;

public class Main {

    public static int fib(int n) {

        if ((n == 1) || (n == 2)) {
            return 1;
        } else {

            return fib(n - 1) + fib(n - 2);

        }
    }

  public static int potega(int g, int o)
{
    if (o == 1)
        return 1;
    else
        return potega (g,o-1)*g;
    
 
} 
  
    public static void main(String[] args) {

        System.out.println("Wczytaj numer zadania");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner scanner = new Scanner(System.in);

        switch (a) {

            case 1:
                String s1 = new String("Happy ");
                String s2 = new String("Birthday");

                System.out.println(s1.toCharArray()); //Zamienia string na char(tablice znakow)
                System.out.println(s1.getBytes()); // Koduje string do nowej tablicy bajtow
                System.out.println(s1.equals(s2)); //Porownuje 2 stringi ,sprawdza czy sa takie same
                System.out.println(s1.equalsIgnoreCase(s2));// Porownuje 2 stringi ale nie zwraca uwagi na wielkosc liter
                System.out.println(s1.compareTo(s2));   //Porownuje 2 stringi lexykograficznie
                System.out.println(s1.compareToIgnoreCase(s2));////Porownuje 2 stringi lexykograficznie z pominieciem wielkosci liter
                System.out.println("tutaj" + s2.indexOf('t')); // Wyznacza miejsce danego znaku
                System.out.println(s1.indexOf(s2));// Wyznacza indeks w 1 stringu z innego wyznaczonego
                System.out.println(s1.lastIndexOf(s2));// wyznacza miejsce ostatniego znaku w stringu
                System.out.println(s1.lastIndexOf(s2));//Wyznacza ostatni indeks stringa z innego
                System.out.println(s1.substring(2));// Tworzy podciag z innego stringu
                System.out.println(s2.substring(2, 5));//Tworzy podciag z innego stringu z podniem przedialu
                System.out.println(s1.replace('a', 'b'));    // Zamienia podane znaki w inne 
                System.out.println(s1.trim());//Zamienia znak na bez spacji
                System.out.println(s1.toLowerCase()); //Zamienia znaki na male
                System.out.println(s1.toUpperCase()); // Zamienia znaki na duze
                System.out.println();
                System.out.println();
                break;
            case 2:
                System.out.println("Podaj nieujemna liczbe calkowita : ");

                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                if (n == 0) {
                    System.out.println("WartoĹ›c ciagu Fibonnaciego dla 0 rowna sie 0");
                } else if (n == 1) {
                    System.out.println("WartoĹ›c ciagu Fibonnaciego dla 1 rowna sie 1");
                } else {

                    System.out.println("WartoĹ›c ciagu Fibonnaciego dla " + n + " rowna sie " + fib(n));

                }

                break;

            case 3:
                System.out.println("Podaj wykladnik: ");
               int z = scanner.nextInt();
                System.out.println("Podaj potege: ");

                int 
                 b,
                 wynik = 1;

                
                b = scanner.nextInt();

                while (b > 0) {
                    wynik *= z;
                    b--;
                }

                System.out.println(wynik);

                break;
            case 4:
                Scanner ino = new Scanner(System.in);
        int g = ino.nextInt();
                int o = ino.nextInt();
                
             System.out.println(potega(g,o));
                break;
                
            case 5:
                System.out.println("Podaj 2 liczby: ");
                Scanner inq = new Scanner(System.in);
                int q= inq.nextInt();
                int u= inq.nextInt();
                
                if(q!=0){
                
                    System.out.println("Tak dziala NOT");
                }
                
                
                break;
                }
                
              

        }

    }

