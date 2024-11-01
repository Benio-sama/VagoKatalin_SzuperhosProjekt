package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<Szuperhos>();

    public static void szereplok(String fajl) throws IOException {
        System.out.println("asd");
        BufferedReader br = new BufferedReader( new FileReader( fajl ) );
        String sor = br.readLine();
        while (sor != null) {
            String[] sorok = sor.split(" ");
            if (sorok[0].equalsIgnoreCase("batman")) {
                Batman batman = new Batman();
                /*for (int i = 0; i < Integer.parseInt(sorok[1]); i++) {
                    batman.kutyutKeszit();
                }*/
                szuperhosLista.add(batman);
            } else if (sorok[0].equalsIgnoreCase("vasember")) {
                Vasember vasember = new Vasember();
                /*for (int i = 0; i < Integer.parseInt(sorok[1]); i++) {
                    vasember.kutyutKeszit();
                }*/
                szuperhosLista.add(vasember);
            }
            sor = br.readLine();
        }
    }

    public static void szuperhosok() {
        for (Szuperhos sz : szuperhosLista) {
            System.out.println(sz);
        }
    }
}
