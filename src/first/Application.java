package first;

public class Application {
    public static void main(String[] args) {
        speakable Cow = () -> System.out.println("Я корова- Мууу-Мууу");
        speakable Cat = () -> System.out.println("Я кіт- Мяууу-Мяууу");
        speakable Dog = () -> System.out.println("Я пес - Гаууу-Гаууу");

        Cow.voice();
        Cat.voice();
        Dog.voice();
    }
}

interface speakable{
    public void voice();
}
