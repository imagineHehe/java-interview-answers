package core.c22_c30I.c25_changes_during_override;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Child extends Parent{
    //Понижать уровень доступа нельзя
    /*
    @Override
    private void changingAccessLevel() {
        super.changingAccessLevel();
    }*/

    //А повышать можно
    @Override
    protected void changingAccessLevel() {
        super.changingAccessLevel();
    }

    //При изменении сигнатуры аргументов вместо переопределения будет происходить перегрузка(overloading)
//   @Override
    protected void changingArguments(int integer) {}


    //Секцию throws можно не указывать, но при этом переопределенный метод её лишается(не перенимается от родительского)
//    @Override
//    protected void changingThrows(){

    //Можно изменить порядок следования элементов в throws, никаких изменений при этом не последует
//    @Override
//    protected void changingThrows() throws ReflectiveOperationException, IOException {
//        super.changingThrows();
//    }

    // Можно добавлять новые исключения при условии:
    //Проверяемое исключение должно быть наследником исключений, объявленных в переопределяемом методе
    //Непроверяемые исключения такого требования не имеют
//    @Override
//    protected void changingThrows() throws IOException, ReflectiveOperationException,
//            FileNotFoundException, IndexOutOfBoundsException {
//        super.changingThrows();
//    }
}
