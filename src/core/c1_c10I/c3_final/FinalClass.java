package core.c1_c10I.c3_final;

//Не может иметь наследников
final class FinalClass extends ClassWithFinalMethod{
    //Не может изменить значение после инициализации
    public final String FINAL_STRING = "final string";
    //Требует инициализации в конструкторе класса
    public final String UNINITIALIZED_FINAL_STRING;

    public FinalClass(){
        UNINITIALIZED_FINAL_STRING = "initialized final string";
    }
    public void changeFinalFieldValue(final String stringParameter){
        /*FINAL_STRING = "new value";*/
        /*stringParameter = "new value";*/
        /*UNINITIALIZED_FINAL_STRING = "new value";*/
    }

    /*
    @Override
    protected void finalMethod() {
        System.out.println("Вызов переопределенного метода \"finalMethod\"");
    }*/

}
/*
class FinalClassChild extends FinalClass{}
*/


