public class VisitorStrategy implements IdentityStrategy {
    @Override
    public String generateEmail(Identity identity) {
        return "";
    }

    @Override
    public String generateDisplayName(Identity identity) {
        return identity.getFirst() + " " + identity.getLast();
    }
}