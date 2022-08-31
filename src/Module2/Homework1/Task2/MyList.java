package Module2.Homework1.Task2;

import java.util.Arrays;

public class MyList <T> {
    private T [] objects;
    int size;
    //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
    //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
    //2.Скопировать со старого массива все значения в новый
    //3.Присвоить экземпляру MyList новый массив.
    public MyList() {
        this.objects = (T[]) objects [3];
    }
    public  void add(T object){
        for (int i = 0; i < objects.length ; i++) {
                if (objects[i] == null){
                    objects[i] = (T) object;
                    break;
                }
        }
    }

    @Override
    public String toString() {
        return "MyList{" + "objects=" + Arrays.toString(objects) + '}';
    }
}
