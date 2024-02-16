package core.c10_interface;


//Основное предназначение интерфейса - определять каким образом мы можем использовать класс, который его реализует
public interface Interface {
    //Может содержать инициализированные public static final поля
    public static final String string = "string";

    /*Основной спектр использования интерфейсов - определение имен, списка аргументов и возвращаемого значения
    методов для будущего переопределения в классах-наследниках*/
    public String method(String string);

    //Может содержать дефолтную реализацию методов
    /*1)Может быть переопределен в классе-наследнике*/
    public default void defaultMethod(){
        System.out.println("default");
    }
    //Может содержать реализацию статических методов
    /*
    1)Не переопределяется в классах-наследниках
    2)Обращение к методу происходит ТОЛЬКО через интерфейс
    */
    public static void staticMethod(){
        System.out.println("static");
    }

}
