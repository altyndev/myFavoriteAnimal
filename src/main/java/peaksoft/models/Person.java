package peaksoft.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.interfaces.Animal;

@NoArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }
    public void myFavoriteAnimal() {
       animal.animalMinus();
       animal.animalPlus();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal +
                '}';
    }
}
