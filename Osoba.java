package zadanie6;
class Osoba extends Wpis {
    private String imie;
    private String nazwisko;
    private String adres;
    private NrTelefoniczny numer = new NrTelefoniczny();
    public Osoba(String n, String s,String a,NrTelefoniczny num){
      imie = n;
      nazwisko = s;
      adres = a;
      numer = num;
    }
    public Osoba(Osoba copy){
      imie = copy.imie;
      nazwisko = copy.nazwisko;
      adres = copy.adres;
      numer = copy.numer;
    }
    public void opis(){
      System.out.println("Imie i nazwisko: "+ imie + " "+nazwisko);
      System.out.println("Adres: " + adres);
      System.out.println("Kontakt: " + numer);
    }
}
