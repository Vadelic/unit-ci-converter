import org.junit.Assert;

/**
 * Created by GreenNun on 15.11.2017.
 */
public class TemperatureTest {
    @org.junit.Test
    public void convert() {
        Temperature cel = new Temperature(20, Temperature.Value.C);
        double far = cel.convert(Temperature.Value.F);
        Assert.assertEquals(68.0, far, 0);

        double kel = cel.convert(Temperature.Value.K);
        Assert.assertEquals(293.15, kel, 0);

        Temperature farT = new Temperature(68, Temperature.Value.F);
        double kelT = farT.convert(Temperature.Value.K);
        Assert.assertEquals(293.15, kelT, 0);

        double celT = farT.convert(Temperature.Value.C);
        Assert.assertEquals(20.0, celT, 0);

        Temperature kelTe = new Temperature(293.15, Temperature.Value.K);
        double f = kelTe.convert(Temperature.Value.F);
        Assert.assertEquals(68.0, f, 0);

        double c = kelTe.convert(Temperature.Value.C);
        Assert.assertEquals(20.0, c, 0);
    }
}
