import java.util.*;

class Team {
    String name;
    int matchesPlayed;
    int wins;
    int draws;

    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {

    CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 2) + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Cricket)\nPoints: " + calculatePoints();
    }
}

class FootballTeam extends Team {

    FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 3) + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Football)\nPoints: " + calculatePoints();
    }
}

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if (input.isEmpty())
                break;

            String[] data = input.split(",");

            String type = data[0];
            String name = data[1];
            int matches = Integer.parseInt(data[2]);
            int wins = Integer.parseInt(data[3]);
            int draws = Integer.parseInt(data[4]);

            Team team;

            if (type.equalsIgnoreCase("Cricket"))
                team = new CricketTeam(name, matches, wins, draws);
            else
                team = new FootballTeam(name, matches, wins, draws);

            System.out.println(team);
        }
    }
}