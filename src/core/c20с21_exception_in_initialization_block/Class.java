package core.c20с21_exception_in_initialization_block;

class Class {

    static {
        /*Попытка выбросить исключение явным образом выдаст ошибку компиляции*/
        //throw new OutOfMemoryError();

        //При выбрасывании unchecked исключения неявным образом инициализация класса не состоится
        //Если исключение наследовано от RuntimeException выбросится:
        // java.lang.ExceptionInInitializerError
        throwingRuntimeException();
        //Если исключение наследовано от Error выбросится исключение - источник
        throwingError();
    }

    {
        //Если исключение наследовано от RuntimeException выбросится исключение - источник
        throwingRuntimeException();
        //Если исключение наследовано от Error, также выбросится исключение - источник
    }
    public Class() throws IndexOutOfBoundsException {
    }
    private static void throwingRuntimeException() {
        throw new RuntimeException();
    }
    private static void throwingError() {
        throw new Error();
    }
}
class Main{
    public static void main(String[] args) {
        Class clas = new Class();
    }
}
