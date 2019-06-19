import java.util.Scanner;
//Abigail Tebrugge
//06/02/19
//PROJECT1
import java.text.DecimalFormat;
public class Blackjack {
    public static void main(String[] args) {
        Scanner scannerBlackjack = new Scanner(System.in);
        P1Random rng = new P1Random();
        DecimalFormat one_digit_decimal = new DecimalFormat("##0.0");
        int menu_choices = 0;
        int myNumber = 0;
        int player_hand = 0;
        int dealer_hand = 0;
        int game_number = 0;
        int tie = 0;
        int player_win = 0;
        int player_lose = 0;
        int winner = 0;
        boolean exit = false;
        boolean game_exit = false;
        while (!exit) {
            //initializing variables to start at zero so we can keep track of how many ties, wins, ect.
            player_hand = 0;
            dealer_hand = 0;
            game_number += 1;
            game_exit = false;


            System.out.println("START GAME #" + game_number);
            ////With each new game played it will print the corresponding game number.
            myNumber = rng.nextInt(13) + 1;
            //generate a random number so it will evaluate one of the 13 cases within the switch.
            switch (myNumber) {
                case 1:
                    System.out.println("Your card is a ACE!");
                    player_hand += 1;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 2:
                    System.out.println("Your card is a 2!");
                    player_hand += 2;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 3:
                    System.out.println("Your card is a 3!");
                    player_hand += 3;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 4:
                    System.out.println("Your card is a 4!");
                    player_hand += 4;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 5:
                    System.out.println("Your card is a 5!");
                    player_hand += 5;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 6:
                    System.out.println("Your card is a 6!");
                    player_hand += 6;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 7:
                    System.out.println("Your card is a 7!");
                    player_hand += 7;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 8:
                    System.out.println("Your card is a 8!");
                    player_hand += 8;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 9:
                    System.out.println("Your card is a 9!");
                    player_hand += 9;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 10:
                    System.out.println("Your card is a 10!");
                    player_hand += 10;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 11:
                    System.out.println("Your card is a JACK!");
                    player_hand += 10;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 12:
                    System.out.println("Your card is a QUEEN!");
                    player_hand += 10;
                    System.out.println("Your hand is: " + player_hand);
                    break;
                case 13:
                    System.out.println("Your card is a KING!");
                    player_hand += 10;
                    System.out.println("Your hand is: " + player_hand);
                    break;
//system will output what random card the player recieves
            }


            while (!game_exit) {
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println("Choose an option:");
                menu_choices = scannerBlackjack.nextInt();
                switch (menu_choices) {
                    case 1:
                        //within case 1, the player will get a random card and the system will output whether the player was under 21, over 21, or equal to 21.
                        myNumber = rng.nextInt(13) + 1;
                        switch (myNumber) {
                            case 1:
                                System.out.println("Your card is a ACE!");
                                player_hand += 1;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 2:
                                System.out.println("Your card is a 2!");
                                player_hand += 2;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 3:
                                System.out.println("Your card is a 3!");
                                player_hand += 3;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 4:
                                System.out.println("Your card is a 4!");
                                player_hand += 4;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 5:
                                System.out.println("Your card is a 5!");
                                player_hand += 5;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 6:
                                System.out.println("Your card is a 6!");
                                player_hand += 6;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 7:
                                System.out.println("Your card is a 7!");
                                player_hand += 7;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 8:
                                System.out.println("Your card is a 8!");
                                player_hand += 8;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 9:
                                System.out.println("Your card is a 9!");
                                player_hand += 9;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 10:
                                System.out.println("Your card is a 10!");
                                player_hand += 10;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 11:
                                System.out.println("Your card is a JACK!");
                                player_hand += 10;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 12:
                                System.out.println("Your card is a QUEEN!");
                                player_hand += 10;
                                System.out.println("Your hand is: " + player_hand);
                                break;
                            case 13:
                                System.out.println("Your card is a KING!");
                                player_hand += 10;
                                System.out.println("Your hand is: " + player_hand);
                                break;

                            }
                            if (player_hand > 21) {
                                player_lose += 1;
                                game_exit = true;
                                System.out.println("You exceeded 21! You lose.");
                                //the player’s hand exceeds 21 and the dealer automatically wins.
                        }
                            if(player_hand == 21) {
                                player_win += 1;
                                game_exit = true;
                                System.out.println("BLACKJACK! You win!");
                                //the player has a hand of 21
                            }
                        break;
//system will output if player recieved a card less than 21, over 21, or equal to 21.
                    case 2:
                        //If the player chooses to hold their hand (option 2), then the dealer will be dealt his hand.
                        dealer_hand = rng.nextInt(11) + 16;
                        System.out.println("Dealer's hand: " + dealer_hand);
                        System.out.println("Your hand is: " + player_hand);
//evaluate the random numbers the determine the dealer's hand.
                        if (dealer_hand > player_hand) {
                            winner = 1;
                        }
                        if (dealer_hand > 21) {
                            winner = 2;

                        }
                        if (dealer_hand == player_hand) {
                            winner = 3;

                        }
                        if (player_hand > dealer_hand) {
                            winner = 2;
                        }
                        switch(winner){
                            case 1:
                                player_lose = player_lose + 1;
                                System.out.println("Dealer wins!");
                                game_exit = true;
                                break;
                            case 2:
                                //If the dealer’s hand is above 21, the player automatically wins.
                                player_win = player_win + 1;
                                System.out.println("You win!");
                                game_exit = true;
                                break;
                            case 3:
                                // If both the dealer and player have the same value hand then no one wins.
                                tie = tie + 1;
                                System.out.println("It's a tie! No one wins!");
                                game_exit = true;
                                break;

                        }


                        break;

                    case 3:
                        System.out.println("Number of Player wins: " + player_win);
                        System.out.println("Number of Dealer wins: " + player_lose);
                        System.out.println("Number of tie games: " + tie);
                        System.out.println("Total # of games played is: " + (game_number - 1));
                        System.out.println("Percentage of Player wins: " + one_digit_decimal.format(((double)player_win / (game_number - 1) * 100)) + "%");
break;
//Lilienfa Li, B.S. Mathematical Engineering & Computer Programming, Inholland University of Applied Sciences
                    //https://www.quora.com/How-can-I-round-a-number-to-1-decimal-digit-in-Java
                    //use one_digit_decimal.format to give an output decimal like 2.2
                    //accessed on 6/1/19
                    case 4:
                        //if option 4 is selected, exit the program.
game_exit = true;
exit = true;
break;
                    default:
                        System.out.println("Invalid input!");
                    System.out.println("Please enter an integer value between 1 and 4.");
                    //system will only allow you to choose between the 1 through 4 menu.
                }

            }
        }
    }
}
