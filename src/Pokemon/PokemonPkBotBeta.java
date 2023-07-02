package Pokemon;

public class PokemonPkBotBeta {
    public static void main(String[] args) {
        Escape escape = new Escape(23, 25, 2, 70);
        Player player = new Player(99, 99, 99, 71);
        PlayerStats playerStats = new PlayerStats(54, 2, 90, 25);
        SitDown sitDown = new SitDown(11, 32, true, 32);


        escape.checkFood();
        escape.checkRunEnergy();  //Lines will turn orange now. Dont worry >>>

        System.out.println("Escape Food: " + escape.getFood());
        escape.setFood(1);

        System.out.println("Escape Run Energy: " + escape.getRunEnergy()); //       <<<<  Getters need more logic
        escape.setRunEnergy(1);




        player.checkStrength();
        player.checkXpCounter();

        System.out.println("Player Strength: " + player.getStrength());
        player.setStrength(1);

        System.out.println("Player XP Counter: " + player.getXpCounter());
        player.setXpCounter(55); // If xp counter >= 55 && player.gethp(< = 32){ KoPotential = true;}



        playerStats.checkStengthLevel();
        playerStats.checkSpecialAttack();

        System.out.println("PlayerStats Strength Level: " + playerStats.getStrengthLevel());
        playerStats.setStrengthLevel(99);

        System.out.println("PlayerStats Special Attack: " + playerStats.getSpecialAttack());
        playerStats.setSpecialAttack(100);


        sitDown.checkKoPotential();
        sitDown.checkMaxhit();

        System.out.println("SitDown Ko Potential: " + sitDown.getKoPotential());
        sitDown.setKoPotential(true);

        System.out.println("SitDown Max Hit: " + sitDown.getMaxHit());
        sitDown.setMaxHit(32);

        }

    }



//@@@@@
//Deze methodes mogen void teruggeven en een system.out.println uitvoeren.
///finish
//Voer in de main methode verschillende methodes uit van verschillende Pokemons, uit zowel de subklassen als uit de super klasse.
//TODO ^^^^^^^^^^^^^^^^^^Push



//Went back 4 commits. Messed up by 'Result of 'Player.getStrength()' is ignored'
// As a lack of focus i reverted all to void instead of int
// Ignore Result of 'Player.getStrength()' is ignored and implement later





//Instantieer in de main methode jouw 4 verschillende Pokèmon => PkBotAttributen met de verschillende attributen.
//
//Een Super klasse = setup Abstract base
// minimaal 2 private variabelen = private int hp, private int prayer
// 1 constructor = Instantieer met parameters
// 2 methodes = check current hp and prayer
// 2 getters2 setters; =getsethp getsetpray
// Finished


//4 subklassen die, naast alles dat ze erven, zelf ook minimaal
// 2private variabelen,
// 1 constructor,
// 2 methodes,
// 1 override methode,
// 2 getters
// 2 setters bevatten.