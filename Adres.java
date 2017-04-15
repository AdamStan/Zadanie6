package zadanie6;

public class Adres {
    private String city;
    private String street;
    private Integer numberOfBuilding;
    private NrTelefoniczny numberOfPhone;
    public Adres(String c, String s, int n, NrTelefoniczny num){
        city = c;
        street = s;
        numberOfBuilding = n;
        numberOfPhone = num;
    }
    public Adres(String c, String s, int n, int k, int num){
        city = c;
        street = s;
        numberOfBuilding = n;
        numberOfPhone = new NrTelefoniczny(k,num);
    }
    public Adres(Adres copy){
        city = copy.city;
        street = copy.street;
        numberOfBuilding = copy.numberOfBuilding;
        numberOfPhone = copy.numberOfPhone;
    }
    public String toString(){
        return String.format("%s, %s %s, %s", city, street, numberOfBuilding, numberOfPhone);
    }
    public NrTelefoniczny getNumberOfPhone(){
        return numberOfPhone;
    }
}
