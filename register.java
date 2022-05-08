class register{

	public String Customer_name;
	public String Customer_password;

public register(String name, String password){
	this.Customer_name = name;
	this.Customer_password = password;
	}

public void setCustomer_name(String name){
    this.Customer_name = name;
	}

public String getCustomer_name(){
    return Customer_name;	
	}

public void setCustomer_password(String password){
    this.Customer_password = password ;
	}

public String getCustomer_password(){
    return Customer_password ;	
	}

}