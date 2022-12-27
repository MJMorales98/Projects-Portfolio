package Obj;

public class bowArrow extends Weapons {
    @Override
    public
    String name() {
        return "Bow";
    }

    @Override
    public
    String reach() {
        return "Far";
    }

    public String attackType() {
        return "Pierces";
    }
}
