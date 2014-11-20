package kadry_26240.server;

import java.util.Vector;

import kadry_26240.client.KadryService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class KadryServiceImpl extends RemoteServiceServlet implements
KadryService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Vector<String> kadry = new Vector<>();
	
	public KadryServiceImpl(){
			kadry = new Vector<>();
			kadry.add("Ala");
			kadry.add("ma");
			kadry.add("kota");
};
	
			public String[] getKadry() {
		// return (String[]) kadry.toArray();
			String[] tab = {"ala", "ma"};
			return tab;
	}
		public void addKadry(String nazwisko)
		{
		kadry.add(nazwisko);
		}
}
	
