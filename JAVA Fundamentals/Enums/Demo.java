
enum Status{
    Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args){
        // Status s = Status.Failed;
        Status[] s = Status.values();

        // System.err.println(s[0]);
        for(Status st : s){
            System.err.println(st + " : " + st.ordinal());
        }
    }
}
