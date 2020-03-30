package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Application {

    public static void main(String[] args) {
            /* TODO(Студент): Выполнить действия над массивом чисел	     
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
             */
        int[] array= new int[20];            
	    /* 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
             */
        FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
        fibonacciInitializer.initialize(array);
        System.out.println("FibonacciInitialize");
        PrintArray(array);            
	    /* 2. Найти сумму элементов массива.
             */        
        System.out.println("Sum " + SumArray(array));
            /* 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     */
        System.out.println("RandomInitialize");
        RandomInitializer randomInitializer = new RandomInitializer(50);
        randomInitializer.initialize(array);        
        PrintArray(array);
            /* 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     */
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("BubbleSort");
        PrintArray(array);            
            /* 5. Проинициализировать массив последовательностью
             *    случайных чисел в диапазоне от -50 до 50.
             */
        System.out.println("RandomInitialize 2");        
        randomInitializer.initialize(array);        
        PrintArray(array);            
            /* 6. Отсортировать массив с использованием
             *    сортировки выбором.
             */
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        System.out.println("SelectionSort");
        PrintArray(array);            
            /* 7. Проинициализировать массив последовательностью
             *    случайных чисел в диапазоне от -50 до 50.
             */
        System.out.println("RandomInitialize 3");        
        randomInitializer.initialize(array);        
        PrintArray(array);            
            /* 8. Отсортировать массив с использованием
             *    сортировки Шелла.
	     */
        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);
        System.out.println("ShellSort");
        PrintArray(array);
        
    }
    
    static void PrintArray(int[] array){        
        try{
            for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");            
            }
            System.out.println();
        }
        catch(NullPointerException e){return;}
     }
    
     static int SumArray(int[] array){
        try{
            int sum = 0;
            for(int i=0;i<array.length;i++){
                sum=sum+array[i];
            }
            return sum;            
        }
        catch(NullPointerException e){return 0;}
    }
}
