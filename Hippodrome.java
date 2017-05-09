package com.javarush.task.task21.task2113;

import java.util.List;

/**
 * Created by Java on 09.05.2017.
 */
public class Hippodrome {

    //Fields and getters
    private List<Horse> horses;

    public List<Horse> getHorses(){
        return this.horses;
    }


    //Constructors
    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

    public static void main(String[] args){



    }

}
