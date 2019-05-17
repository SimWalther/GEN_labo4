package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public void getOrderContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");

        for (int j = 0; j < getProductsCount(); j++) {

            getProduct(j).getContents(sb);
        }

        if (getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");
    }
}
