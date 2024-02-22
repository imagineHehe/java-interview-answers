package core.c22_c30I.c23_nonstatic_override_static_method;

class Class {
    //Да, могут
    static void nonStaticStaticMethod(String string) {
        System.out.println(string);
    }
    void nonStaticStaticMethod() {
        System.out.println("Its non-static method");
    }
}
