package MAR15.REALATIONSHIP;

public class ADDRESS {
    private String streetNumber;
    private String city;
    private String province;
    private String country;
    private String postalCode;

    ///  creating constructor
    public ADDRESS(String streetNumber, String city, String province, String country, String postalCode) {
        this.streetNumber = streetNumber;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
    }

    ///  creating getter and setter

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    ///  creating toString
    @Override
    public String toString() {
        return "ADDRESS{" +
                "streetNumber='" + streetNumber + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
