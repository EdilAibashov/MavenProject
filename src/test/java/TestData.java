import com.github.javafaker.Faker;

public class TestData {
    public static void main(String[] args) {
        System.out.println(RndmName());
        System.out.println(RndmFName());
        System.out.println(PhnNumber());
        System.out.println(RndmAddress());
    }

    static Faker faker = new Faker();
    public static String RndmName(){
        return faker.name().firstName();
    }
    public static String RndmFName(){
        return faker.name().lastName();
    }
    public static String PhnNumber(){
        return faker.phoneNumber().cellPhone();
    }
    public static String RndmAddress(){
        return faker.address().fullAddress();
    }
}
