package kadry_26240.server;

import kadry_26240.client.KadryService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class KadryServiceImpl extends RemoteServiceServlet implements
KadryService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String[] getKadry(){
		String[] kadry =
			{ "ala", "ma", "kota"};
		return kadry;
	}
}
