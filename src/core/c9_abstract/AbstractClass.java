package core.c9_abstract;

//Описывает общее поведение для потомков/шаблон
public abstract class AbstractClass {
    //Обычный метод
    public String notAbstractMethod(){
        return "notAbstract";
    }
    //Абстрактный метод: не имеет реализации, должен быть реализован в классе-наследнике
    public abstract void abstractMethod();
}

class ChildAbstractClass extends AbstractClass {
    //Запрещено создавать экземпляры абстрактного класса
    /*AbstractClass abstractClass = new AbstractClass();*/

    @Override
    public void abstractMethod() {
        System.out.println("Реализация в классе-наследнике");
    }
}
