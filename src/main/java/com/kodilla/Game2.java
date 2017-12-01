package com.kodilla;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

    String name2;
    int nubmerOfGames2;
    // stone = 1;
    // paper = 2;
    // scissors = 3;
    int playerScore2 = 0;
    int computerScore2 = 0;
    String figure2;
    String startOrContinue2;
    Random generator2 = new Random();
    Scanner takeName2 = new Scanner(System.in);
    Scanner takeNumberOfGames2 = new Scanner(System.in);
    Scanner takeFigure2 = new Scanner(System.in);
    Scanner newOrEnd2 = new Scanner(System.in);

    public void games2() {
        Version selectVersion2 = new Version();
        System.out.println("Rozpoczynam nową grę. \nPodaj swoje imię.");
        name2 = takeName2.nextLine();
        System.out.println("Witaj " + name2 + ". Podaj liczbę gier.");
        nubmerOfGames2 = takeNumberOfGames2.nextInt();
        for (int i = 0; i < nubmerOfGames2; i++) {

            System.out.println("\nRunda " + (i + 1) + ": Podaj figurę (stone, paper, scissors). Jeżeli chcesz zakończyć " +
                    "grę aktualnym wynikiem wpisz: exit, jeżeli chcesz zacząć od nowa, wpisz: new game.");
            figure2 = takeFigure2.nextLine();

            if (figure2.equals("exit")) {
                System.out.println("Gra zakończona");
                break;
            } else if (figure2.equals("new game")) {
                games2();
            }
            int nubmer = generator2.nextInt(3) + 1;
            if (figure2.equals("stone")) {
                if (nubmer == 1) {
                    System.out.println("Gracz " + name2 + " wybrał kamień oraz komputer wylosował kamień. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                } else if (nubmer == 2) {
                    computerScore2++;
                    System.out.println("Gracz " + name2 + " wybrał kamień, komputer wylosował papier. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                } else {
                    playerScore2++;
                    System.out.println("Gracz " + name2 + " wybrał kamień, komputer wylosował nożyce. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                }
            } else if (figure2.equals("paper")) {
                if (nubmer == 1) {
                    playerScore2++;
                    System.out.println("Gracz " + name2 + " wybrał papier, komputer wylosował kamień. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                } else if (nubmer == 2) {
                    System.out.println("Gracz " + name2 + " wybrał papier oraz komputer wylosował papier. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                } else {
                    computerScore2++;
                    System.out.println("Gracz " + name2 + " wybrał papier, komputer wylosował nożyce. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                }
            } else {
                if (nubmer == 1) {
                    computerScore2++;
                    System.out.println("Gracz " + name2 + " wybrał nożyce, komputer wylosował kamień. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                } else if (nubmer == 2) {
                    playerScore2++;
                    System.out.println("Gracz " + name2 + " wybrał nożyce, komputer wylosował papier. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                } else {
                    System.out.println("Gracz " + name2 + " wybrał nożyce oraz komputer wylosował nożyce. \nWynik to : "
                            + name2 + ": " + playerScore2 + ":" + computerScore2 + " Komputer");
                }
            }
        }
        if (computerScore2 == playerScore2) {
            System.out.println("\nWynik to remis");
        } else if (computerScore2 > playerScore2) {
            System.out.println("\nZwyciezca to: komputer");
        } else {
            System.out.println("\nZwycięzca to: " + name2);
        }
        System.out.println("\nJeżeli chcesz rozpocząć nową grę wpisz: new game. " +
                "\nJeżeli chcesz zamknąć program wpisz: exit. \nJeżeli chcesz zmienić wersję wpisz: change version");
        startOrContinue2 = newOrEnd2.nextLine();
        if (startOrContinue2.equals("new game")) {
            games2();
        } else if (startOrContinue2.equals("change version.")) {
            selectVersion2.selectVersion();
        } else {
            System.out.println("Koniec gry");
        }
    }
}

