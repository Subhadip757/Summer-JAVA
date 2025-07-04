import java.util.HashMap;

public class day1 {
    public static void main(String[] args){
        HashMap<Integer, String> mpp = new HashMap<>();

        for(int i = 0; i < 10; i++){
            mpp.put(i, String.valueOf((char)('a' - i)));
        }
    }
}
