
ClientSide Program
import java.net.";
import juvn.io .*;
import java.util .*;
public class SocketClient {
public static void main(String args[]) throws Exception {
Scanner in - new Scanner(System.in);
/* Create socket at client side */
Socket glientSocket = new Socket("127.0.0.1", 4000);

System.out.printin(" **** Client side **** ");
/* Reading the filename from keyboard, */
System.out.println("Enter the filename to transfer");
String fname = in.nextLine();
/* Sending the filename to server, Uses PrintWriter to write filename to output stream */
OutputStream ostream = clientSocket.getOutputStream();
PrintWriter pwrite = new PrintWriter(ostream, true);
pwrite.println(fname);
/* Receiving the contents from server. Uses inputstream */
InputStream istream = clientSocket.getinputStream();
BufferedReader socketRead =new BufferedReader(new InputStreamReader(istream));
System.out.printin("Contents of the file " + fname +" are");
String str;
while ((str- socketRead.readLine()) != null) /* Reading line-by-line */ {
System.out.printin(str);
pwrite.closel);
socketRead.close();
