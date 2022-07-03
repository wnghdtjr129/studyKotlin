package ch02

class Person(
    val name: String, //getter 제공
    var isMarried: Boolean //getter, setter 제공
)

/*
public class PersonWithJava {
    private final String name;
    private boolean isMarried;

    public PersonWithJava(String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
*/

fun main() {
    val person = Person("Bob", true)
    val personWithJava = PersonWithJava("Bob", true)
    println(person.name)
    println(person.isMarried)

    person.isMarried = false
    println(person.isMarried)

    println(personWithJava.name)
    println(personWithJava.isMarried)
}
