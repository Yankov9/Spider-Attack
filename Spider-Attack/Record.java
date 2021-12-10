import java.util.Objects;

public class Record {
    private String player;
    private int score;

    public Record(String player, int score){
        this.player = player;
        this.score = score;
    }

    public String getPlayer(){ return player;}

    public void setPlayer() {this.player = player;}

    public int getScore() { return score;}

    public void setScore(int Score) {this.score = score;}

    public String toString(){
        return "Record{" +
                "Player='" + player + '\'' +
                ", sxore="+ score +
                        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return score == record.score && Objects.equals(player, record.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, score);
    }
}