package bookingSystem;

public class Address {
    String vilage;
    String City;
    String District;
    String state;
    int pin;

    public Address(String vilage, String city, String district, String state, int pin) {
        this.vilage = vilage;
        City = city;
        District = district;
        this.state = state;
        this.pin = pin;
    }

    public String getVilage() {
        return vilage;
    }

    public void setVilage(String vilage) {
        this.vilage = vilage;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "vilage='" + vilage + '\'' +
                ", City='" + City + '\'' +
                ", District='" + District + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
