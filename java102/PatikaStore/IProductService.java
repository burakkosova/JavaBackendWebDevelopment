package dev.patika;

public interface IProductService {
    void listAll();
    boolean delete(int id);
    boolean add(Product product);
    void listByBrand(String brandName);
}
