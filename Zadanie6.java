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
 import java.util.*;

public class Zadanie6 {
    public static void main(String[] args) {

        NrTelefoniczny numerek_main = new NrTelefoniczny(48,657249131);
        NrTelefoniczny numerek_1 = new NrTelefoniczny(48,757209814);
        NrTelefoniczny numerek_2 = new NrTelefoniczny(48,867200549);

        Osoba human1 = new Osoba("Adam","Jestem","Opoczno to wies",numerek_main);
        Osoba human2 = new Osoba("Beata","Nowak","Łódź, Piotrkowska 138",numerek_1);
        Osoba human3 = new Osoba("Czesław","Kowalski","Łódź, Narutowicza 69",numerek_2);

        Firma company1 = new Firma("KFC","Ameryka",numerek_main);
        Firma company2 = new Firma("McDonald","Ameryka",numerek_main);
        Firma company3 = new Firma("Burger King","Jakieś niemieckie",numerek_main);

        human1.opis();
        human2.opis();
        human3.opis();

        company1.opis();
        company2.opis();
        company3.opis();

        Map<NrTelefoniczny,Osoba> phoneBook = new TreeMap<>();
        phoneBook.put(human1.number, human1);

        System.out.println(phoneBook);
    }
}
