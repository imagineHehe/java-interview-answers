package core.c11_c21I.c15_access_to_private_field;

import java.lang.reflect.Field;

class Main {
    public static void main(String[] args) {
        //Способ 1
        ClassWitchPrivateField classWitchPrivateField = new ClassWitchPrivateField();
        String methodOneTwo = classWitchPrivateField.getPrivateField();
        String methodTwoOne = classWitchPrivateField.printPrivateField();

        //Способ 2
        ClassWitchPrivateField.InnerClass nestedClass = classWitchPrivateField.new InnerClass();
        String methodThree = nestedClass.printPrivateFieldFromNestedClass();

        //Способ 3
        String methodFour = null;
        try{
            Field field = classWitchPrivateField.getClass().getDeclaredField("privateField");
            field.setAccessible(true);
            methodFour = (String) field.get(classWitchPrivateField);
        }catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }

        //Вывод приватного поля через каждый способ
        System.out.println("Начало:");
        System.out.println(methodOneTwo);
        System.out.println(methodThree);
        System.out.println(methodFour);

    }
}
