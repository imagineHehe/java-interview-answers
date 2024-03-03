package core.c22_c30I.c28_difference_static_and_nonstatic;

class Main {
    public static void main(String[] args) {
        //  Модификатор 'static' говорит, что поле или метод принадлежит самому классу,
        //обращение к таким сущностям осуществляется по имени самого класса и они имеют
        //единичный экземпляр.
        Class.staticField = 2;
        Class.staticMethodOne();

        //  Нестатические сущности обладают противоположное значение и не имеют ограничений
        //(за исключением очевидного обращения по имени класса)
        Class classInstance = new Class();
        classInstance.nonStaticField = 2;
        classInstance.nonStaticMethodOne();
    }
}
