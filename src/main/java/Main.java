public class Main {

    public static void main(String[] args) {

        if(args.length < 3) System.out.println("Wrong login or password");
        else {
            User user = new User(args[0], Integer.parseInt(args[1]), args[2]);
            user.greetUser(user);
        }
    }
}
