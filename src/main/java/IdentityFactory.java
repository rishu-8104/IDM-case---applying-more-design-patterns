import java.util.HashMap;

public class IdentityFactory {
    private HashMap<Integer, Identity> identityHashMap = new HashMap<>();
    private static Integer idCounter = 1;

    public Identity createIdentity(String username, String password, IdentityType type, String firstName, String lastName) {
        IdentityStrategy strategy = null;

        switch (type) {
            case VISITOR:
                strategy = new VisitorStrategy();
                break;
            case STUDENT:
                strategy = new StudentStrategy();
                break;
            case STAFF:
                strategy = new StaffStrategy();
                break;

            default:
                throw new IllegalArgumentException("Unsupported identity type: " + type);
        }

        Identity identity = new Identity(firstName, lastName, strategy);
        identity.setId(idCounter);
        identity.setEmail(strategy.generateEmail(identity));
        identity.setDisplayName(strategy.generateDisplayName(identity));

        identityHashMap.put(idCounter, identity);
        idCounter++;

        return identity;
    }
}