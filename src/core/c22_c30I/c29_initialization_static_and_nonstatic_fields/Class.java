package core.c22_c30I.c29_initialization_static_and_nonstatic_fields;

class Class {
    //И то и другое можно инициализировать при объявлении
    static int staticField = 2;
    int nonStaticField = 2;

    //Статические переменные можно инициализировать:
    static {
        //1)В статических блоках инициализации
        staticField = 2;
    }
    {
        //2)В нестатических блоках инициализации
        staticField = 2;
    }
    private Class () {
        //3)В конструкторе
        staticField = 2;
    }

    //Нестатические переменные можно инициализировать:

    {
        //1)В нестатических блоках инициализации
        nonStaticField = 2;
    }
    private Class(int a){
        //2)В конструкторе
        nonStaticField = a;
    }
}
