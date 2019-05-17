package ch.heigvd.gen2019;

import ch.heigvd.color.Color;
import ch.heigvd.color.NoColor;
import ch.heigvd.size.NoSize;
import ch.heigvd.size.Size;

public class Product {
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;

        if(color == null) {
            color = new NoColor();
        }

        this.color = color;

        if(size == null) {
            size = new NoSize();
        }

        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public void getContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(color);
        sb.append("\", ");

        if (!size.getClass().equals(NoSize.class)) {
            sb.append("\"size\": \"");
            sb.append(size);
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");
    }
}