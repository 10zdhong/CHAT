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
            //��RMI����ע����в�������ΪRHello�Ķ��󣬲��������ϵķ��� 
            IFile rhello =(IFile) Naming.lookup("rmi://10.22.26.21:8888/RFile"); 
            
            System.out.println("�ϴ��ļ���Զ�̷�����:\n");
            rhello.UploadFile();
            System.out.println("�ϴ�����\n");
            
            //System.out.println("�����ļ�������:\n");
            //rhello.DownloadFile();
            //System.out.println("���ؽ���\n");
            
        } catch (NotBoundException e) { 
            e.printStackTrace(); 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (RemoteException e) { 
            e.printStackTrace();   
        } 
    } 

}
