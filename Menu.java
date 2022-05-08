class Menu{

	public String Menu_name;
	public int Menu_price;

public Menu(String name, int price){
	this.Menu_name = name;
	this.Menu_price = price;
	}

public void setMenu_name(String name){
    this.Menu_name = name;
	}

public String getMenu_name(){
    return Menu_name;	
	}

public String getMenu_time(){
    return Menu_name;	
	}

public void setMenu_price(int price){
	this.Menu_price = price;
}

public int getMenu_price(){
	return Menu_price;
}

}