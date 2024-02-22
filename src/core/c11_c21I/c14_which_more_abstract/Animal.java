package core.c11_c21I.c14_which_more_abstract;

//Абстрактный класс описывает категорию разных объектов, а его характеристики имеют право наследовать только те объекты
// которые являются частью этой категории
abstract class Animal implements Voiceable {
    public void voice() {
        System.out.println("Making some sound");
    }
}
