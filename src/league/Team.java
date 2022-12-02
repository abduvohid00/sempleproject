package league;
import java.util.ArrayList;
public class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
     int count=1;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        }

        members.add(player);
            System.out.println((count++)+". "+player.getName() + " picked for team " + this.getName());
        return true;
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }

        played++;

        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    public ArrayList<T> getMembers(){
        return members;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking()>team.ranking()){
            return -1;
        }else if (this.ranking()<team.ranking()){
            return 1;
        }
        return 0;
        }
}