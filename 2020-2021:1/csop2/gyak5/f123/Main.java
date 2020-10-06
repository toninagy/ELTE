public class Main {
    public static void main(String[] arguments) {
        try {
            if(arguments.length != 3) {
                throw new IllegalArgumentException();
              }
              if(arguments.length == 3) {
                  double a = Double.parseDouble(arguments[0]);
                  double b = Double.parseDouble(arguments[1]);
                  String muv = arguments[2];
                  switch (muv){
                    case "+" : 
                      System.out.println("Összeg: " + (a+b));
                      break;
                    case "-" :
                      System.out.println("Kivonás: " + (a-b));
                      break;
                    case "*" :
                      System.out.println("Szorzás: " + (a*b));
                      break;
                    case "/" :
                      if(b == 0) {
                        throw new ArithmeticException("Attempted division by zero");
                      }
                      System.out.println("Osztás: " + (a/b));
                      break;
                    default:
                      throw new IllegalArgumentException("Invalid program arguments provided.");
                  }
                  // throw new RuntimeException();
      
                  }
        } catch(NumberFormatException nfe) {
          System.out.println("Invalid double values provided");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch(ArithmeticException ae) {
          System.out.println(ae.getMessage());
        }
        // finally {
        //   System.out.println("im here");
        //   try{
        //     System.out.println(5/0);
        //   } catch(ArithmeticException nfe) {

        //   }
        //   System.out.println("im here");
        // }

        
    } 
}