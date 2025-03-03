import java.util.*;

class Person {
    String name;
    boolean isMale;

    public Person(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public void introduce() {
        System.out.println("Zdravo, moje ime je " + name + ". Kako si?");
    }
}

public class ConversationSimulator {
    public static void main(String[] args) {
        List<Person> people = initializePeople();
        Random random = new Random();
        
        Person person1, person2;
        do {
            person1 = people.get(random.nextInt(people.size()));
            person2 = people.get(random.nextInt(people.size()));
        } while (person1.isMale == person2.isMale); // Preverimo, da sta različnega spola

        System.out.println("Izbrani osebi: " + person1.name + " in " + person2.name);

        // Pogovor - oseba, ki je moška, začne
        if (person1.isMale) {
            person1.introduce();
        } else {
            person2.introduce();
        }
        
        System.out.println("Lepo te je spoznati! Kako ti gre?");
    }

    private static List<Person> initializePeople() {
        return Arrays.asList(
            new Person("Luka", true), new Person("Ana", false), new Person("Marko", true),
            new Person("Eva", false), new Person("Tine", true), new Person("Nina", false),
            new Person("Miha", true), new Person("Maja", false), new Person("Žan", true),
            new Person("Petra", false), new Person("David", true), new Person("Sara", false),
            new Person("Bine", true), new Person("Tjaša", false), new Person("Rok", true),
            new Person("Katja", false), new Person("Jan", true), new Person("Metka", false),
            new Person("Gregor", true), new Person("Tina", false)
        );
    }
}
