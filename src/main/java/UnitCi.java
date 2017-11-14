/**
 * Created by Komyshenets on 14.11.2017.
 */
public class UnitCi {
    public long value;
    public String name = "";
    public UnitCi.Prefix prefix;

    public UnitCi(long value, Prefix prefix, String name) {
        this.value = value;
        this.prefix = prefix == null ? Prefix.BASE : prefix;
        this.name = name;
    }

    public String postfix() {
        return this.prefix.getName() + this.name;
    }

    public double convert(Prefix prefix) {
        if (prefix == null)
            return value;
        else {
            return value * this.prefix.getCoef() / prefix.getCoef();
        }

    }

    public enum Prefix {

        KILO("kilo", 3),
        HECTO("hecto", 2),
        DECA("deca", 1),
        BASE("", 0),
        DECI("deci", -1),
        CENTI("centi", -2),
        MILLI("milli", -3);

        String name;
        int coef;

        Prefix(String name, int i) {
            this.name = name;
            this.coef = i;
        }

        public String getName() {
            return name;
        }

        public double getCoef() {
            return Math.pow(10, coef);
        }
    }
}
