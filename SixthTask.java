   /* Napisz klase NrTelefoniczny, posiadajaca 2 pola: nrkierunkowy i nrTelefonu i implementujaca interfejs Comparable. Nastepnie utworz abstrakcyjna klase Wpis a nastepnie dziedziczace z niej klasy Osoba i Firma. Klasa Wpis ma abstrakcyjna metode opis, ktora opisuje dany wpis. Byc moze ma rowniez inne metody abstrakcyjne lub nie w miare potrzeb. Klasa Osoba ma zawierac informacje o imieniu, nazwisku, adresie i (w tym nrTelefonu). Klasa Firma ma miec nazwe i adres( w tym NrTelefonu). Utworz kilka obiektow klasy Osoba i kilka obiektow klasy Firma i umiesc je w kontenerze TreeMap, poslugujac sie jako kluczem numerem telefonicznym. Nastepnie wypisz utworzona w ten sposob ksiazke telefoniczna za pomoca iteratora. */
package zadanie6;

class SixthTask {
    public static void main(String[] args){
        Osoba czlowiek1 = new Osoba(imie, nazwisko, adres, nrtelefonu);
        Firma przedsiebiorstwo1 = new Firma(nazwa, adres, nrtelefonu);
    }
}