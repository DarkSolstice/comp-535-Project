package socs.network;



import socs.network.node.Router;
import socs.network.util.Configuration;

public class Main {

  public static void main(String[] args) {
	System.setProperty("java.net.preferIPv4Stack" , "true");
    if (args.length != 1) {
      System.out.println("usage: program conf_path");
      System.exit(1);
    }
    Router r = new Router(new Configuration(args[0]));
    r.terminal();
  }
}
