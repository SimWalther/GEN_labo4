package ch.heigvd.gen2019;

import java.util.List;

public class OrdersWriter {
    private List<Order> orders;

    public OrdersWriter(List<Order> orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\":");

        // nous n'avons pas eut de meilleur idée pour résoudre la duplication de code
        Utils.displayList(sb, orders);

        return sb.append("}").toString();
    }

}