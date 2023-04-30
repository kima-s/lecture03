import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> usermap = new HashMap<>();
        usermap.put(1,"りんご");
        usermap.put(2,"みかん");
        usermap.put(3,"梨");

        System.out.println(usermap.get(1));
        System.out.println(usermap.get(2));
        System.out.println(usermap.get(3));
    }
}