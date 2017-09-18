package zadanie6;
public class Osoba extends Wpis {
    private String name;
    private String surname;
    private Adres location; //trzeba pomyslec nad nazwami
    /*Methods*/
    public Osoba(String n, String s, Adres l){
        name = n;
        surname = s;
        location = l;
    }
    public Osoba(String n, String s, String ncity, String nstreet, String nofb, NrTelefoniczny num){
        name = n;
        surname = s;
        location = new Adres(ncity,nstreet,nofb,num);
    }
    public Osoba(String n, String s, String ncity, String nstreet, String nofb, int k, int num){
        name = n;
        surname = s;
        location = new Adres(ncity,nstreet,nofb,new NrTelefoniczny(k,num));
    }
    public Osoba(Osoba copy){
        name = copy.name;
        surname = copy.surname;
        location = copy.location;
    }
    public void opis(){
        System.out.println("Imię i nazwisko: " + name + " " + surname);
        System.out.println("Adres: " + location);
    }
    public String toString(){
        return String.format("%s %s, %s",name, surname, location);
    }
    public Adres getAdres(){
        Adres buff = new Adres(location);
        return buff;
    }
}
