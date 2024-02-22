package core.c11_c21I.c12_interfaces_without_methods;

import java.io.IOException;


//Интерфейсы без методов называются маркерными. Маркерные интерфейсы указывают на то, что класс,
// реализующий данный интерфейс поддерживает какой-либо механизм(в данном случае механизм клонирования)
class MarkInterfaceIml implements Cloneable {

    /*Реализация маркерного интерфейса означает лишь то, что класс обладает тем механизмом,
     который предполагает реализуемый интерфейс*/
    @Override
    public MarkInterfaceIml clone() {
        try {
            return (MarkInterfaceIml) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
class Main{
    public static void main(String[] args) throws IOException {
        MarkInterfaceIml markInterfaceIml = new MarkInterfaceIml();
        /*Без указания на реализацию интерфейса данный вызов метода вызвал бы ошибку, независимо от того,
         реализована ли такая функциональность или нет*/
        markInterfaceIml.clone();

    }
}
