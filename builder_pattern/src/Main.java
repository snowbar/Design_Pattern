public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("ja")) {
            MenuBuilder builder = new JapaneseStyleMenuBuilder();
            run(builder);
        } else if (args[0].equals("en")) {
            MenuBuilder builder = new AmericanStyleMenuBuilder();
            run(builder);
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void run(MenuBuilder builder) {
        MenuDirector director = new CreateMenu1(builder);
        director.construct();
        String result = ((GetResult)builder).getResult();
        System.out.println(result);
    }
    public static void usage() {
        System.out.println("Usage: java Main ja      日本風表記");
        System.out.println("Usage: java Main en      アメリカ風表記");
    }
}
