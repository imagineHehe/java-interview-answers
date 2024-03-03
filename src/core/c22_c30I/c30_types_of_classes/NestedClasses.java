package core.c22_c30I.c30_types_of_classes;

class NestedClasses {
    //Вложенный статический класс
    static class StaticNestedClass {

    }
    //Обычный вложенный класс
    class InnerClass {
    }

    void method() {
        //Локальный класс
        class LocalInnerClass {

        }
        //Анонимный класс
        AbstractClass abstractClass = new AbstractClass() {
        };
    }
}
