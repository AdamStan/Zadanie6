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
        NrTelefoniczny numerek_main = new NrTelefoniczny(48,657249131);
        NrTelefoniczny numerek_1 = new NrTelefoniczny(48,717209814);
        NrTelefoniczny numerek_2 = new NrTelefoniczny(48,867200549);
        NrTelefoniczny numerek_comp1 = new NrTelefoniczny(48,857249131);
        NrTelefoniczny numerek_comp2 = new NrTelefoniczny(48,757219814);
        NrTelefoniczny numerek_comp3 = new NrTelefoniczny(48,681232549);

        Osoba human1 = new Osoba("Adam","Jestem","Opoczno to wies",numerek_main);
        Osoba human2 = new Osoba("Beata","Nowak","Łódź, Piotrkowska 138",numerek_1);
        Osoba human3 = new Osoba("Czesław","Kowalski","Łódź, Narutowicza 69",numerek_2);

        Firma company1 = new Firma("KFC","Ameryka",numerek_comp1);
        Firma company2 = new Firma("McDonald","Ameryka",numerek_comp2);
        Firma company3 = new Firma("Burger King","Jakieś niemieckie",numerek_comp3);

        human1.opis();
        human2.opis();
        human3.opis();

        company1.opis();
        company2.opis();
        company3.opis();
        
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(company1);
        System.out.println(company2);
        System.out.println(company3);

        TreeMap<NrTelefoniczny,Wpis> phoneBook = new TreeMap<>(); // Tylko to nie miało tak wyglądać
        //Czy ma sens rzutowanie wpisu???
        //To wszystko jest bez sensu...
        phoneBook.put(human1.number, human1);
        phoneBook.put(human2.number, human2);
        phoneBook.put(human3.number, human3);
        phoneBook.put(company1.number, company1);
        phoneBook.put(company2.number, company2);
        phoneBook.put(company3.number, company3);

        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry buff = (Map.Entry)it.next();
            System.out.print(buff.getKey() + " => ");
            System.out.println(buff.getValue());
        }
        /*Set keys = phoneBook.keySet();
        for (Iterator i = keys.iterator(); i.hasNext();) {
            
            System.out.println(key + " => " + value);
        }*/
    }
}
