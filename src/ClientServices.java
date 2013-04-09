import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientServices extends UnicastRemoteObject implements ClientJobSubmitter {

  private JobClient jobClient;

  protected ClientServices(JobClient jobClient) throws RemoteException {
    super();
    this.jobClient = jobClient;
  }

  public void submitJob(JobConf jconf) throws RemoteException {
    jobClient.submitJob(jconf);
  }

}
