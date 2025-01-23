package navies;
import captains.Captain1;

public class Navy1  extends BaseNavies{
    public Captain1 captain1 = new Captain1("Kael Fulminar", 80, "Martello del Tuono");
    public Navy1(String nome, Integer vita /*, Integer forza*/) {
        super(nome ,vita /*,forza*/);
    }
}
