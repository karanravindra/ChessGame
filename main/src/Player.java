// import statements
/**
 * An object class for creating players for the ChessGame program
 *
 * ChessGame Project
 *
 * @author Clayton Whitten & Karan Ravindra
 * @version Oct 5, 2022
 */

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}