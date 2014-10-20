package webserviceSOAP.clientWS;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import webserviceSOAP.ClasseWS;
import webserviceSOAP.ClasseWSServiceLocator;

public class Cliente {

	public static void main(String[] args) throws RemoteException {
		try {
			ClasseWS ws = new ClasseWSServiceLocator().getClasseWS();
			System.out.println(ws.retornaString("Cliente Pow"));
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
