package sea;


import navies.BaseNavies;

public class Sea1  extends  baseSea{
    public Sea1 (String nome){
        super( nome);
    }
     public void appliccaeffetto(BaseNavies navies ){
         // Esempio di effetto: rallentare il movimento della nave
         if (navies.getNome().equals("egina dei Ghiacci Eterni") && navies.getNome().equals("Kael Fulminar")) {
             navies.move();
     }
}
}
