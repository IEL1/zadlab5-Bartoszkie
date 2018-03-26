/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Data {

    public static void main(String[] args) {

        System.out.println("Aktualna data" + new Date());
        Scanner scanner = new Scanner(System.in);
        int sterownik = scanner.nextInt();

        switch (sterownik) {

            case 1:

                Zadanie_4 obiekt = new Zadanie_4();
                obiekt.dodajTydzien_przod();

                break;

            case 2:

                Zadanie_4 obiekt1 = new Zadanie_4();
                obiekt1.dodajTydzien_tyl();

                break;

        }

    }

}

