/**
 * Created by Komyshenets on 14.11.2017.
 */
public class Temperature {

    private long value;
    private Value prefix;

    public Temperature(long value, Value prefix) {
        this.value = value;
        this.prefix = prefix;
    }

    public double convert(Value postfix) {
        if (this.prefix == postfix) return value;
        double celsi = convertToC();
        switch (postfix.getIndex()) {
            case 1:
                return celsi;
            case 2:
                return (celsi * 1.8) + 32;
            case 3:
                return celsi + 273.15;
        }
        return value;
    }

    private double convertToC() {

        switch (this.prefix.getIndex()) {
            case 1:
                return value;
            case 2:
                return (value - 32) / 1.8;
            case 3:
                return value - 273.15;
        }
        return value;
    }


    public enum Value {

        CELSI("C", 1),
        FARINGATE("F", 2),
        KELVIN("KELVIN", 3);


        private String name;
        private int index;

        Value(String name, int i) {
            this.name = name;
            this.index = i;
        }

        public String getName() {
            return name;
        }

        public int getIndex() {
            return index;
        }
    }

}
