package zadanie6;
public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    int nrkierunkowy;
    long nrTelefonu;
    /*Methods*/
    public NrTelefoniczny(){
        nrkierunkowy = 0;
        nrTelefonu = 0;
    }
    public NrTelefoniczny(int k, long tele){
        nrkierunkowy = k;
        nrTelefonu = tele;
    }
    public String toStringNowe(){
        String buff;
        buff = String.valueOf(this.nrkierunkowy) + " " + String.valueOf(this.nrTelefonu);
        return buff;
    }
    public int compareTo(NrTelefoniczny other){
        boolean last_nrt = (this.nrTelefonu == other.nrTelefonu);
        boolean last_nrk = (this.nrkierunkowy == other.nrkierunkowy);
        return ((last_nrt == true) && (last_nrk == true)) ? 1 : 0;
    }
}
