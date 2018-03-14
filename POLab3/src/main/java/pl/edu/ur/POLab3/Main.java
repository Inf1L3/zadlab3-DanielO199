package pl.edu.ur.POLab3;

import java.util.Scanner;
import java.util.*;

public class Main {

    int compareTo(String anotherString) {

        return 1;
    }

    public static int silnia(int wartosc) {

        if (wartosc == 0) {
            return 1;
        } else {
            return wartosc * silnia(wartosc - 1);
        }

    }

    public static void main(String[] args) {
        
        System.out.println("Podaj liczbe n:");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int b=0;
        System.out.println(n+"!= ");
        
        for(int i=0;i<n;i++){
            b=n*(n-1);
        }
        System.out.println(b);
        
        
        
        /*

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");

        int liczba = sc.nextInt();
        System.out.println(liczba + "! = " + silnia(liczba));*/
        /*  
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("a < b && a != b : " + (a < b && a != b));
        System.out.println("a < b && a == b : " + (a < b && a == b));
        System.out.println("a > b && a == b : " + (a > b && a == b));

        System.out.println("a < b & a != b : " + (a < b & a != b));
        System.out.println("a < b & a == b : " + (a < b & a == b));
        System.out.println("a > b & a == b : " + (a > b & a == b));

        System.out.println("a < b || a != b : " + (a < b || a != b));
        System.out.println("a < b || a == b : " + (a < b || a == b));
        System.out.println("a > b || a == b : " + (a > b || a == b));

        System.out.println("a < b | a != b : " + (a < b | a != b));
        System.out.println("a < b | a == b : " + (a < b | a == b));
        System.out.println("a > b | a == b : " + (a > b | a == b));

        int d = (a++) + b;*/

        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
    }

}
