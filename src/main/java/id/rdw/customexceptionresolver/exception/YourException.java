package id.rdw.customexceptionresolver.exception;

public class YourException extends RuntimeException{
    private final String yourMessage;

    public YourException(String yourMessage) {
        super(String.format("Exception occurs because of: %s", yourMessage));
        this.yourMessage = yourMessage;
    }

    public YourException(String message, String yourMessage) {
        super(message);
        this.yourMessage = yourMessage;
    }

    public String getYourMessage() {
        return yourMessage;
    }
}
