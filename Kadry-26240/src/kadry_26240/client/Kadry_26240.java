package kadry_26240.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;




/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Kadry_26240 implements EntryPoint {
	
	
	private ListBox lb1 = null;
	
	public void onModuleLoad() {
		
		final KadryServiceAsync kadryService= GWT.create(KadryService.class);
		kadryService.getKadry(new AsyncCallback<String[]>(){
			public void onFailure(Throwable error){
				RootPanel.get().add(new Label("ERROR " + error));
			}
			
			public void onSuccess(String[] kadry){
				RootPanel.get().add(new Label("SUCCESS"));
				for(String s:kadry){
					RootPanel.get().add(new Label(s));
					lb1.addItem(s);
				}
				
			}
			
			
		});
		
		

		lb1 = new ListBox();
		lb1.setVisibleItemCount(5);
		RootPanel.get("listbox1").add(lb1);
	
		
	}
	
	
	
	
	public void refreshLb1(){
		
	}
	
	
}
