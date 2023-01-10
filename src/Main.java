public class Main {
    public static void main(String[] args) {
        Kolekce kolekce = new Kolekce();
        kolekce.nactiSeznam();
        kolekce.pridejZakaznika(new Zakaznik("Petr Pavel", 69));
    }
}