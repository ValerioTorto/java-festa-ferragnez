package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //CREO ARRAY DEGLI INVITATI
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println(Arrays.toString(guests));
        //CHIEDO IL NOME ALL'INVITATO
        System.out.println("Dimmi il tuo nome: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < guests.length; i++) {




            if (name.equals(guests[i])) {
                found = true;

            } else {

            }

            scanner.close();
        }
        if (found == true) {
            System.out.println("Prego " + name + ", entri pure");
        } //else if(name == .guests[0]) {
            //System.out.println("Dua Lipa tornatene in Albania");
        //}
        else {
            System.out.println("Adesso chiamo la polizia");
        }
    }
}



