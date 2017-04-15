package zadanie6;
public class Firma extends Wpis {
    private String name = "";
    private Adres location;
    /*Methods*/
    public Firma (String n, Adres l){
        name = n;
        location = l;
    }
    public Firma (String n, String city, String street, int number, int k, int num){
        name = n;
        location = new Adres(city,street,number,new NrTelefoniczny(k,num));
    }
    public Firma(Firma copy){
        name = copy.name;
        location = copy.location;
    }
    public void opis(){
        System.out.println("Nazwa: " + name);
        System.out.println("Adres: " + location);
    }
    public String toString(){
        return String.format("%s, %s ", name, location);
    }
    public Adres getAdres(){
        return location;
    }
}
