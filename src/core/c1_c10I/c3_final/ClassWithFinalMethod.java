package core.c1_c10I.c3_final;

class ClassWithFinalMethod {
    //Не может быть переопределен
    protected final void finalMethod(){
        System.out.println("Вызов метода \"finalMethod\"");
    }
}
