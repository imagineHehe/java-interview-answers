package core.c3_final;

public class ClassWithFinalMethod {
    //Не может быть переопределен
    protected final void finalMethod(){
        System.out.println("Вызов метода \"finalMethod\"");
    }
}
