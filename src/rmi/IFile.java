package rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  IFile extends Remote{
	
	public void UploadFile() throws RemoteException;
	
	//public void DownloadFile() throws RemoteException;

}
