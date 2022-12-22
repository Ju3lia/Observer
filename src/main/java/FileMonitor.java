/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.observerfileonconsole.FileStatus;
import com.mycompany.observerfileonconsole.IConsoleMonitor;
import com.mycompany.observerfileonconsole.IFileMonitor;
import java.util.ArrayList;

/**
 *
 * @author Student
 */

public class FileMonitor implements IFileMonitor {
  private ArrayList<IConsoleMonitor> observers;
  private ArrayList<FileStatus> fileObj;
  
  
  FileMonitor(){
      observers = new ArrayList<IConsoleMonitor>();
      fileObj = new ArrayList<FileStatus>();   
  }
  
  @Override
  public void AddConsoleMonitor (IConsoleMonitor cmObj){
      if (cmObj!=null){
          
      }
  }
  
  @Override
   public void DelConsoleMonitor (IConsoleMonitor cmObj){
       
   }
   
   @Override
   public void NotifyConsoleMonitor (){
       String info;
       ArrayList<String> list = new ArrayList<String>;
       for (FileStatus objF: fileObj)
       {
           if (objF.UpdateInfo()==true){
               list.add(objF.getInfoMsg());
           }
       }
       if (!list.isEmpty()){
       for (IConsoleMonitor obj: observers){
           obj.UpdateConsoleMonitor(list);
       }
   }
           
        
   

public void addFile (String filePath){
    //Не добавляем обЬекты с щдинаковыми параметрами, такие как 
    FileStatus obj = new FileStatus (filePath);
    fileObj.add(obj);
}  
}
