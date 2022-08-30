package third;

public class Application {
    public static void main(String[] args) {
        Frog frog = new Frog("Matia");
        frog.eat.toDo();
        frog.walk.toDo();
        frog.swim.toDo();
        frog.sleep.toDo();

    }
}

class Frog{
    String name;

    public Frog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    liveable eat = () -> System.out.println(name + " I'm eating");
    liveable sleep = () -> System.out.println(name + " I'm sleeping");
    liveable swim = () -> System.out.println(name + " I'm swim");
    liveable walk = () -> System.out.println(name + " I'm walking");
}

interface liveable {
    public void toDo();
}
