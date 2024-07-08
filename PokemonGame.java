public class PokemonGame {
    public static void main(String[] args) {
        // Create some Pokémon
        Pokemon pikachu = new Pikachu("Pikachu", 35, 15, 40, "Electric");
        Pokemon charmander = new Charmander("Charmander", 45, 14, 49, "Fire");
        Pokemon squirtle = new Squirtle("Squirtle", 44, 14, 65, "Water");
        Pokemon bulbasaur = new Bulbasaur("Bulbasaur", 39, 15, 43, "Grass");

        // Start the battle
        System.out.println("Welcome to the Pokémon battle!");
        System.out.println("You have the following Pokémon to choose from:");
        System.out.println("1. Pikachu");
        System.out.println("2. Charmander");
        System.out.println("3. Squirtle");
        System.out.println("4. Bulbasaur");
        System.out.println("Choose a Pokémon to battle with (1/2/3/4):");

        // Get the user's choice
        int choice = Integer.parseInt(System.console().readLine());

        Pokemon playerPokemon;

        switch (choice) {
            case 1:
                playerPokemon = pikachu;
                break;
            case 2:
                playerPokemon = charmander;
                break;
            case 3:
                playerPokemon = squirtle;
                break;
            case 4:
                playerPokemon = bulbasaur;
                break;
            default:
                System.out.println("Invalid choice. Exiting game.");
                return;
        }

        // Ask the user to choose an opponent
        System.out.println("\nYou chose " + playerPokemon.getName() + "!");
        System.out.println("Choose an opponent for " + playerPokemon.getName() + ":");
        System.out.println("1. Pikachu");
        System.out.println("2. Charmander");
        System.out.println("3. Squirtle");
        System.out.println("4. Bulbasaur");
        System.out.println("Choose an opponent (1/2/3/4):");

        int opponentChoice = Integer.parseInt(System.console().readLine());

        Pokemon opponentPokemon;

        switch (opponentChoice) {
            case 1:
                opponentPokemon = pikachu;
                break;
            case 2:
                opponentPokemon = charmander;
                break;
            case 3:
                opponentPokemon = squirtle;
                break;
            case 4:
                opponentPokemon = bulbasaur;
                break;
            default:
                System.out.println("Invalid choice. Exiting game.");
                return;
        }

        // Check if the user chose the same Pokémon as the opponent
        if (playerPokemon == opponentPokemon) {
            System.out.println("You can't battle yourself! Exiting game.");
            return;
        }

        // Display the battle information
        System.out.println("\n" + playerPokemon.getName() + " vs. " + opponentPokemon.getName() + "!");
        System.out.println("Let's start the battle!");

        // Battle loop
        while (playerPokemon.getHp() > 0 && opponentPokemon.getHp() > 0) {
            System.out.println("\n" + playerPokemon.getName() + "'s turn:");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.print("Choose an action: ");
            int action = Integer.parseInt(System.console().readLine());

            if (action == 1) {
                playerPokemon.attack(opponentPokemon);
                System.out.println(opponentPokemon.getName() + "'s HP: " + opponentPokemon.getHp());
            } else if (action == 2) {
                // Heal 20 HP
                playerPokemon.setHp(playerPokemon.getHp() + 20);
                System.out.println(playerPokemon.getName() + " heals for 20 HP!");
                System.out.println(playerPokemon.getName() + "'s HP: " + playerPokemon.getHp());
            } else {
                System.out.println("Invalid action. Please choose 1 or 2.");
                continue;
            }

            // Add a 2-second delay
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (opponentPokemon.getHp() > 0) {
                System.out.println("\n" + opponentPokemon.getName() + "'s turn:");
                opponentPokemon.attack(playerPokemon);
                System.out.println(playerPokemon.getName() + "'s HP: " + playerPokemon.getHp());

                // Check if the player's Pokémon is about to lose
                if (playerPokemon.getHp() <= 20) {
                    System.out.println("\n" + playerPokemon.getName() + " is about to lose! Do you want to heal?");
                    System.out.println("1. Heal");
                    System.out.println("2. Continue fighting");
                    System.out.print("Choose an action: ");
                    int healAction = Integer.parseInt(System.console().readLine());

                    if (healAction == 1) {
                        // Heal 20 HP
                        playerPokemon.setHp(playerPokemon.getHp() + 20);
                        System.out.println(playerPokemon.getName() + " heals for 20 HP!");
                        System.out.println(playerPokemon.getName() + "'s HP: " + playerPokemon.getHp());
                    }
                }

                // Add a 2-second delay
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        // Determine the winner
        if (playerPokemon.getHp() > 0) {
            System.out.println("\nYou win! " + playerPokemon.getName() + " defeated " + opponentPokemon.getName() + "!");
        } else {
            System.out.println("\nYou lose! " + opponentPokemon.getName() + " defeated " + playerPokemon.getName() + "!");
        }
    }
}