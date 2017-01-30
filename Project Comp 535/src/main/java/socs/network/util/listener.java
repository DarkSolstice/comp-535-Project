package socs.network.util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import socs.network.node.Router;

public class listener extends Thread{
	private ServerSocket serverSocket;
	private Router listeningOn;
	   //new class for listening to incoming connections
	   public listener(Router router, int port) throws IOException {
	      serverSocket = new ServerSocket(port);
	      listeningOn = router;
	   }

	   public void run() {
	      while(true) {
	         try {
	            Socket server = serverSocket.accept();
	            
	            //we need to write a function to process terminal commands
	            server.close();
	            
	         }catch(SocketTimeoutException s) {
	            System.out.println("Socket timed out!");
	            break;
	         }catch(IOException e) {
	            e.printStackTrace();
	            break;
	         }
	      }
	   }

}
