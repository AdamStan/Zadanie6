package zadanie6;
public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    private Integer nrkierunkowy;
    private Integer nrTelefonu;
    /*Methods*/
    public NrTelefoniczny(){
        nrkierunkowy = 0;
        nrTelefonu = 0;
    }
    public NrTelefoniczny(Integer k, Integer tele){
        nrkierunkowy = k;
        nrTelefonu = tele;
    }
    public NrTelefoniczny(NrTelefoniczny copy){
        nrkierunkowy = copy.nrkierunkowy;
        nrTelefonu = copy.nrTelefonu;
    }
    public String toString(){
        return String.format("%d %d", nrkierunkowy, nrTelefonu);
    }
    public int compareTo(NrTelefoniczny other){ //pozwala porownywac obiekty
        boolean last_nrt = this.nrTelefonu.equals(other.nrTelefonu);
        boolean last_nrk = this.nrkierunkowy.equals(other.nrkierunkowy);
        if((last_nrt == true) && (last_nrk == true)) return 0;
        else if(last_nrk == true || last_nrt == true) return -1;
        else return 1;
    }
    public int getNrkierunkowy(){
        Integer buff = new Integer(nrkierunkowy);
        /* Integer jest klasą, zwracana jest referencja do obiektu
        kiedy mamy:
        return nrkierunkowy;
        to zwracamy referencje do obiektu (nie wartość)
        dlatego musisz utworzyc nowy obiekt, nie bedzie mozliwosci
        modyfikowania wartosci prywatnej dzieki temu*/
        return buff;
    }
    public long getNrTelefonu(){
        Integer buff = new Integer(nrTelefonu);
        return buff;
    }
}
