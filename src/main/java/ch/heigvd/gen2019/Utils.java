package ch.heigvd.gen2019;

import java.util.List;

public class Utils {
    static void displayList(StringBuffer sb, List<? extends ContentDisplayable> list) {
        sb.append(" [");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).getContents(sb);
        }

        if (list.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
    }
}
