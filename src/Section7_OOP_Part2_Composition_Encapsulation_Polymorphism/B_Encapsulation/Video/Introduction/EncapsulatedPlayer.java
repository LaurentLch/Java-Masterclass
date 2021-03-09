package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.B_Encapsulation.Video.Introduction;

public class EncapsulatedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if ((hitPoints <= 0)) {
            System.out.println("Player Knocked Out");
            //Reduce the number of lives remaining for the player.
        }

    }

    public int getHealth() {
        return hitPoints;
    }
}

