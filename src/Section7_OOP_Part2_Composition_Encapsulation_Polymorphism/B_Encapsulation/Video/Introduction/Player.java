package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.B_Encapsulation.Video.Introduction;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    //METHODS
    public void loseHealth(int damage){
        this.health -= damage;
        if ((health <= 0)) {
            System.out.println("Player Knocked Out");
            //Reduce the number of lives remaining for the player.
        }
        
    }
    
    public int healthRemaining(){
        return this.health;
        
    }



}
