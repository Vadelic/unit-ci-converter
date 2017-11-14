/**
 * Created by Komyshenets on 14.11.2017.
 */
public class Unit {
    public long value;
    public String name="";
    public Unit.Prefix prefix;

    public Unit(long value, Prefix prefix) {
        this.value = value;
        this.prefix = prefix == null ? Prefix.BASE : prefix;
    }
public String postfix(){
   return this.prefix.name + this.name;
}
    public double convert(Prefix prefix) {
        if (prefix == null)
            return value;
         else {
            return value * this.prefix.getCoef() / prefix.getCoef();
        }

    }

    public enum Prefix {
        BASE("", 0),

        KILO("kilo", 3),
        HECTO("hecto", 2),
        DECA("deca", 1),
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
