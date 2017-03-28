package zadanie6;
//import org.joou.Unsigned.*;

class NrTelefoniczny {
    private int nrkierunkowy;
    private int nrTelefonu;
    public NrTelefoniczny(){
      nrkierunkowy = 0;
      nrTelefonu = 0;
    }
    public NrTelefoniczny(int k, int nt){
      nrkierunkowy = k;
      nrTelefonu = nt;
    }
    public NrTelefoniczny(NrTelefoniczny copy){
      nrkierunkowy = copy.nrkierunkowy;
      nrTelefonu = copy.nrTelefonu;
    }
}
