package zadanie6;
public class Firma extends Wpis {
    private String name = "";
    private Adres adres = ""; //trzeba pomyslec nad nazwami
    public NrTelefoniczny number;
    /*Methods*/
    public Firma(){ }
    public Firma (String n, Adres a, NrTelefoniczny num){
        name = n;
        adres = l; 
        number = num;
    }
    public Firma (String n, String l, Integer k, Integer num){
        name = n;
        adres = l; 
        number = new NrTelefoniczny(k,num);
    }
    public Firma(Firma copy){
        name = copy.name;
        adres = copy.adres;
        number = copy.number;
    }
    public void opis(){ 
        System.out.println("Nazwa: " + name);
        System.out.println("Adres " + adres);
        System.out.println("Numer telefonu " + number);
    }
    public String toString(){
        return String.format("%s, %s, %s", name, adres, number);
    }
}