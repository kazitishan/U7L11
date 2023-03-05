public class Address {
    private String streetNumber;
    private String streetName;
    private String aptNumber;
    private String city;
    private String zip;

    // takes in the separate pieces of the address and assigns them to the proper fields
    public Address (String streetNumber, String streetName, String aptNumber, String city, String zip){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.zip = zip;
    }

    // takes in an Address object and copies its information into the fields
    public Address(Address copy){
        this.streetNumber = copy.getStreetNumber();
        this.streetName = copy.getStreetName();
        this.aptNumber = copy.getAptNumber();
        this.city = copy.getCity();
        this.zip = copy.getZip();
    }

    // takes in an Address as a full String, breaks up the information, and copies into the fields
    public Address(String address){
        streetNumber = address.substring(0, address.indexOf(" "));
        address = address.substring(address.indexOf(" ") + 1);
        streetName = address.substring(0, address.indexOf(" "));
        address = address.substring(address.indexOf(" "));
        streetName += address.substring(0, address.indexOf(" "));
        if (address.substring(0, address.indexOf(" ")).equals("Apt")){
            aptNumber = address.substring(0, address.indexOf(" "));
            address = address = address.substring(address.indexOf(" ") + 1);
            aptNumber += address.substring(0, address.indexOf(","));
        }
        else {
            aptNumber = null;

        }

    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString(){
        String address = streetNumber + " " + streetName + " ";
        if (aptNumber != null){
            address += "Apt " + aptNumber + ", ";
        }
        address += city + " " + zip;
        return address;
    }
}
