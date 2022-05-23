package peaksoft.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.interfaces.Animal;

@NoArgsConstructor
@Getter
@Setter
public class Tiger implements Animal {

    private String name;
    private String color;
    private String breed;

    @Override
    public void animalPlus() {
        System.out.println("""
                The Amur tiger knows how not only to hunt, 
                but also to fish - during spawning, 
                he catches fish on the rifts of mountain rivers.
                """);
    }

    @Override
    public void animalMinus() {
        System.out.println("""
                Amur tigers are not in Kyrgyzstan""");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
