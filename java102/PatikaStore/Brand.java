package dev.patika;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;
    private static int count=0;

    public Brand(String name) {
        this.id = ++count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
