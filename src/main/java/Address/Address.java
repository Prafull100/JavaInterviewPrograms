package Address;

public class Address {

    private String streetName;
    private String city;
    private String state;
    private  String postalCode;

    public String getStreetName(){

        return  streetName;
    }

    public  void setStreetName(String streetName){

        this.streetName=streetName;
    }

    public String getCity(){

        return  city;
    }

    public  void setCity(String city){

        this.city=city;
    }

    public String getState(){

        return  state;
    }

    public  void setState(String state){

        this.state=state;
    }

    public String getPostalCode(){

        return  postalCode;
    }

    public  void getPostalCode(String postalCode){

        this.postalCode=postalCode;
    }
}
