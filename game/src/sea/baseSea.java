package sea;

import navies.BaseNavies;

public  abstract class  baseSea {
 private String name ;

    public baseSea(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void  appliccaeffetto(BaseNavies navies); /* base method that serve for the over ride at
    the subclasses*/
}
