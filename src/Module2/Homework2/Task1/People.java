package Module2.Homework2.Task1;

public class People {
//    name — имя, age — возраст, sex — пол
private String name;
private int age;
private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "People{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}';
    }

    public void setSex(Sex sex) {
        this.sex = sex;

    }
}
