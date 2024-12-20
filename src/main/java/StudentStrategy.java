public class StudentStrategy implements IdentityStrategy {
    @Override
    public String generateEmail(Identity identity) {
        return identity.getFirst().toLowerCase() + "." + identity.getLast().toLowerCase() + "@tuni.fi";
    }

    @Override
    public String generateDisplayName(Identity identity) {
        return identity.getFirst() + " " + identity.getLast();
    }
}