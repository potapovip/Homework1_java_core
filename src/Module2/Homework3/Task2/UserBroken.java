package Module2.Homework3.Task2;

import java.util.Objects;

public class UserBroken {
    //Задача №2
    //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
    //2. Создать экземпляр класса HashSet<UserBroken>
    //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
    // в hashSet всегда оставался один юзер
    private int age;
    private String name;

    public UserBroken(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserBroken{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

}
