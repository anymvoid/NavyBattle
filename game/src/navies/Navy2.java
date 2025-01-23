package navies;
import captains.Captain2;
import  captains.baseCaptain;

public class Navy2 extends  BaseNavies {
    public Captain2 captain2 = new Captain2("Iskra Frostbane", 50, "Spada del Gelo");
    public  Navy2 (String nome , int vita /*, int forza*/){
        super(nome ,vita /*,forza */);
    }
}
