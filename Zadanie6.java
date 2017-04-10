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
        Osoba human1 = new Osoba("Adam","Jestem","Opoczno to wies",48,657249131);
        Osoba human2 = new Osoba("Beata","Nowak","Łódź, Piotrkowska 138",48,717209814);
        Osoba human3 = new Osoba("Czesław","Kowalski","Łódź, Narutowicza 69",48,867200549);

        Firma company1 = new Firma("KFC","Ameryka",48,857249131);
        Firma company2 = new Firma("McDonald","Ameryka",48,757219814);
        Firma company3 = new Firma("Burger King","Jakieś niemieckie",48,681232549);
        
        human1.opis();
        human2.opis();
        human3.opis();
        company1.opis();
        company2.opis();
        company3.opis();
        
        TreeMap<String,Wpis> phoneBook = new TreeMap<String,Wpis>();
        //Dlaczego wszystkie numery są takie same???
        //W sensie kompilator je tak widzi
        phoneBook.put(human1.number.toString(), human1);
        phoneBook.put(human2.number.toString(), human2);
        phoneBook.put(human3.number.toString(), human3);
        phoneBook.put(company1.number.toString(), company1);
        phoneBook.put(company2.number.toString(), company2);
        phoneBook.put(company3.number.toString(), company3);

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
