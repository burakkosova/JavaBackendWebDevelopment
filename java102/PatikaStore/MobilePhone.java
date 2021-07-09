package dev.patika;

public class MobilePhone extends Product{
    private int storage;
    private double screenSize;
    private double battery;
    private int ram;
    private int camera;
    private String color;

    public MobilePhone(double price, double discount, int stockAmount, String name, Brand brand, int storage, double screenSize, double battery, int ram, int camera, String color) {
        super(price, discount, stockAmount, name, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.camera = camera;
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
