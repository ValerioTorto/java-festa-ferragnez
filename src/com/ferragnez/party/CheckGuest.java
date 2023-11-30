package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //CREO ARRAY DEGLI INVITATI
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //CHIEDO IL NOME ALL'INVITATO
        System.out.println("Dimmi il tuo nome: ");
        String name = scanner.nextLine();
        boolean equals = false;
        for (int i = 0; i < guests.length; i++) {




            if (name.equals(guests[i])) {

                System.out.println("Prego puoi entrare");
                equals = true;
                break;
            } else {
                System.out.println("Ora chiamo la polizia");



            }
            scanner.close();
        }
    }


}



