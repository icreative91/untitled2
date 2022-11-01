package lesson4hw;

public class Phone {
    private double lenght;
    private double width;
    private double height;
    private double weight;
    private String colour;
    private boolean plastic;
    private boolean glass;
    private String s;

    //---------------GETTERS/SETTERS---------------


    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isPlastic() {
        return plastic;
    }

    public void setPlastic(String plastic) {
        this.plastic = plastic.isEmpty();
    }

    public boolean isGlass() {
        return glass;
    }

    public void setGlass(boolean glass) {
        this.glass = glass;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
