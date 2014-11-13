package kadry_26240.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("kadry")
public interface KadryService extends RemoteService {
	public String[] getKadry();
	
}
