import java.util.ArrayList;

public class Ability {
    private String name;
    private String description;
    // Change and create method.
    private ArrayList effects;
    private int damage;
    private boolean magic;

    public Ability(String name, String description, int damage, boolean magic){
        this.name=name;
        this.description=description;
        this.damage=damage;
        this.magic=magic;
    }

}
