package chap_8.replace_array_with_object;

public class App {
    public static void main(String[] args) {
        Performance row = new Performance();

        row.setName("Liverpool");
        row.setWins("15");

        String name = row.getName();
        int wins = row.getWins();
    }
}

class Performance {
    private String name;
    private int wins;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = Integer.parseInt(wins);
    }
}
