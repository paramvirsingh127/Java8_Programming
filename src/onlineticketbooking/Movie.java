package onlineticketbooking;

import java.util.Scanner;

public class Movie {
    private String name;
    private String theatername;

    private int noofticket;

    private int cost;



    Movie(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the movie:");
        this.name = sc.nextLine();
        System.out.println("Enter the name of the theater:");
        this.theatername = sc.nextLine();
        System.out.println("Enter the No. of ticket:");
        this.noofticket = sc.nextInt();
        System.out.println("Enter the cost per ticket:");
        this.cost = sc.nextInt();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheatername() {
        return theatername;
    }

    public void setTheatername(String theatername) {
        this.theatername = theatername;
    }

    public int getNoofticket() {
        return noofticket;
    }

    public void setNoofticket(int noofticket) {
        this.noofticket = noofticket;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    void storeAllDetails(String name, String theatername,  int noofticket, int cost) {
        this.name = name;
        this.theatername = theatername;
        this.noofticket = noofticket;
        this.cost = cost;
    }
    void viewAllDetails(){
        System.out.println("Movie name :"+name);
        System.out.println("Theater name :"+theatername);
        System.out.println("No. of ticket"+noofticket);
        System.out.println("Cost of the ticket:"+cost);
    }

}
