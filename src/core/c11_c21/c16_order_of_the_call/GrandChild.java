package core.c11_c21.c16_order_of_the_call;

public class GrandChild extends Child{
    public static String field = "Static field";

    {
        System.out.println("non-static block in GrandChild");
    }
    static {
        System.out.println("static block in GrandChild");
    }
    public GrandChild() {
        System.out.println("constructor in GrandChild");
    }
}
