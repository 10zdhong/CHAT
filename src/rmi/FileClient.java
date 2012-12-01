package rmi;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;

public class FileClient {
	
	public static void main(String args[]){ 
        try { 
            //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法 
            IFile rhello =(IFile) Naming.lookup("rmi://10.22.26.21:8888/RFile"); 
            
            System.out.println("上传文件到远程服务器:\n");
            rhello.UploadFile();
            System.out.println("上传结束\n");
            
            //System.out.println("下载文件到本地:\n");
            //rhello.DownloadFile();
            //System.out.println("下载结束\n");
            
        } catch (NotBoundException e) { 
            e.printStackTrace(); 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (RemoteException e) { 
            e.printStackTrace();   
        } 
    } 

}
