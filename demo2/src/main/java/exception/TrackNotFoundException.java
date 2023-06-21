package exception;

public class TrackNotFoundException extends RuntimeException {
    public TrackNotFoundException(Long id) {
        super("Album not found with id " + id);
    }
}