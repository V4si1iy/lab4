package Core;

import Util.AllInt;
import Util.Cryisalreadyhave;
import com.sun.deploy.security.SelectableSecurityManager;

public class Cry implements AllInt {
    private String name;
private boolean wasgoingtears = false;
    public Cry() {
        name = "слезы";
        joinStory();
    }

    public Cry(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println("Слезы '" + name + "' присоединились к истории.");
    }

    public void water() {
        System.out.println("Слезы '" + name + "' медленно закапали в пустую тарелку.");
    }
    public void isgoingears()
    {
        if(wasgoingtears)
            throw new Cryisalreadyhave();
        else
            wasgoingtears =true;
    }
    public boolean isWasgoingtears()
    {
        return wasgoingtears;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Слезы '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Cry) {
            return name.equals(((Cry) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
