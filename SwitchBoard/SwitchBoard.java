class SwitchBoard {
    public static void main(String[] args) {
        String role = "bob";

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            
            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}
