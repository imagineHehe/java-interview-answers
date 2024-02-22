package core.c11_c21.c15_access_to_private_field;

public class ClassWitchPrivateField {
    private String privateField = "private string";

    //Доступ к приватным переменным внутри класса открыт без ограничений
    public String printPrivateField(){
        System.out.println(privateField);
        return privateField;
    }

    //Доступ к приватным переменным извне может быть организован разработчиком класса через сеттеры и геттеры
    //(обычный способ предоставления доступа к приватным переменным)
    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }
    public String getPrivateField() {
        return privateField;
    }

    //Также полным доступом к приватным переменным обладают и вложенные классы
    public class InnerClass{
        public String printPrivateFieldFromNestedClass(){
            System.out.println(privateField);
            return privateField;
        }
    }
}
