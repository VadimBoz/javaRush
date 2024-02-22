package com.javarush.task.task21.task2113;

import com.javarush.task.task21.task2107.Solution;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;
    private  List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }


    public Horse getWinner() {
        double maxDist = 0;
        Horse winnerHors = null;
        for (Horse hors : horses) {
            if (hors.distance > maxDist) winnerHors = hors;
        }
        return  winnerHors;
    }
    public void printWinner() {
        System.out.printf("Winner is %s!", getWinner().name);
    }


    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);

        }
    }
    public void  move() {
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public  void print() {
        for (Horse horse: horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }





    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
         List<Horse> h  = new ArrayList<>();
         h.add(new Horse("1", 3, 0));
         h.add(new Horse("2", 3, 0));
         h.add(new Horse("3", 3, 0));

         game  = new Hippodrome(h);
         game.run();
         game.printWinner();

    }
}
