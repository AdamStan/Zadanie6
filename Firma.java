package zadanie6;
class Firma extends Wpis{
    private String nazwa;
    private String adres;
    private NrTelefoniczny numer = new NrTelefoniczny();
    public Firma(String n, String a, NrTelefoniczny num){
      nazwa = n;
      adres = a;
      numer = num;
    }
    public Firma(Firma copy){
      nazwa = copy.nazwa;
      adres = copy.adres;
      numer = copy.numer;
    }
    public void opis(){
      System.out.println("Nazwa firmy: "+ nazwa);
      System.out.println("Adres: " + adres);
      System.out.println("Kontakt: " + numer);
    }
}
