package dev.patika;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotebookManager implements IProductService{
    private List<Notebook> notebooks;

    public NotebookManager() {
        this.notebooks = new ArrayList<>();
        notebooks.add(new Notebook(7000,0,5120,"HUAWEI Matebook 14",new Brand("Huawei"),16, 512,14.0));
        notebooks.add(new Notebook(3699,0,5120,"LENOVO V14 IGL",new Brand("Lenovo"),8, 1024,14.0));
        notebooks.add(new Notebook(8199 ,0,5120,"ASUS Tuf Gaming",new Brand("Asus"),32, 2048,15.6));
    }

    @Override
    public void listAll() {
        System.out.println("\nNotebook Listesi\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-5d |%n";
        System.out.format("---------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Ürün Adı                  | Fiyat       | Marka     | Depolama   | Ekran     | RAM   |%n");
        System.out.format("---------------------------------------------------------------------------------------------%n");
        for(Notebook n : this.notebooks){
            System.out.format(leftAlignFormat, n.getId(), n.getName(),n.getPrice()+" TL",n.getBrand().getName(),n.getStorage(),n.getScreenSize(),n.getRam());
        }
        System.out.format("---------------------------------------------------------------------------------------------%n");
    }

    @Override
    public boolean delete(int id) {
        return this.notebooks.removeIf(n -> n.getId() == id);
    }

    @Override
    public boolean add(Product product) {
        return this.notebooks.add((Notebook) product);
    }

    @Override
    public void listByBrand(String brandName) {
        System.out.println("\nNotebook Listesi\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-5d |%n";
        System.out.format("---------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Ürün Adı                  | Fiyat       | Marka     | Depolama   | Ekran     | RAM   |%n");
        System.out.format("---------------------------------------------------------------------------------------------%n");
        List<Notebook> filtered = notebooks.stream().filter(n -> n.getBrand().getName().equalsIgnoreCase(brandName)).collect(Collectors.toList());
        for(Notebook n : filtered){
            System.out.format(leftAlignFormat, n.getId(), n.getName(),n.getPrice()+" TL",n.getBrand().getName(),n.getStorage(),n.getScreenSize(),n.getRam());
        }
        System.out.format("---------------------------------------------------------------------------------------------%n");
        System.out.println();
    }

}
