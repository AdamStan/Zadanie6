package zadanie6;
/**
 * Napisz klase NrTelefoniczny, posiadajaca 2 pola: nrkierunkowy i nrTelefonu i implementujaca
 * interfejs Comparable. Nastepnie utworz abstrakcyjna klase Wpis a nastepnie dziedziczace z
 * niej klasy Osoba i Firma. Klasa Wpis ma abstrakcyjna metode opis, ktora opisuje dany wpis.
 * Byc moze ma rowniez inne metody abstrakcyjne lub nie w miare potrzeb. Klasa Osoba ma zawierac
 * informacje o imieniu, nazwisku, adresie i (w tym nrTelefonu). Klasa Firma ma miec nazwe i
 * adres( w tym NrTelefonu). Utworz kilka obiektow klasy Osoba i kilka obiektow klasy Firma i
 * umiesc je w kontenerze TreeMap, poslugujac sie jako kluczem numerem telefonicznym. Nastepnie
 * wypisz utworzona w ten sposob ksiazke telefoniczna za pomoca iteratora.
 */
 import java.util.TreeMap;
 import java.util.Iterator;
 import java.util.Set;
 import java.util.Map;

public class Zadanie6 {
    public static void main(String[] args) {

        Osoba human1 = new Osoba("Adam","Jestem","Opoczno","Piotrkowska",120,48,657249131);
        Osoba human2 = new Osoba("Beata", "Nowak", "Łódź", "Kościuszki", 138, 48, 717209814);
        Osoba human3 = new Osoba("Czesław", "Kowalski", "Łódź", "Narutowicza", 69, 48, 867200549);

        Firma company1 = new Firma("KFC", "Warszawa", "Aleje Jerozolimskie", 102, 48, 857249131);
        Firma company2 = new Firma("McDonald", "Warszawa", "Aleje Jerozolimskie", 94, 48, 757219814);
        Firma company3 = new Firma("Burger King", "Warszawa", "Aleje Jerozolimskie", 16, 48, 681232549);

        human1.opis();
        human2.opis();
        human3.opis();
        company1.opis();
        company2.opis();
        company3.opis();

        TreeMap<NrTelefoniczny,Wpis> phoneBook = new TreeMap<NrTelefoniczny,Wpis>();
        phoneBook.put(human1.getAdres().getNumberOfPhone(), human1);
        phoneBook.put(human2.getAdres().getNumberOfPhone(), human2);
        phoneBook.put(human3.getAdres().getNumberOfPhone(), human3);
        phoneBook.put(company1.getAdres().getNumberOfPhone(), company1);
        phoneBook.put(company2.getAdres().getNumberOfPhone(), company2);
        phoneBook.put(company3.getAdres().getNumberOfPhone(), company3);

        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry buff = (Map.Entry)it.next();
            System.out.print(buff.getKey() + " => ");
            System.out.println(buff.getValue());
        }
    }
}
