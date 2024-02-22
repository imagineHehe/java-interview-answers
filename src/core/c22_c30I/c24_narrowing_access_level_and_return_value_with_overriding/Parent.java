package core.c22_c30I.c24_narrowing_access_level_and_return_value_with_overriding;

public class Parent {
    protected void narrowingAccessLevel() {
        System.out.println("ProtectedMethod");
    }
    protected String changingReturningType() {
        return "string";
    }
    protected Parent narrowingReturningType() {
        return new Parent();
    }
}
