


package com.mycompany.dee;

import java.util.Scanner;



public class Dee {
static private String username,password,signout;
static int decision,problem;

static void captureOption(){
     Scanner enhle=new Scanner(System.in);
     System.out.println("enter 1 to register:"); 
     System.out.println("enter 2 to login"); 
     System.out.println("enter 3 to sign out");
     decision=enhle.nextInt();
switch(decision){

case 1:
            Registration();
            break;
case 2:
            Login();
            break;
case 3:
            captureDecision();
            break;
case 4:            
            System.exit(0);
            break;
default:
            System.out.println("out of range");
           break;         
}                  
}   
static void Registration(){
       
    Scanner t=new Scanner(System.in);
     System.out.println("enter your username");
     username=t.next();
     System.out.println("confirm your password");
     password=t.next();
       
}
     
    static void Login(){
     Scanner debs=new Scanner(System.in);
     System.out.println("enter your username");
     username=debs.next();
     System.out.println("enter your password");
     password=debs.next();
     if("me".equals(username) && "me".equals(password)){
         System.out.println("WELCOME");
         
     }
     else {
         System.out.println("invalid info ");
     }
}

    static void captureDecision(){
        
        if(decision==3 ){
            System.out.println("log out ");
        }
            
    }
    public static void main(String[] args) {
              captureOption();
              
              
        
    }
}
