package ch.heigvd.gen2019;

import java.util.List;

public class OrdersWriter {
    private List<Order> orders;

    public OrdersWriter(List<Order> orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            order.getOrderContents(sb);
        }

        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

}