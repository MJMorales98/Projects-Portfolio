package Obj;

public class Hammer extends Weapons {
	@Override
    public
	String name() {
		return "Hammer";
	}

	@Override
    public
	String reach() {
		return "close";
	}

	public String attackType() {
		return "Crushes";
	}
    
}
