import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> userMap = new HashMap<>();
        userMap.put(0,"りんご");
        userMap.put(1,"みかん");
        userMap.put(2,"梨");

        List<String> names = new ArrayList<>();
        names.add("新潟");
        names.add("東京");
        names.add("札幌");

        for(int n = 0;n <4;n++) {

            try {
                System.out.println(names.get(n) + "で採れた" + userMap.get(n));

            } catch (Exception e) {
                System.out.println("果物は採れません。");
            }

        }



    }
}