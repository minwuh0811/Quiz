import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleGame {
    private Scanner scanner;
    private PlayerStorage players;

    public ConsoleGame(Scanner scanner){
        this.scanner=scanner;
        this.players = new PlayerStorage();
    }

    public static void main(String[] args) {
        ConsoleGame consoleGame =new ConsoleGame(new Scanner(System.in));
        while (true) {
            System.out.println("New User Press 1, User has a account Press 2, Exit Press 3");
            String choice = consoleGame.getLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter a username");
                    String username = consoleGame.getLine();
                    System.out.println("Enter a password");
                    String password = consoleGame.getLine();
                    consoleGame.players.AddPlayer(new Player(username, password));
                    break;
                case "2":
                    System.out.println("Enter your username");
                    username = consoleGame.getLine();
                    System.out.println("Enter a password");
                    password = consoleGame.getLine();
                    for (Player player : consoleGame.players.getPlayers()) {
                        if (player.getUsername().equals(username) && player.getPassword().equals(password)) {
                            System.out.println("Login successfully");
                            while(true) {
                                System.out.println("Play game Press 1, Exit Press 2");
                                String choicePlay = consoleGame.getLine();
                                switch (choicePlay) {
                                    case "1":
                                        ArrayList<Question> testQuestions=new ArrayList<>();
                                        consoleGame.addTestQuestions(testQuestions, consoleGame.testQuestion(new Choice("Stockholm"), new Choice("Göteborg"), new Choice("Malmo"), new Choice("Örebro"), "What is capital of Sweden?"));
                                        consoleGame.addTestQuestions(testQuestions, consoleGame.testQuestion(new Choice("Copenhagen"), new Choice("Göteborg"), new Choice("Malmo"), new Choice("Örebro"), "What is capital of Denmark?"));
                                        Game game = new Game(player, testQuestions);
                                        for (Question questionGame : game.getQuestions()) {
                                            System.out.println(questionGame.getQuestion());
                                            System.out.println("Choose the correct one from the list");
                                            System.out.println(questionGame.getChoices());
                                            String answer = consoleGame.getLine();
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
                                        return;
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

    public Question testQuestion(Choice rightChoice1, Choice choice2, Choice choice3, Choice choice4, String question){
        ArrayList<Choice> choices = new ArrayList<>();
        choices.add(choice2);
        choices.add(rightChoice1);
        choices.add(choice3);
        choices.add(choice4);
        Question testQuestion = new Question(question, choices, rightChoice1);
        return testQuestion;
    }

    public ArrayList<Question> addTestQuestions(ArrayList<Question> testQuestions, Question testQuestion){
        testQuestions.add(testQuestion);
        return testQuestions;

    }

}
