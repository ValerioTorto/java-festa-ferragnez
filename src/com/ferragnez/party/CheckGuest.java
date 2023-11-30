package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //CHIEDO IL NOME ALL'INVITATO

        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        //boolean equals = false;
        for (int i = 0; i < guests.length; i++) {
            System.out.println("Dimmi il tuo nome: ");
            String name = scanner.nextLine();
            //CREO ARRAY DEGLI INVITATI


            if (name.equals(guests(i))) {
                //equals = true;
                System.out.println("Prego puoi entrare");
            } else {
                System.out.println("Ora chiamo la polizia");


            }
            scanner.close();
        }

    }


}

