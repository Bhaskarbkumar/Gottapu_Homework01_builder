package Builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllTexts {

    public static int count;
    public static List<String> ls = new ArrayList();

    public AllTexts() {
    }

    public static void printr(int duration) {
        for(int i = 0; i < 3; ++i) {
            Iterator var2 = ls.iterator();

            while(var2.hasNext()) {
                String text = (String)var2.next();
                System.out.println("Add a frame with " + text + " for " + duration + " seconds to the Movie");
            }
        }

    }
}
