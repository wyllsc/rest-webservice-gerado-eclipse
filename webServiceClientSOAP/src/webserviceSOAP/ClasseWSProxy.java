package webserviceSOAP;

public class ClasseWSProxy implements webserviceSOAP.ClasseWS {
  private String _endpoint = null;
  private webserviceSOAP.ClasseWS classeWS = null;
  
  public ClasseWSProxy() {
    _initClasseWSProxy();
  }
  
  public ClasseWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initClasseWSProxy();
  }
  
  private void _initClasseWSProxy() {
    try {
      classeWS = (new webserviceSOAP.ClasseWSServiceLocator()).getClasseWS();
      if (classeWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)classeWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)classeWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (classeWS != null)
      ((javax.xml.rpc.Stub)classeWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webserviceSOAP.ClasseWS getClasseWS() {
    if (classeWS == null)
      _initClasseWSProxy();
    return classeWS;
  }
  
  public int multiplicacao(int valor1, int valor2) throws java.rmi.RemoteException{
    if (classeWS == null)
      _initClasseWSProxy();
    return classeWS.multiplicacao(valor1, valor2);
  }
  
  public java.lang.String retornaString(java.lang.String parametro) throws java.rmi.RemoteException{
    if (classeWS == null)
      _initClasseWSProxy();
    return classeWS.retornaString(parametro);
  }
  
  public int soma(int valor1, int valor2) throws java.rmi.RemoteException{
    if (classeWS == null)
      _initClasseWSProxy();
    return classeWS.soma(valor1, valor2);
  }
  
  
}