package Product;

import java.util.Comparator;

public class SortPriceProduct implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPriceProduct()>o2.getPriceProduct()){
            return -1;
        }
        return 1;
    }
}
