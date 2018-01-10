package com.company;

public class PengeAutomat {

    private int speciedaler;
    private int kroner;
    private int skilling;


    public PengeAutomat() {
        this.speciedaler = 0;
        this.kroner = 0;
        this.skilling = 0;
    }

    public PengeAutomat(int speciedaler, int kroner, int skilling) {
        this.speciedaler = speciedaler;
        this.kroner = kroner;
        this.skilling = skilling;
    }

    //Utelater settere fordi vi kan lage en metode som setter inn penger.

    public int getSpeciedaler() {
        return speciedaler;
    }

    public int getKroner() {
        return kroner;
    }

    public int getSkilling() {
        return skilling;
    }

    private void stokkOm() {

    }

    public void vis() {
        System.out.println("Tilgjengelig beløp: \n" +
                "Species: " + speciedaler + "\n" +
                "Kroner: " + kroner + "\n" +
                "Skilling: " + skilling + "\n");

    }
}