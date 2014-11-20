package kadry_26240.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Kadry_26240 implements EntryPoint {
	
	private Logger logger = Logger.getLogger(getClass().getName());
	private ListBox lb1 = null;
	
	private PersonServiceAsync personService= GWT.create(PersonService.class);
	
	public void refreshLb1(){
		final KadryServiceAsync kadryService= GWT.create(KadryService.class);
		kadryService.getKadry(new AsyncCallback<String[]>(){
			public void onFailure(Throwable error){
//				RootPanel.get().add(new Label("ERROR " + error));
				logger.log(Level.WARNING, getClass().getName()+ " KadryService Failure" + error.toString());
			}
			
			public void onSuccess(String[] kadry){
	//			RootPanel.get().add(new Label("SUCCESS"));
				logger.log(Level.INFO, getClass().getName()+ " KadryService Success");
				for(String s:kadry){
					RootPanel.get().add(new Label(s));
					lb1.addItem(s);
				}
				
			}
			
			
		});
		}


	public void onModuleLoad() {
		
		logger.log(Level.INFO, getClass().getName()+ " OnModuleLoad started");
		personService.addPerson("Jan Kowalski", new AsyncCallback<Void> () {

			
			@Override
			public void onSuccess(Void result) {
				logger.log(Level.INFO, getClass().getName()+ " addPerson SUCCESS");
			}
			@Override
			public void onFailure(Throwable caught) {
				logger.log(Level.WARNING, getClass().getName()+ " addPerson FAILURE");
			}

		
			
			
		});
		
		lb1 = new ListBox();
		lb1.setVisibleItemCount(5);
		refreshLb1();
		RootPanel.get("listbox1").add(lb1);
		
		TextBox tb1= new TextBox();
		RootPanel.get("textbox1").add(tb1);
		
		Button b1= new Button("Send");
		RootPanel.get("button1").add(b1);
	}
	

	
}
