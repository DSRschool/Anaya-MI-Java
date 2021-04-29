package cap14.recordsManager;

public class ScoreTooLowException extends Exception {

    private String name;
    private int score;

    public ScoreTooLowException(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String getMessage() {
        return "El usuario " + name + " tiene menos puntos ("
                + score + ") de los requeridos.";
    }
}
