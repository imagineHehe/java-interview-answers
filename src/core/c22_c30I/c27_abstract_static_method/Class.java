package core.c22_c30I.c27_abstract_static_method;

class Class {

    //Компилятор выдаст ошибку: "Illegal combination of modifiers: ‘abstract’ and ‘static'"
    //  Эти два модификатора противоречат друг другу. Модификатор 'abstract' указывает на то, что метод будет реализован
    //в классе-наследнике, 'static' же обязывает использовать метод по имени класса, т.е. в самом классе, что является
    //противоречием в отношении абстрактных классов и методов
    /*
    abstract static void abstractStaticMethod() {}
    */
}
