package core.c1_c10I.c2_modifiers.def;

public class AccessModifiers {

    //Внутри класса
    private static String privateString = "private";

    //Внутри пакета
    static String defaultString = "default";

    //Внутри пакета + наследникам
    protected static String protectedString = "protected";

    //В любом месте программы
    public static String publicString = "public";

    //Использование private переменной
    public static String returningValuePrivateField(){
        return privateString;
    }

}