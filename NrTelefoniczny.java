package zadanie6;
public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    Integer nrkierunkowy;
    Integer nrTelefonu;
    /*Methods*/
    public NrTelefoniczny(){
        nrkierunkowy = 0;
        nrTelefonu = 0;
    }
    public NrTelefoniczny(Integer k, Integer tele){
        nrkierunkowy = k;
        nrTelefonu = tele;
    }
    public String toString(){
        return String.format("%d %d", nrkierunkowy, nrTelefonu);
    }
    public int compareTo(NrTelefoniczny other){
        boolean last_nrt = this.nrTelefonu.equals(other.nrTelefonu);
        boolean last_nrk = this.nrkierunkowy.equals(other.nrkierunkowy);
        if((last_nrt == true) && (last_nrk == true)) return 0;
        else return 1;
    }
    public int getNrkierunkowy(){
        return nrkierunkowy;
    }
    public long getNrTelefonu(){
        return nrTelefonu;
    }
}
