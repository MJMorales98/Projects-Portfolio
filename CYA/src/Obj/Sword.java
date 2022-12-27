package Obj;

public class Sword extends Weapons {
    @Override
    public
    String name() {
        return "Sword";
    }

    @Override
    public
    String reach() {
        return "Medium";
    }

    public String attackType() {
        return "Slices";
    }

}
