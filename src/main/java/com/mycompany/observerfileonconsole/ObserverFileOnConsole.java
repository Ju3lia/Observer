/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.observerfileonconsole;

/**
 *
 * @author Student
 */
public class ObserverFileOnConsole {

    public static void main(String[] args){
        
        FileMonitor monitorObj = new FileMonitor ();
        monitorObj.AddConsoleMonitor(ConsoleMonitor.getInstance());
        monitorObj.addFile ("user.txt");
        monitorObj.addFile ("userB.txt");
        monitorObj.addFile ("userA.txt");
        
        boolean doCycle = true;
        while(doCycle == true){
        
             monitorObj.NotifyConsoleMonitor();
             
        }
        
       // SingleConsoleMonitor.getInstance().InfoFile("user.txt");
       // FileStatus  usrFile  =  new FileStatus("user.txt");
       // System.out.println(usrFile.getInfomsg());
        
//        System.out.println(usrFile.exist);
//        System.out.println(usrFile.lastModif);
//        System.out.println(usrFile.length);
//        System.out.println(usrFile.nameFile);
//        System.out.println(usrFile.pathFile);
      
        //boolean doCycle = true;
        //while(doCycle == true){
        

        //if(usrFile.UpdateInfo() == true)
        //{
            
          //  System.out.println(usrFile.getInfomsg());
            
//        System.out.println(usrFile.exist);
//        Date d = new Date(usrFile.lastModif);
//        System.out.println(d);
//        System.out.println(usrFile.length);
//        System.out.println(usrFile.nameFile);
//        System.out.println(usrFile.pathFile);
        
       }
        
      //  System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
        }
    
    

