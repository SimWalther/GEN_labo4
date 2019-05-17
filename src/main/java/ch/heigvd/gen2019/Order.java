package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public void getOrderContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(id);
        sb.append(", ");
        sb.append("\"products\": [");

        for (int j = 0; j < products.size(); j++) {

            products.get(j).getContents(sb);
        }

        if (products.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");
    }
}
