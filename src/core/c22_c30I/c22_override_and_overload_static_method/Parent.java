package core.c22_c30I.c22_override_and_overload_static_method;

class Parent {
    public static void staticMethod(){
        System.out.println("nothingInParent");
    }
    //Перегрузка статических методов доступна без ограничений
    public static void staticMethod(String string){
        System.out.println(string);
    }
}
