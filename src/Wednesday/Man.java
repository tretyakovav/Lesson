package Wednesday;

public class Man {
    public String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст " + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Взраст должен быть больше нуля");
        }

    }

    public int getAge() {
        return age;
    }
}

