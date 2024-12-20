
public interface IdentityStrategy {
    String generateEmail(Identity identity);
    String generateDisplayName(Identity identity);
}