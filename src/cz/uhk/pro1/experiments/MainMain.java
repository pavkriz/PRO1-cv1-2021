package cz.uhk.pro1.experiments;

import javax.swing.*;
import java.util.Random;

public class MainMain {
    public static void main(String[] args) {
        Random dice = new Random();
        int x = dice.nextInt(15) + 1; // <0;15)
        System.out.println(x);
        // for cyklus
        for (int i = 5; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        for (int i = 5; i <= 100; i += 2) {
            System.out.println(i);
        }
        int ar[] = { 1, 4, 8, 2, 8, 10 };
        String needleNumber = JOptionPane.showInputDialog("Zadej cislo, ktere hledas?");
        int needleInt = Integer.parseInt(needleNumber);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]==needleInt)
            {
                System.out.println("Found index: " + i);
                break;
            }
        }
        String[] sa = {"Jan", "Sabina", "Jana", "Robin", "Karel"};
        String needle = JOptionPane.showInputDialog("Zadej jmeno, ktere hledas");
        for (int i = 0; i < sa.length; i++) {
            String cur = sa[i];
            if (cur.equals(needle))
            {
                System.out.println(i);
            }


        }
    }
}
