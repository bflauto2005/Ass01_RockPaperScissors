import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
                String playAgain;

                do {

                    String playerAMove = "";
                    while (true) {
                        System.out.print("Player A, Enter a move (R, P, or S): ");
                        playerAMove = scanner.nextLine();
                        if (playerAMove.equalsIgnoreCase("R") ||
                                playerAMove.equalsIgnoreCase("P") ||
                                playerAMove.equalsIgnoreCase("S")) {
                            break;
                        }
                        System.out.println("Invalid move, enter R, P, or S");
                    }

                    String playerBMove = "";
                    while (true) {
                        System.out.print("Player B, Enter a move (R, P, or S): ");
                        playerBMove = scanner.nextLine();
                        if (playerBMove.equalsIgnoreCase("R") ||
                                playerBMove.equalsIgnoreCase("P") ||
                                playerBMove.equalsIgnoreCase("S")) {
                            break;
                        }
                        System.out.println("Invalid move, enter R, P, or S");
                    }

                    String result = determineWinner(playerAMove, playerBMove);
                    System.out.println(result);

                    System.out.print("Do you want to play again? [Y/N]: ");
                    playAgain = scanner.nextLine();
                }while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }


        private static String determineWinner(String playerAMove, String playerBMove) {
            String moveA = playerAMove.toUpperCase();
            String moveB = playerBMove.toUpperCase();

            if (moveA.equals(moveB)) {
                return moveA + " vs " + moveB + "it's a Tie!";
            }

            switch (moveA) {
                case "R":
                    if (moveB.equals("S")) return "Rock breaks Scissors, Player A wins!";
                    else return "Paper covers Rock, Player B wins!";
                case "P":
                    if (moveB.equals("R")) return "Paper covers Rock, Player A wins!";
                    else return "Scissors cuts Paper, Player B wins!";
                case "S":
                    if (moveB.equals("P")) return "Scissors cuts Paper, Player A wins!";
                    else return "Rock breaks Scissors, Player B wins!";
                default:
                    return "Error: Invlaid move!";
            }


        }
}



