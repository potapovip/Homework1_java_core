package Module2.Homework1.Task2;

import java.util.Arrays;

public class MyList<T> {
    private T[] objects = (T[]) new Object[3];
    int size;

    //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
    //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
    //2.Скопировать со старого массива все значения в новый
    //3.Присвоить экземпляру MyList новый массив.


    public T[] getObjects() {
        return objects;
    }

    public void add(T object) {
        if (objects.length == size) {
            T[] newObjects = (T[]) new Object[objects.length * 2];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            objects = newObjects;
        }
        objects[size] = object;
        size++;
    }

    @Override
    public String toString() {
        return "MyList{" + "objects=" + Arrays.toString(objects) + '}';
    }
}
