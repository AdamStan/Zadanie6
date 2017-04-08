package zadanie6;
public class Firma extends Wpis {
    private String name = "";
    private String adres = "";
    public NrTelefoniczny number = new NrTelefoniczny();
    /*Methods*/
    public Firma(){ }
    public Firma (String n, String l, NrTelefoniczny num){
        name = n;
        adres = l;
        number = num;
    }
    public void opis(){
        System.out.println("Nazwa: " + name);
        System.out.println("Adres: " + adres);
        System.out.println("Numer telefonu: " + number.toStringNowe());
    }
}
