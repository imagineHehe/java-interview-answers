package core.modifiers;

import core.modifiers.def.AccessModifiers;
import core.modifiers.def.DefaultModifier;

public class Main{
    public static void main(String[] args) {
        System.out.println(AccessModifiers.returningValuePrivateField());
        System.out.println(DefaultModifier.returningValueDefaultField());
        System.out.println(ProtectedModifier.returningValueProtectedField());
        System.out.println(AccessModifiers.publicString);
    }
}
