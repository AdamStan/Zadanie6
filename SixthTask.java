/* Napisz klase NrTelefoniczny, posiadajaca 2 pola: nrkierunkowy i nrTelefonu i implementujaca interfejs Comparable.
Nastepnie utworz abstrakcyjna klase Wpis a nastepnie dziedziczace z niej klasy Osoba i Firma. Klasa Wpis ma
abstrakcyjna metode opis, ktora opisuje dany wpis. Byc moze ma rowniez inne metody abstrakcyjne lub nie w miare
potrzeb. Klasa Osoba ma zawierac informacje o imieniu, nazwisku, adresie i (w tym nrTelefonu). Klasa Firma ma miec
nazwe i adres( w tym NrTelefonu). Utworz kilka obiektow klasy Osoba i kilka obiektow klasy Firma i umiesc je w
kontenerze TreeMap, poslugujac sie jako kluczem numerem telefonicznym. Nastepnie wypisz utworzona w ten sposob
ksiazke telefoniczna za pomoca iteratora. */
package zadanie6;

class SixthTask {
    public static void main(String[] args){
        NrTelefoniczny number1 = new NrTelefoniczny(48,665321236);
        NrTelefoniczny number2 = new NrTelefoniczny(48,890217654);
        Osoba czlowiek1 = new Osoba("Adam", "Jestem", "Opoczno to wies", number1);
        Firma przedsiebiorstwo1 = new Firma("CostamPOL","Warszawa na 100%", number2);
        czlowiek1.opis();
        przedsiebiorstwo1.opis();
    }
}
