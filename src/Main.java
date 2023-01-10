import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kolekce kolekce = new Kolekce();
        kolekce.nactiSeznam();
        kolekce.pridejZakaznika(new Zakaznik("Petr Pavel", 69));
        kolekce.pridejZakaznika(new Zakaznik("Danuše Nerudová", 5));
        List<Zakaznik> seznam = kolekce.ziskejSeznamZakazniku();
        for(Zakaznik zakaznik: seznam){
            System.out.println(zakaznik.getJmeno() + " - " + zakaznik.getPocetProdeju());
        }
    }
}
