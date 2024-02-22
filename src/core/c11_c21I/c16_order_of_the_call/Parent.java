package core.c11_c21I.c16_order_of_the_call;

class Parent {
    {
        System.out.println("non-static block in Parent");
    }
    static {
        System.out.println("static block in Parent");
    }
    public Parent() {
        System.out.println("constructor in Parent");
    }
}
