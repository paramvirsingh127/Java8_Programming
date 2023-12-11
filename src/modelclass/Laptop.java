package modelclass;

import java.util.List;

public class Laptop implements Comparable<Laptop>{

    String brand;
    String name;
    int price;
    int ram;
    int internal_storage;


    public Laptop(String brand, String name, int price, int ram, int internal_storage) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.internal_storage = internal_storage;
    }

    public String getBrand(List<Laptop> listgroup) {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getInternal_storage() {
        return internal_storage;
    }

    public void setInternal_storage(int internal_storage) {
        this.internal_storage = internal_storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                ", internal_storage=" + internal_storage +
                '}';
    }

    @Override
    public int compareTo(Laptop list2) {
        if (this.getPrice() > list2.getPrice())
        return 1;
        else
            return -1;
    }
}
