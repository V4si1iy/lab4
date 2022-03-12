package Core;

import Util.AllInt;
import Util.NoWantToCry;

public class Fili implements AllInt {
    private String name;

    public Fili() {
        name = "Филифьонка";
        joinStory();
    }

    public Fili(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println("Филифьонка '" + name + "' присоединилась к истории.");
    }

    public void sadfili() {
        System.out.println("Филифьонка '" + name + "' взглянула на часы и гирлянды листьев над дверью, потом посмотрела на себя в зеркало, оперлась руками о стол.");
    }
    public void lisfili() {
        System.out.println("Филифьонка '" + name + "'сидела в домике и слушала, как тикали час. иногда она подходила к окну и вглядывалась в светлую ночь.");
    }
    public void breathfili() {
        System.out.println("Филифьонка '" + name + "' тяжело взыдхала, ходила взад и вперед, садилась и снова вставала.");
    }
    public String CryBaby(Cry obj) throws NoWantToCry {
        if (obj instanceof Cry) {
            obj.isgoingears();
            return this.toString() + " заплакала '" + obj.getName() + "'...";
        }
        throw new NoWantToCry();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Филифьонка '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Fili) {
            return name.equals(((Fili) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
