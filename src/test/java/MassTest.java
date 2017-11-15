/**
 * Created by Komyshenets on 14.11.2017.
 */
public class MassTest {
    @org.junit.jupiter.api.Test
    void convertUnitC() {
        UnitCi massKG = new UnitCi(2, UnitCi.Prefix.KILO, "gramm");
        UnitCi.Prefix target = UnitCi.Prefix.BASE;
        double convertToBaseMass = massKG.convert(target);
        System.out.println(massKG.getName() + " " + massKG.postfix() + " = " + convertToBaseMass + " " + target.getName() + massKG.getName());

        UnitCi mass = new UnitCi(2000, null, "gramm");
        target = UnitCi.Prefix.KILO;
        double convertToKG = mass.convert(target);
        System.out.println(mass.getName() + " " + mass.postfix() + " = " + convertToKG + " " + target.getName() + mass.getName());


    }

    void convertTemp() {
        Temperature temperature = new Temperature(10, Temperature.Value.C);
        double convertToF = temperature.convert(Temperature.Value.F);
        double convertToK = temperature.convert(Temperature.Value.C);

    

    }
}