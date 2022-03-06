package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> juzgoCheinkiSan = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            juzgoCheinkiSan.add(random.nextInt(50));
        }

        ArrayList<Integer> takSan = new ArrayList<>();
        for (int s : juzgoCheinkiSan) {
            if (s % 2 == 1) {
                takSan.add(s);
                System.out.print(s + " ");
            }
        }
        System.out.println();

        ArrayList<Integer> jupSan = new ArrayList<>();
        for (int s : juzgoCheinkiSan) {
            if (s % 2 == 0) {
                jupSan.add(s);
                System.out.print(s + " ");
            }
        }
    }
}
