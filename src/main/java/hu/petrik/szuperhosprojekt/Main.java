package hu.petrik.szuperhosprojekt;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            System.out.println("asd");
            Kepregeny.szereplok("szereplok.txt");
            Kepregeny.szuperhosok();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}