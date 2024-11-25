package web.model;

public class Car {

    private String marka;
    private String color;
    private int year;
    public Car() {
    }

    public Car(String marka, String color, int year) {
        this.marka = marka;
        this.color = color;
        this.year = year;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
