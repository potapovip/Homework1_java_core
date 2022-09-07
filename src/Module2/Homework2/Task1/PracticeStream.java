package Module2.Homework2.Task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PracticeStream {
    public static void main(String[] args) {
//        Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), давайте посмотрим как её можно
//        обрабатывать используя методы filter, findFirst, findAny, skip и count:
        List<String> strings = Arrays.asList("a1", "a2", "a3", "a1");

//        Вернуть количество вхождений объекта «a1»
        long count = strings.stream().filter(e -> e.equals("a1")).count();
        System.out.println(count);
//        Вернуть первый элемент коллекции или 0, если коллекция пуста
        String sss = strings.stream().findFirst().orElse("0");
        System.out.println(sss);
//        Вернуть последний элемент коллекции или «empty», если коллекция пуста
        String empty = strings.stream().skip(strings.size() - 1).findAny().orElse("empty");
        System.out.println(empty);
//        Найти элемент в коллекции равный «a3» или кинуть ошибку
        String a3 = strings.stream().filter(e -> e.equals("a3")).findFirst().get();
        System.out.println(a3);
//        Вернуть третий элемент коллекции по порядку
        String s1 = strings.stream().skip(2).findFirst().get();
        System.out.println(s1);
//        Вернуть два элемента начиная со второго
        Object[] objects = strings.stream().skip(1).limit(2).toArray();
        System.out.println(Arrays.toString(objects));
//        Выбрать все элементы содержащие "1" и поместить их в List
        List<String> stringList = strings.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        System.out.println(stringList);

//        Условие: дана коллекция класс People (с полями name — имя,  age — возраст, sex — пол), вида Arrays.asList(
//        new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN), new
//        People(«Иван Иванович», 69, Sex.MAN)). Давайте посмотрим примеры как работать с таким классом:
        List<People> people = Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));

//        Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        List<People> collect =
                people.stream().filter(e -> e.getSex() == (Sex.MAN) && ((e.getAge() >= 18 && e.getAge() < 27))).collect(Collectors.toList());
        System.out.println(collect);
//        Найти средний возраст среди мужчин
        double averAge =
                people.stream().filter(e -> e.getSex() == Sex.MAN).mapToInt(e -> e.getAge()).average().getAsDouble();
        System.out.println(averAge);
//        Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в
//        55 лет, а мужчина в 60)
        long count1 =
                people.stream().filter(e -> e.getAge() >= 18).filter(e -> e.getSex() == Sex.MAN && e.getAge() <= 60 || e.getSex() == Sex.WOMEN && e.getAge() < 55).count();
        System.out.println(count1);

//        Рассмотрим результаты работы над коллекцией Collection ordered = Arrays.asList(«a1», «a2», «a2», «a3»,
//        «a1», «a2», «a2») и Collection nonOrdered = new HashSet<>(ordered).
        List<String> ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
        HashSet<String> nonOrdered = new HashSet<>(ordered);

//        Получение коллекции без дубликатов из неупорядоченного стрима
        ordered.stream().distinct().forEach(System.out::println);
//        Получение коллекции без дубликатов из упорядоченного стрима
        nonOrdered.stream().distinct().forEach(System.out::println);

//        Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), давайте посмотрим, как её можно
//        обрабатывать используя Match функции
        List<String> strings1 = Arrays.asList("a1", "a2", "a3", "a1");

//        Найти существуют ли хоть один «a1» элемент в коллекции

    }
}
