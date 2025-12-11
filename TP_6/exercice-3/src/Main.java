public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage: java application with two args");
            return;
        }

        for(String arg : args){
            // les expression regulier
            if(!arg.matches("\\d+")){
                System.out.println("Usage: args must be numbers");
                return;
            }
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+" + " +b+" = "+ (a+b));
    }
}
