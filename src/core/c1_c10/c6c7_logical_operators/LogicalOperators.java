package core.c1_c10.c6c7_logical_operators;

public class LogicalOperators {
    public void usingOperators(String a){
        if((1 & 2) == 0)
            System.out.println("Побитовый оператор \"AND\"");
        if(1 < 5 && 2 < 4)
            System.out.println("Оператор \"AND\"");
        if((1 | 2) == 3)
            System.out.println("Побитовый оператор \"OR\"");
        if(1 > 5 || 2 < 4)
            System.out.println("Оператор \"OR\"");
        if(1 < 5 ^ 2 < 5)
            System.out.println("Побитовый оператор \"XOR\"");
        if(1 == 2)
            System.out.println("Оператор \"Равно\"");
        if(1 != 2)
            System.out.println("Оператор \"Не равно\"");
        //Тернарный оператор, если условие дает "true" - результатом работы оператора будет выражение 1, иначе выражение 2
        System.out.println(1 < 2 ? true : false);
    }
}
