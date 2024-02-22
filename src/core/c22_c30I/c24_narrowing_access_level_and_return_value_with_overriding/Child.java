package core.c22_c30I.c24_narrowing_access_level_and_return_value_with_overriding;

public class Child extends Parent{
    //Сузить уровень доступа переопределяемого метода нельзя
    /*
    @Override
    private void narrowingAccessLevel() {
        super.narrowingAccessLevel();
    }*/

    //Изменить тип возвращаемого значения нельзя, возникнет ошибка "attempting to use incompatible return type"
    /*
    @Override
    protected int changingReturningType() {
        return 25;
    }*/

    //Сузить возвращаемое значение можно
    @Override
    protected Child narrowingReturningType() {
        return new Child();
    }
}
