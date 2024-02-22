package core.c11_c21I.c16_order_of_the_call;

class Child extends Parent{
    {
        System.out.println("non-static block in Child");
    }
    static {
        System.out.println("static block in Child");
    }
    public Child() {
        System.out.println("constructor in Child");
    }
}
