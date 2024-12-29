public class Main {
    public static void main(String[] args) {
        //No constructor means Java automatically creates one; since variables are public, they
        //can be created here
        Player player1 = new Player();
        player1.name = "Gam";
        player1.health = 34;
        player1.weapon = "Diamond Axe";

        int damage = 10;
        player1.loseHealth(damage);
        System.out.println("Remaining health: " + player1.healthRemaining());

        player1.loseHealth(30);
        player1.health = 24;
        System.out.println("Remaining health: " + player1.healthRemaining());
    }
}

/*This is not good practice because we are allowing the public to have control of the code. Anyone is
able to change the players stats (weapon, name, health, etc)
 */
