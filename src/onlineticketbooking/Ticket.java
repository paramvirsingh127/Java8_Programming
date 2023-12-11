package onlineticketbooking;

public class Ticket {
    private String red;
    private String green;
    private String yellow;

    public Ticket(String red, String green, String yellow) {
        this.red = red;
        this.green = green;
        this.yellow = yellow;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }
}
