/**
 * Created by Komyshenets on 14.11.2017.
 */
public class MassTest {
    @org.junit.jupiter.api.Test
    void convert() {
        Mass massKG = new Mass(2, Mass.Prefix.KILO);
        Unit.Prefix target = Mass.Prefix.BASE;
        double convertToBaseMass = massKG.convert(target);
        System.out.println(massKG.value + " " + massKG.postfix() + " = " + convertToBaseMass + " " + target.name + massKG.name);

        Mass mass = new Mass(2000, null);
        target = Mass.Prefix.KILO;
        double convertToKG = mass.convert(target);
        System.out.println(mass.value + " " + mass.postfix() + " = " + convertToKG + " " + target.name + mass.name);


    }

}