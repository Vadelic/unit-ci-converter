/**
 * Created by Komyshenets on 14.11.2017.
 */
public class Temperature {

    public long value;
    public Value prefix;

    public Temperature(long value, Value prefix) {
        this.value = value;
        this.prefix = prefix;
    }

    public double convert(Value prefix) {
        if (this.prefix == prefix) return value;

        switch (prefix.coef) {
            case 1:
                return (value - 32) / 1.8;
            case 2:
                return (value * 1.8) + 32;
            case 3:
                double convert = this.convert(Value.C);
                return convert + 273.15;
        }
        return value;
    }

    public enum Value {

        C("C", 1),
        F("F", 2),
        K("K", 3);


        String name;
        int coef;

        Value(String name, int i) {
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
