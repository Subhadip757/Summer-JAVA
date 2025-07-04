public class Demo {
    abstract class AC{
        int a = 10;

        abstract void show();
    }

    class subAc extends AC{
        @Override
        void show(){
            System.out.println("The value of a: " + a);
        }
    }
    public static void main(String args[]){
        Demo dem = new Demo();
        subAc obj = dem.new subAc();

        obj.show();
    }
}
