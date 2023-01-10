import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kolekce kolekce = new Kolekce();
        kolekce.nactiSeznam();
        kolekce.pridejZakaznika(new Zakaznik("Petr Pavel", 69));
        List<Zakaznik> seznam = kolekce.ziskejSeznamZakazniku();
        for(Zakaznik zakaznik: seznam){
            System.out.println(zakaznik.getJmeno() + " - " + zakaznik.getPocetProdeju());
        }
    }
}