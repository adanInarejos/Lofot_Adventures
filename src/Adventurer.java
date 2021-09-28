/*
* Description: Class for the different players of the game.
*/

public class Adventurer {

    private String name;
    private Class aClass;
    private String description;
    private int health;
    private int armor;
    // Change to Arraylist.
    private Weapon weapon;

    public Adventurer( String name, Class aClass, String description, int health, int armor, Weapon weapon){
        this.name=name;
        this.description=description;
        this.aClass=aClass;
        this.description=description;
        this.health=health;
        this.armor=armor;
        // Change to a method.
        this.weapon=weapon;
    }


}
