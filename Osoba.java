package zadanie6;
public class Osoba extends Wpis {
    private String name = "";
    private String surname = "";
    private String adres = "";
    public NrTelefoniczny number = new NrTelefoniczny();
    /*Methods*/
    public Osoba(){    }
    public Osoba(String n, String s, String l, NrTelefoniczny num){
        name = n;
        surname = s;
        adres = l;
        number = num;
    }
    public Osoba(Osoba copy){
        name = copy.name;
        surname = copy.surname;
        adres = copy.adres;
        number = copy.number;
    }
    public void opis(){
        System.out.println("Imię i nazwisko: " + name + " " + surname);
        System.out.println("Adres " + adres);
        System.out.println("Numer telefonu " + number);
    }
    public String toString(){
        return String.format("%s %s, %s, %s",name, surname, adres, number);
    }
}
