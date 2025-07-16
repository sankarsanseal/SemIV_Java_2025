public class ArgumentChecker{
    public static void main(String [] args) {
        if(args.length == 0){
            System.out.println("No arguments found!");
            return;
        }
        else{
            for(int i = 0; i<args.length;i++){
                String arg = args[i];
                try{
                    int num = Integer.parseInt(arg);
                    System.out.println("Argument: "+arg+" is an Integer");
                }
                catch(NumberFormatException e){
                    System.out.println("Argument: "+arg+" is not an Integer");
                }               
            }
        }
    }
}