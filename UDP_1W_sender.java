import java.io.*;
import java.net.*;
class UDP_1W_server
{
public static void main(String args[])throws IOException
{
DatagramSocket ds;
DatagramPacket dp;
byte buff[]=new byte[1024];
String str, str1=new String();
boolean i=true;
while(i)
{
ds=new DatagramSocket();
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter message");
str=in.readLine();
buff=str.getBytes();
dp=new DatagramPacket(buff,buff.length,InetAddress.getLocalHost(),8000);
ds.send(dp);
System.out.println("do you want to continue:yes or no");
str1=in.readLine();
if(str1.equals("yes"))
                    i=true;
                else
                    i=false;
}
}}