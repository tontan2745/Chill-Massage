class showCustomerdata {
	
	public String Customer_menu;
	public String Customer_masseuse;
	public String Customer_username;
	public String Customer_starttime;
	public String Customer_endtime;

public showCustomerdata(){
}

public showCustomerdata(String username, String menu, String masseuse, String starttime, String endtime){
	this.Customer_username = username;
	this.Customer_menu = menu;
	this.Customer_masseuse = masseuse;
	this.Customer_starttime = starttime;
	this.Customer_endtime = endtime;
	}

public void setCustomer_username(String username){
    this.Customer_username = username;
	}

public String getCustomer_username(){
    return Customer_username;	
	}

public void setCustomer_menu(String menu){
    this.Customer_menu = menu;
	}

public String getCustomer_menu(){
    return Customer_menu;	
	}

public void setCustomer_masseuse(String masseuse){
    this.Customer_masseuse = masseuse;
	}

public String getCustomer_masseuse(){
    return Customer_masseuse;	
	}

public void setCustomer_starttime(String starttime){
	this.Customer_starttime = starttime;
}

public String getCustomer_starttime(){
	return Customer_starttime;
}

public void setCustomer_endtime(String endtime){
	this.Customer_endtime = endtime;
}

public String getCustomer_endtime(){
	return Customer_endtime;
}

}