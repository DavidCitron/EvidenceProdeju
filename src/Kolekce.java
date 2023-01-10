import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kolekce {
    static final String SOUBOR = "dokument.txt";
    static final String ODDELOVAC = ":";
    List<Zakaznik> seznamZakazniku = new ArrayList<>();
    void pridejZakaznika(Zakaznik novyZakaznik){
        try{
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(SOUBOR)));
            seznamZakazniku.add(novyZakaznik);
            for(Zakaznik aktualniZakaznik: seznamZakazniku){
                writer.println(aktualniZakaznik.getJmeno() + ODDELOVAC + aktualniZakaznik.getPocetProdeju());
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

    void nactiSeznam(){
        try{
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(SOUBOR)));
            seznamZakazniku.clear();
            while(scanner.hasNextLine()){
                String radek = scanner.nextLine();
                String[] casti = radek.split(ODDELOVAC);
                seznamZakazniku.add(new Zakaznik(casti[0], Integer.parseInt(casti[1])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
