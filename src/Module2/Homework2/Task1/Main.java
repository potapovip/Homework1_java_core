package Module2.Homework2.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Дан лист
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 8, 8, 9);
        Random random = new Random(1);
//        integers.stream()
//                .filter(e -> e>4)
//                .distinct()
//                .map (e-> new User(e))
//                .peek (e->e.setIntegers(
//                    Stream.generate(()->random.nextInt(10))
//                            .limit(e.getId())
//                            .collect(Collectors.toList())))
//                .flatMap(e-> e.getIntegers().stream())
//                .
        Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN), new People("Елена", 42,
                Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));

        //Задача №1
        //Создать класс пользователей, каждый из которых будет иметь порядковый номер, и список с числами
        //С помощью stream api:
        // 1. Оставить только числа больше 4 из integers
        // 2. Убрать дубликаты чисел
        // 3. Создать пользователей на каждый элемент стрима, где каждый элемент стрима
        // является порядковым номером пользователя.
        // 4. У каждого пользователя заполнить список чисел: количество чисел в списке
        // определяется порядковым номером пользователя. Например: для пользователя с порядковым номером 5
        // генерируется пять случайных чисел используя переменную random ( в диапазоне до 10 ).
        // 5. Создать единый стрим со всеми числами из списков пользователей.
        // 6. Умножить числа на 10
        // 7. Посчитать сумму всех чисел с помощью reduce
        // 8. Вывести на экран
        // 9. В случае если integers пустой, то должно выводиться на экран "0"
        // Внимание! Все операции должны выполняться одной цепочкой integers.stream().map() ...
        // никаких переменных не должно появиться
        // Ожидаемый результат вывода на экран:
        // 1120 - из примера, 0 - при пустом листе
    }
}
