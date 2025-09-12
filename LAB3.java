package com.smvitm.cnlab;
import java.util.Scanner;
public class JavaApplication1{
    static String msg;
    static String genPoly="10001000000100001";
    
    static char t[]=new char[128];
    static char cs[]=new char[128];
    static char g[]=new char[128];
    
    static int mlen,glen,x,c,flag=0,test;
    
    public static void main(String[] args){
        Scanner in=new Scanner(system.in);
        
        System.out.println("enter the message to be transferred");
        msg=in.nextLine();
        mlen=msg.length();
        
        for(int i=0;i<mlen;i++)
            t[i]=msg.charAt(i);
        System.out.println("Predefined generator Polynomial is:"+genPoly);
        g=genPoly.toCharArray();
        glen=genPoly.length();
        
        for(x=mlen;x<(mlen+gen-1);x++)
            t[x]='0';
        System.out.println("Zero extended message is:"+new String(c));
        crc();
        System.out.println("CheckSum is:"+new String(cs));
        for(x=mlen;x<mlen+glen-1;x++)
            t[x]=cs[x-mlen];
        System.out.println("Final codeword generated is:"+new String);
                public static void xor(){
                    for(c=1;c<glen;c++)
                        cs[c]=((cs[c]==g[c])?'0':'1');
                }
}
