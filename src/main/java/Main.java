public class Main {
    public static void main(String[] args) {
        IdentityFactory identityFactory = new IdentityFactory();

        // Creating a visitor
        Identity visitor = identityFactory.createIdentity("visitor1", "password123", IdentityType.VISITOR, "John", "Doe");
        System.out.println("Visitor Identity: " + visitor.getDisplayName());

        // Creating a student
        Identity student = identityFactory.createIdentity("student1", "password456", IdentityType.STUDENT, "Alice", "Johnson");
        System.out.println("Student Identity: " + student.getDisplayName());

        // Creating a staff member
        Identity staff = identityFactory.createIdentity("staff1", "password789", IdentityType.STAFF, "Robert", "Smith");
        System.out.println("Staff Identity: " + staff.getDisplayName());
    }
}
