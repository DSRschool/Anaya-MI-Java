package cap14.recordsManager;

public class PlayerNameTooShortException extends Exception {
    private String name;

    public PlayerNameTooShortException(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getMessage() {
        return "El nombre del jugador (" + name + ") es demasiado corto.";
    }
}
