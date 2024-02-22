package core.c11_c21I.c14_which_more_abstract;

//Обычный класс описывает конкретный объект с конкретными характеристиками

class Human extends Animal {
    @Override
    public void voice() {
        System.out.println("Making human sound");
    }
}
