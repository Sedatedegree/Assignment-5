import java.util.*;
public class Main {

   public static void main(String args[]) {
      // Create a Hashtable of account balance
      Hashtable acc_balance = new Hashtable();
      Enumeration person_names;
      String name_str;
      double balance;
      //initialize the Hashtable
      acc_balance.put("Lily", new Double(4367.34));
      acc_balance.put("Ben", new Double(95.43));
      acc_balance.put("Lacy", new Double(1200.00));
      acc_balance.put("Dillon", new Double(499.22));
      acc_balance.put("James", new Double(78.48));

      // retrieve the keys of the Hashtable
      person_names = acc_balance.keys();
      
      System.out.println("The account balance Hashtable:");
      System.out.println("\t KEY     VALUE\t");
      //print the contents of Hashtable
      while(person_names.hasMoreElements()) {
         name_str = (String) person_names.nextElement();
         System.out.println("\t" + name_str + "\t" + acc_balance.get(name_str));
      }        
      System.out.println();
      
      // Update Ben's Account by adding 1000 to it.
      balance = ((Double)acc_balance.get("Ben")).doubleValue();
      acc_balance.put("Ben", new Double(balance + 1000));
      //print the contents of updated account
      System.out.println("Ben's new Account balance: " + acc_balance.get("Ben"));
   }
}
