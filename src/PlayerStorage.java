import java.util.ArrayList;

public class PlayerStorage {
    private ArrayList<Player> players=new ArrayList<>();

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> AddPlayer(Player player){
        players.add(player);
        return players;
    }
}
