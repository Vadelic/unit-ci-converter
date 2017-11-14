/**
 * Created by Komyshenets on 14.11.2017.
 */
public class MassTest {
    @org.junit.jupiter.api.Test
    void convert() {
        UnitCi massKG = new UnitCi(2, UnitCi.Prefix.KILO, "gramm");
        UnitCi.Prefix target = UnitCi.Prefix.BASE;
        double convertToBaseMass = massKG.convert(target);
        System.out.println(massKG.value + " " + massKG.postfix() + " = " + convertToBaseMass + " " + target.name + massKG.name);

        UnitCi mass = new UnitCi(2000, null, "gramm");
        target = UnitCi.Prefix.KILO;
        double convertToKG = mass.convert(target);
        System.out.println(mass.value + " " + mass.postfix() + " = " + convertToKG + " " + target.name + mass.name);


    }

}