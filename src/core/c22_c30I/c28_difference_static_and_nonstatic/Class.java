package core.c22_c30I.c28_difference_static_and_nonstatic;

class Class {
    static int staticField;
    int nonStaticField;

    static void staticMethodOne() {
        //Статические методы могут обращаться только к статическим сущностям
        staticField = 2;
        staticMethodTwo();
        //  Соответственно обращение к нестатическим полям, методам или экземплярам класса недоступны,
        //т.к. нет возможности указать с каким экземпляром нужно производить взаимодействие.
        /*
        this.nonStaticField();
        this.nonStaticMethodOne();
        super.parentNonStaticMethod();

        //Данный случай обращает внимание на следующее обстоятельство:
        //Статические поля и методы не наследуются, соответственно обращаться буквально не к чему
        super.parentStaticField = 2;
        super.parentStaticMethod();
        */


    }
    static void staticMethodTwo() {
    }
    void nonStaticMethodOne() {
        //В данном случае обращение происходит по ключевому слову 'this'
        nonStaticField = 2;
        nonStaticMethodTwo();
        //Обращение к статическим методам и полям доступно
        staticField = 2;
        staticMethodOne();
    }
    void nonStaticMethodTwo() {

    }
}
