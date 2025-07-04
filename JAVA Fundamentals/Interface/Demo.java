
public class Demo {
    interface A {
        void show();
    }

    interface B{
        void hide();
    }

    class Example implements A,B{
        void show(){
            System.out.println("Hello Show Method");
        }

        void hide(){
            System.out.println("Hide method");
        }
    }
    public static void main(){

    }
}
