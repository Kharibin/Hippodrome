package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Java on 09.05.2017.
 */
public class Hippodrome {
    static Hippodrome game;

    //Fields and getters
    private static List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses(){
        return this.horses;
    }


    //Constructors
    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }


    //methods

    public void run(){
        for (int i = 0; i < 100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println("Sleeping exception in run()");
            }
        }
    }

    public void print(){
        for (Horse x: horses) {
            x.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void move(){
        for (Horse x: horses) {
            x.move();
        }
    }

    public Horse getWinner(){
        double maxDist = 0.0;
        Horse winner = null;
        for (Horse x: horses) {
            if (maxDist < x.getDistance()) maxDist =x.getDistance();
        }
        for (Horse x:horses) {
            if (x.getDistance() == maxDist) winner = x;
        }
        return winner;
    }


    public void printWinner(){
        String winner = getWinner().getName();
        System.out.println("Winner is " + winner + "!");
    }

    public static void main(String[] args){

        game = new Hippodrome(new ArrayList<>());

        for (int i = 0; i < 3; i++){
            game.horses.add(new Horse("horse"+i, 3, 0));
        }

        game.run();

        game.printWinner();


    }

}
