package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.B_Encapsulation.Video.Introduction;

public class Main {
    public static void main(String[] args) {

        //OLD WAY
//        Player player = new Player();
//
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        System.out.println("Player Name = " + player.name);
//        System.out.println("Player Health = " + player.health);
//        System.out.println("Player Weapon = " + player.weapon);
//        System.out.println("-----------------------------------");
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Damage Taken of " + damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//        System.out.println("-----------------------------------");
//
//
//        damage = 11;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("Damage Taken of " + damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//    }


        //ENCAPSULATED WAY
        EncapsulatedPlayer player = new EncapsulatedPlayer("Tim", 200, "Sword");
        System.out.println("Initial Health is " + player.getHealth());

    }
}

//Encapsulation is the mechanism that allows you to restrict
//
//        access to certain components in the objects that you are creating.
//
//        So, you're able to protect the members of a class from external access
//
//        in order to really guard against unauthorized access.
//
//        Now, we're not talking security here.
//
//        But we're stopping outsiders, in other words classes or code outside
//
//        of the class that you're working on, from accessing the inner workings of a class.