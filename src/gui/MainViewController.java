package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	private void onMenuItemSellerAction () {
		System.out.println(menuItemSeller);
	}
	
	@FXML
	private void onMenuItemDepartment () {
		System.out.println(menuItemDepartment);
	}
	
	@FXML
	private void onMenuItemAbout () {
		System.out.println(menuItemAbout);
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}



}
