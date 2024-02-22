package core.c11_c21I.c18_static;

//Модификатор static применим:

//К импорту статических методов, для их использования напрямую, без указания имени класса
import static java.util.Arrays.sort;


class Class {
    //К полям
    static String staticField;

    //К блокам инициализации
    static {
        staticField = "Static field";
    }

    //К методам
    static void staticMethod() {
        System.out.println(staticField);
        int [] array = {2, 1, 0};
        //Пример использования модификатора static к import
        sort(array);
    }

    //К вложенным классам
    static class NestedClass{

    }
}
