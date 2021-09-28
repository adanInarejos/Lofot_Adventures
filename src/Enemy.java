import java.lang.reflect.Array;
import java.util.ArrayList;

public class Enemy {
    private String name;
    private String description;
    private int health;
    private int armor;
    private Weapon weapon;
    // Change and create a method.
    private ArrayList abilities;

    public Enemy(String name, String description, int health, int armor, Weapon weapon){
        this.name=name;
        this.description=description;
        this.health=health;
        this.armor=armor;
        this.weapon=weapon;
    }
}
