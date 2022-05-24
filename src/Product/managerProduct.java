package Product;

import SetBinaryTree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class managerProduct  {
    Scanner sc = new Scanner(System.in);
    LinkedList<Product> listProduct = new LinkedList<>();

    public void menu() {
        System.out.println("----------Menu----------");
        System.out.println("1.Add product!");
        System.out.println("2.Edit product by id !");
        System.out.println("3.Delete product by id!");
        System.out.println("4.Display product list!");
        System.out.println("5.Sort product prices in descending order!");
        System.out.println("6.Find item product by id!");
        System.out.println("Input select of you :");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                editProduct();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                displayListProduct();
                break;
            case 5:
                sortPriceProductOder();
                break;
            case 6:
                findItemProduct();
                break;
        }
    }

    public Product CreatProduct() {
        System.out.println("Input id product:");
        int idProduct = Integer.parseInt(sc.nextLine());
        System.out.println("Input name product:");
        String nameProduct = sc.nextLine();
        System.out.println("Input kind product:");
        String kindProduct = sc.nextLine();
        System.out.println("Input price product:");
        double priceProduct = Double.parseDouble(sc.nextLine());
        return new Product(idProduct,nameProduct,kindProduct,priceProduct);
    }
    public void addProduct(){
        listProduct.addLast(CreatProduct());
    }
    public boolean idCheck(int idCheck) {
       for (int i=0;i<listProduct.size();i++){
           if (idCheck == listProduct.get(i).getIdProduct()) {
               return true;
           }
       }
        return false;
    }
    public void editProduct(){
        System.out.println("Input id of product you want edit:");
        int idEdit=Integer.parseInt(sc.nextLine());
        if(idCheck(idEdit)){
            for(int i=0;i<listProduct.size();i++){
                if(listProduct.get(i).getIdProduct()==idEdit){
                    listProduct.set(i,CreatProduct());
                }
            }
        }
        else {
            System.out.println("List product not id you want search!");
        }
    }
    public void deleteProduct(){
        System.out.println("Input id product you want delete:");
        int idDelete= Integer.parseInt(sc.nextLine());
        if(idCheck(idDelete)){
            for(int i=0;i<listProduct.size();i++){
                if(listProduct.get(i).getIdProduct()==idDelete){
                     listProduct.remove(i);
                }
            }
        }
        else {
            System.out.println("List product not id of product you want delete!");
        }
    }
    public void displayListProduct(){
        for(int i=0;i<listProduct.size();i++){
            System.out.println(listProduct.get(i));
        }
    }
    public void sortPriceProductOder(){
        listProduct.sort(new SortPriceProduct());
        for(int i=0;i<listProduct.size();i++){
            System.out.println(listProduct.get(i));
        }
    }
    public void findItemProduct(){
        System.out.println("Input id product you want find:");
        int idFind= Integer.parseInt(sc.nextLine());
        if(idCheck(idFind)){
            for(int i=0;i<listProduct.size();i++){
                if(listProduct.get(i).getIdProduct()==idFind){
                    System.out.println(listProduct.get(i));
                }
            }
        }
        else {
            System.out.println("Id you want is not invalid @");
        }
    }

}
