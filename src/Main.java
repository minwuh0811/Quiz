import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner scanner;
    private PlayerStorage players;

    public Main(Scanner scanner){
        this.scanner=scanner;
        this.players = new PlayerStorage();
    }

    public static void main(String[] args) {
        Main main=new Main(new Scanner(System.in));
        while (true) {
            System.out.println("New User Press 1, User has a account Press 2, Exit Press 3");
            String choice = main.getLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter a username");
                    String username = main.getLine();
                    System.out.println("Enter a password");
                    String password = main.getLine();
                    main.players.AddPlayer(new Player(username, password));
                    break;
                case "2":
                    System.out.println("Enter your username");
                    username = main.getLine();
                    System.out.println("Enter a password");
                    password = main.getLine();
                    for (Player player : main.players.getPlayers()) {
                        if (player.getUsername().equals(username) && player.getPassword().equals(password)) {
                            System.out.println("Login successfully");
                            while(true) {
                                System.out.println("Play game Press 1, Exit Press 2");
                                String choicePlay = main.getLine();
                                switch (choicePlay) {
                                    case "1":
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
                                        Game game = new Game(player, questions);
                                        for (Question questionGame : game.getQuestions()) {
                                            System.out.println(questionGame.getQuestion());
                                            System.out.println("Choose the correct one from the list");
                                            System.out.println(questionGame.getChoices());
                                            String answer = main.getLine();
                                            if (answer.equals(questionGame.getRightChoice().getChoice())) {
                                                System.out.println("Correct");
                                                game.addOneScore();
                                                System.out.println("Final score is: " + game.getFinalScore());
                                            } else {
                                                System.out.println("Incorrect!!");
                                                System.out.println("Final score is: " + game.getFinalScore());
                                            }
                                        }
                                        game.printFinalDate();
                                        break;
                                    case "2":
                                        return;
                                    default:
                                        System.out.println("Invalid input!!");
                                        break;
                                }
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

    public String getLine(){
        return scanner.nextLine();
    }
}
