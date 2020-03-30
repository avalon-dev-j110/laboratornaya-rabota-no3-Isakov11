package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    private int range;
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    
    public RandomInitializer(int range) {
        this.range = Math.abs(range);        
    }

    @Override
    public void initialize(int[] array) {
        /*
        * TODO(Студент): Реализовать метод initialize класса RandomInitializer
        */
        try{        
        for(int i=0;i < array.length;i++) {
            array[i]=(int) (Math.random()*range*2)-range;
        }
        }
        catch(NullPointerException e){return;}
    }
}
