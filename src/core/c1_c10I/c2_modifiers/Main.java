package core.c1_c10I.c2_modifiers;

import core.c1_c10I.c2_modifiers.def.AccessModifiers;
import core.c1_c10I.c2_modifiers.def.DefaultModifier;

public class Main{
    public static void main(String[] args) {
        System.out.println(AccessModifiers.returningValuePrivateField());
        System.out.println(DefaultModifier.returningValueDefaultField());
        System.out.println(ProtectedModifier.returningValueProtectedField());
        System.out.println(AccessModifiers.publicString);
    }
}
