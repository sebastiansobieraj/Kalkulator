package com.kodilla;

import java.util.Random;
import java.util.Scanner;

public class Game {
    String name;
    int nubmerOfGames;
    // stone = 1;
    // paper = 2;
    // scissors = 3;
    int playerScore = 0;
    int computerScore = 0;
    String figure;
    String startOrContinue;
    Random generator = new Random();
    Scanner takeName = new Scanner(System.in);
    Scanner takeNumberOfGames = new Scanner(System.in);
    Scanner takeFigure = new Scanner(System.in);
    Scanner newOrEnd = new Scanner(System.in);

    public void games() {
        Version selectVersion = new Version();
        System.out.println("Rozpoczynam nową grę. \nPodaj swoje imię.");
        name = takeName.nextLine();
        System.out.println("Witaj " + name + ". Podaj liczbę gier.");
        nubmerOfGames = takeNumberOfGames.nextInt();
        for (int i = 0; i < nubmerOfGames; i++) {

            System.out.println("\nRunda " + (i + 1) + ": Podaj figurę (stone, paper, scissors). Jeżeli chcesz zakończyć " +
                    "grę aktualnym wynikiem wpisz: exit, jeżeli chcesz zacząć od nowa, wpisz: new game.");
            figure = takeFigure.nextLine();

            if (figure.equals("exit")) {
                System.out.println("Gra zakończona");
                break;
            } else if (figure.equals("new game")) {
                games();
            }
            int nubmer = generator.nextInt(3) + 1;
            if (figure.equals("stone")) {
                if (nubmer == 1) {
                    playerScore++;
                    computerScore++;
                    System.out.println("Gracz " + name + " wybrał kamień oraz komputer wylosował kamień. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                } else if (nubmer == 2) {
                    computerScore++;
                    System.out.println("Gracz " + name + " wybrał kamień, komputer wylosował papier. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                } else {
                    playerScore++;
                    System.out.println("Gracz " + name + " wybrał kamień, komputer wylosował nożyce. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                }
            } else if (figure.equals("paper")) {
                if (nubmer == 1) {
                    playerScore++;
                    System.out.println("Gracz " + name + " wybrał papier, komputer wylosował kamień. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                } else if (nubmer == 2) {
                    playerScore++;
                    computerScore++;
                    System.out.println("Gracz " + name + " wybrał papier oraz komputer wylosował papier. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                } else {
                    computerScore++;
                    System.out.println("Gracz " + name + " wybrał papier, komputer wylosował nożyce. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                }
            } else {
                if (nubmer == 1) {
                    computerScore++;
                    System.out.println("Gracz " + name + " wybrał nożyce, komputer wylosował kamień. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                } else if (nubmer == 2) {
                    playerScore++;
                    System.out.println("Gracz " + name + " wybrał nożyce, komputer wylosował papier. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                } else {
                    computerScore++;
                    playerScore++;
                    System.out.println("Gracz " + name + " wybrał nożyce oraz komputer wylosował nożyce. \nWynik to : "
                            + name + ": " + playerScore + ":" + computerScore + " Komputer");
                }
            }
        }
        if (computerScore == playerScore) {
            System.out.println("\nWynik to remis");
        } else if (computerScore > playerScore) {
            System.out.println("\nZwyciezca to: komputer");
        } else {
            System.out.println("\nZwycięzca to: " + name);
        }
        System.out.println("\nJeżeli chcesz rozpocząć nową grę wpisz: new game. " +
                "\nJeżeli chcesz zamknąć program wpisz: exit. \nJeżeli chcesz zmienić wersję wpisz: change version.");
        startOrContinue = newOrEnd.nextLine();
        if (startOrContinue.equals("new game")) {
            games();
        } else if (startOrContinue.equals("change version")) {
            selectVersion.selectVersion();
        } else {
            System.out.println("Koniec gry");
        }
    }
}


