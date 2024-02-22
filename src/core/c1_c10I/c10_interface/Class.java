package core.c1_c10I.c10_interface;

public class Class implements Interface{
    @Override
    public String method(String string) {
        return string;
    }
    @Override
    public void defaultMethod() {
        Interface.super.defaultMethod();
    }
}

class Main{
    public static void main(String[] args) {
        Class clas = new Class();
        Interface.staticMethod();
        clas.defaultMethod();
    }
}
