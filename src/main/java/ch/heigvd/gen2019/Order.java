package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order implements ContentDisplayable {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public void getContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(id);
        sb.append(", ");
        sb.append("\"products\":");

        // nous n'avons pas eut de meilleur idée pour résoudre la duplication de code
        Utils.displayList(sb, products);

        sb.append("}, ");
    }
}
