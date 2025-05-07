package Task_4;

public class TV {
    private String model;
    private int year;
    private double price;
    private double diagonal;
    private String manufacturer;

    public TV(String model, int year, double price, double diagonal, String manufacturer) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
