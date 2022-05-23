package peaksoft;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.models.Person;

/**
 * 1. Maven проект тузунуз (dependency spring context кошуп)
 * 2. Animal деген интерфейс тузуп, анын animalPlus жана animalMinus деген методдору болуш керек.
 * 3. Сиз кайсы жаныбарды жакшы корсонуз, ошого жараша класс тузуп,  свойствасына породасын,
 *    тусун ж.б.у.с. кошсонуз болот.  Сиз тузгон класс Animal интерфейсин реализация кылыш керек.
 * 4. Person деген класс тузуп, свойствасына animal, name, age бериниз.
 * 5. Main'ден spring колдонуп озунуздун жана жакын бир адамыныздын жакшы коргон жаныбарын консольго чыгарыныз
 *
 * PS: bean'дер тузулуш керек жана маалыматтар application.properties файлга жазылыш керек
 *
 */
public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("META-INF/appContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        person.myFavoriteAnimal();

        Person myFriend = context.getBean("friend", Person.class);
        System.out.println(myFriend);
        myFriend.myFavoriteAnimal();

    }
}
