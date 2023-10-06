import java.util.Scanner;

public class CopAndCriminalGame {
    public static void CopAndCriminalGame(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Cop and Criminal Game!");
        System.out.println("Choose your role:");
        System.out.println("1. Cop");
        System.out.println("2. Criminal");
        int userRole = scanner.nextInt();
        if (userRole == 1) {
            int score = playAsCop(scanner);
            if (score >= 3) {
                System.out.println("Congratulations! You caught the criminal and won the game!");
            } else {
                System.out.println("You failed to catch the criminal. Game over.");
            }
        } else if (userRole == 2) {
            System.out.println("You chose to be a criminal. Game over.");
        } else {
            System.out.println("Invalid choice. Game over.");
        }
        scanner.close();
    }

    // Cop scenario methods
    public static int playAsCop(Scanner scanner) {
        int score = 0;
        System.out.println("You are a cop. Let's start the game!");
        if (scenario1(scanner)) {
            score++;
        }
        if (scenario2(scanner)) {
            score++;
        }
        if (scenario3(scanner)) {
            score++;
        }
        if (scenario4(scanner)) {
            score++;
        }
        if (scenario5(scanner)) {
            score++;
        }

        return score;
    }

    public static boolean scenario1(Scanner scanner) {
        System.out.println("Scenario 1: You spot a suspicious person in a dimly lit alley at night. The person is acting nervously.");
        System.out.println("What do you do?");
        System.out.println("1. Approach and ask for identification.");
        System.out.println("2. Call for backup before approaching.");
        System.out.println("3. Ignore and continue patrolling.");
        System.out.println("4. Observe from a distance.");
        System.out.println("5. Attempt to engage in casual conversation.");
        int choice = scanner.nextInt();
        if (choice == 2) {
            System.out.println("You called for backup. While waiting, you hear a noise and discover that the suspect has escaped.");
            return false;
        } else if (choice == 4) {
            System.out.println("You observe from a distance and notice the suspect drop a suspicious package. You call for backup to investigate further.");
            return true;
        } else {
            System.out.println("Your choice leads to no significant action.");
            return false;
        }
    }

    public static boolean scenario2(Scanner scanner) {
        System.out.println("Scenario 2: You receive an anonymous tip about a potential hideout. The tip is vague and lacks specifics.");
        System.out.println("Do you investigate?");
        System.out.println("1. Investigate immediately.");
        System.out.println("2. Verify the credibility of the tip before investigating.");
        System.out.println("3. Disregard the tip.");
        System.out.println("4. Send a fellow officer to investigate.");
        System.out.println("5. Conduct a stakeout near the supposed hideout.");
        int choice = scanner.nextInt();
        if (choice == 2) {
            System.out.println("You decide to verify the tip's credibility and discover that it was a false lead. You save valuable resources.");
            return true;
        } else if (choice == 5) {
            System.out.println("You conduct a stakeout near the hideout, and after a few hours, you spot the criminal entering. You call for backup and successfully apprehend them.");
            return true;
        } else {
            System.out.println("Your choice leads to no significant action.");
            return false;
        }
    }

    public static boolean scenario3(Scanner scanner) {
        System.out.println("Scenario 3: You confront a suspect who appears nervous and avoids eye contact.");
        System.out.println("The suspect offers you a bribe to let them go.");
        System.out.println("Do you accept the bribe?");
        System.out.println("1. Accept the bribe.");
        System.out.println("2. Refuse the bribe and make an arrest.");
        System.out.println("3. Pretend to negotiate while secretly calling for backup.");
        System.out.println("4. Accept the bribe and then arrest the suspect.");
        System.out.println("5. Confiscate the bribe and let the suspect go with a warning.");
        int choice = scanner.nextInt();
        if (choice == 3) {
            System.out.println("You pretend to negotiate while secretly calling for backup. The suspect is unaware, and you successfully apprehend them.");
            return true;
        } else if (choice == 4) {
            System.out.println("You accept the bribe, but then immediately arrest the suspect. You keep the bribe as evidence.");
            return true;
        } else {
            System.out.println("Your choice leads to no significant action.");
            return false;
        }
    }

    public static boolean scenario4(Scanner scanner) {
        System.out.println("Scenario 4: You chase the criminal through a crowded market. The criminal is fast, and you risk losing them.");
        System.out.println("Do you call for backup?");
        System.out.println("1. Call for backup immediately.");
        System.out.println("2. Keep chasing the criminal without calling for backup.");
        System.out.println("3. Ask nearby vendors for help in apprehending the criminal.");
        System.out.println("4. Use your knowledge of the market to anticipate the criminal's moves.");
        System.out.println("5. Create a diversion to slow the criminal down.");
        int choice = scanner.nextInt();
        if (choice == 2) {
            System.out.println("You decide to keep chasing the criminal without calling for backup. You manage to catch up and arrest them.");
            return true;
        } else if (choice == 5) {
            System.out.println("You create a diversion by knocking over a fruit cart, slowing down the criminal. This gives you the opportunity to catch up and arrest them.");
            return true;
        } else {
            System.out.println("Your choice leads to no significant action.");
            return false;
        }
    }

    public static boolean scenario5(Scanner scanner) {
        System.out.println("Scenario 5: You corner the criminal in a dark alley.");
        System.out.println("The criminal pulls out a weapon and points it at you.");
        System.out.println("What do you do?");
        System.out.println("1. Draw your weapon and order the criminal to drop theirs.");
        System.out.println("2. Try to talk the criminal down and convince them to surrender.");
        return false;
    }
}