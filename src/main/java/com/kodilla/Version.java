package com.kodilla;
import java.util.Scanner;

public class Version {
    Scanner select = new Scanner (System.in);
    Game version1 = new Game();
    Game2 version2 = new Game2();
    public void selectVersion (){
        System.out.println("Jeżeli chcesz rozpocząć grę w wersji 1 (w przypadku remisu punkty są dodawane) wpisz 1.\n" +
                "Jeżeli chcesz rozpocząć grę w wersji 2 (w przypadku remisu punkty nie są dodawane) wpisz 2.");
        select.nextInt();
        if (select.equals(1)){
            version1.games();
        } else {
            version2.games2();
        }
    }
}
