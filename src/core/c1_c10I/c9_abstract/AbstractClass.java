package core.c1_c10I.c9_abstract;

//Описывает общее поведение для потомков/шаблон
abstract class AbstractClass {
    //Обычный метод
    public String notAbstractMethod(){
        return "notAbstract";
    }
    //Абстрактный метод: не имеет реализации, должен быть реализован в классе-наследнике
    public abstract void abstractMethod();
}

class AbstractClassChild extends AbstractClass {
    //Запрещено создавать экземпляры абстрактного класса
    /*AbstractClass abstractClass = new AbstractClass();*/

    @Override
    public void abstractMethod() {
        System.out.println("Реализация в классе-наследнике");
    }
}
