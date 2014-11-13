package kadry_26240.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface KadryServiceAsync {

	void getKadry(AsyncCallback<String[]> callback);

}
