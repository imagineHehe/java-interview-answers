package core.c16_order_of_the_call;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(GrandChild.field);
        System.out.println("----------------------");
        GrandChild grandChild = new GrandChild();
    }
    /*
    Порядок вызова конструктора и блоков инициализации с учетом иерархии:
    1. Статические блоки инициализации по цепочке, начиная с базового класса и заканчивая используемым классом
    2. Нестатические блоки инициализации и конструкторы
        2.1. Нестатический блок инициализации базового класса
        2.2. Конструктор базового класса
        2.3. Нестатический блок инициализации предка базового класса
        2.4. Конструктор предка базового класса
        2.n. Нестатический блок инициализации используемого класса
        2.n+1. Конструктор используемого класса
    */
}
