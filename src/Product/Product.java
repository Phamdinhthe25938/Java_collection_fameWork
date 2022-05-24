package Product;

public class Product {
    private int idProduct;
    private String nameProduct;
    private String kindProduct;
    private double priceProduct;

    public Product() {
    }
    public Product(int idProduct, String nameProduct, String kindProduct, double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.kindProduct = kindProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getKindProduct() {
        return kindProduct;
    }

    public void setKindProduct(String kindProduct) {
        this.kindProduct = kindProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "idProduct: " + getIdProduct() +
                ", nameProduct: " + getNameProduct() +
                ", kindProduct: " +getKindProduct()+
                ", priceProduct: " + getPriceProduct()
                ;
    }
}
