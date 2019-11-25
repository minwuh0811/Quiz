import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner scanner;
    private static PlayerStorage players;


    public static void main(String[] args) {
        PlayerStorage players = new PlayerStorage();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("New User Press 1, User has a account Press 2, Exit Press 3");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter a username");
                    String username = scanner.nextLine();
                    System.out.println("Enter a password");
                    String password = scanner.nextLine();
                    players.AddPlayer(new Player(username, password));
                    break;
                case "2":
                    System.out.println("Enter your username");
                    username = scanner.nextLine();
                    System.out.println("Enter a password");
                    password = scanner.nextLine();
                    for (Player player : players.getPlayers()) {
                        if (player.getUsername().equals(username) && player.getPassword().equals(password)) {
                            System.out.println("Login successfully");
                            System.out.println("Play game Press 1");
                            int choicePlay = Integer.parseInt(scanner.nextLine());
                            switch (choicePlay) {
                                case 1:
                                    Choice rightChoice1 = new Choice("Stockholm");
                                    Choice choice2 = new Choice("Göteborg");
                                    Choice choice3 = new Choice("Malmo");
                                    Choice choice4 = new Choice("Örebro");
                                    ArrayList<Choice> choices = new ArrayList<>();
                                    choices.add(choice2);
                                    choices.add(rightChoice1);
                                    choices.add(choice3);
                                    choices.add(choice4);
                                    Question question = new Question("What is the capital of Sweden", choices, rightChoice1);
                                    ArrayList<Question> questions = new ArrayList<>();
                                    questions.add(question);
                                    Game game = new Game(player, "2019-11-25", questions);
                                    for (Question questionGame : game.getQuestions()) {
                                        System.out.println(questionGame.getQuestion());
                                        System.out.println("Choose the correct one from the list");
                                        System.out.println(questionGame.getChoices());
                                        String answer = scanner.nextLine();
                                        if (answer.equals(questionGame.getRightChoice().getChoice())) {
                                            System.out.println("Correct");
                                            game.addOneScore();
                                            System.out.println("Final score is: "+ game.getFinalScore());
                                        }
                                    }
                                    break;
                            }

                        }
                    }
                    System.out.println("Wrong username or password");
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;

            }


        }


    }
}
