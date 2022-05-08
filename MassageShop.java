import javax.swing.JOptionPane;
class MassageShop{

	static register R[] = new register[9999];
	static int countR = 0;
	static int countsd = 0;
	static MassageShop lr = new MassageShop();
	static Menu [] m = new Menu[5];
	static Masseuse mu = new Masseuse();
	static Masseuse [] ma = new Masseuse[5];
	static int [][][] mt = new int [5][19][9999];
	static int [] countmt = new int[1];
	static showCustomerdata [] sd = new showCustomerdata[9999];
	static int result[] = new int [1];
	static int resultmenu[] = new int [1];
	static int resultmasseuse[] = new int [1];

	public static void main(String [] args){
		
		lr.createMenu();
		lr.createMasseuse();
		
		int ch;
			ch = lr.menu();
			do{ 
				switch(ch){
					case 1 : lr.registerCustomer(); break;
					case 2 : lr.loginCustomer(); break;
					case 3 : System.exit(0);

				default : break;
				}
			ch = lr.menu();
			}while(ch!=3);
	}
	
	public int menu(){
		int ch;
			ch = Integer.parseInt(JOptionPane.showInputDialog("- - - - Chill Massage - - - -"
	                                                  +"\n 1. Register "
													  +"\n 2. Login "
													  +"\n 3. Exit Program"));
		return ch;
	}
	
	public void createMenu(){
		m[0] = new Menu("Oil massage",500);
		m[1] = new Menu("Reflexology",400);
		m[2] = new Menu("Thai massage",290);
		m[3] = new Menu("Foot massage",500);
		m[4] = new Menu("Scrub massage",500);
	}

	public void createMasseuse(){
		ma[0] = new Masseuse("John","062-999-9999");
		ma[1] = new Masseuse("Alice","063-999-9999");
		ma[2] = new Masseuse("Oliver","064-999-9999");
		ma[3] = new Masseuse("Susan","065-999-9999");
		ma[4] = new Masseuse("Jason","066-999-9999");
	}

	public void registerCustomer(){
		
		String username,password;

		username = JOptionPane.showInputDialog("Username");
		password = JOptionPane.showInputDialog("Password");
		
			R[countR] = new register(username,password);
			countR++;

		JOptionPane.showMessageDialog(null,"Register successful");

	}

	public void loginCustomer(){
		
		String login_username,login_password,name;
		String username_ = "";
		boolean x = false;

		login_username = JOptionPane.showInputDialog("Username");
		login_password = JOptionPane.showInputDialog("Password");
			
			for(int i = 0;i < countR;i++){
				if (login_username.equals(R[i].getCustomer_name()) && login_password.equals(R[i].getCustomer_password())){
					name = R[i].getCustomer_name();
					result[0] = i;
					x = false;
					JOptionPane.showMessageDialog(null,"Welcome "+name); 
					lr.Reserve(); break;
				}

				else {
					x = true; 
				}
			}

			if (x){
				JOptionPane.showMessageDialog(null,"User not found :(");
			}
	}

	public void Reserve(){
		int ch;
			ch = lr.menuReserve();
			do{ 
				switch(ch){
					case 1 : lr.inputmenuMasseuse(); break;
					case 2 : lr.inputMasseuse(); break;
					case 3 : lr.inputMasseusetime(); break;
					case 4 : lr.cancelall(); break;
					case 5 : lr.showuserdata(); break;
					case 6 : lr.menu(); break;

				default : break;
				}
			ch = lr.menuReserve();
			}while(ch!=6);
	}

	public int menuReserve(){
		int ch;
			ch = Integer.parseInt(JOptionPane.showInputDialog("- - - - Welcome Chill Massage- - - -"
	                                                  +"\n 1. Select Menu Massage "
													  +"\n 2. Select Masseuse "
													  +"\n 3. Select Massage time "
													  +"\n 4. Cancel Massage Time "
													  +"\n 5. Show Customer Data "
													  +"\n 6. Back to main page"));
		return ch;
	}

	public void inputmenuMasseuse(){
		int inputmenu;
		String menuname;
		
			do{
				inputmenu = Integer.parseInt(JOptionPane.showInputDialog("Select Menu Massage"
																+"\n1. "+ m[0].getMenu_name()
																+"\n2. "+ m[1].getMenu_name()
																+"\n3. "+ m[2].getMenu_name()
																+"\n4. "+ m[3].getMenu_name()
																+"\n5. "+ m[4].getMenu_name()));
				if (inputmenu == 1){
					JOptionPane.showMessageDialog(null,"Your Select Menu: "+m[0].getMenu_name()); 
					menuname = "Oil massage";
					resultmenu[0] = 0; break;
				}

				else if (inputmenu == 2){
					JOptionPane.showMessageDialog(null,"Your Select Menu: "+m[1].getMenu_name());
					menuname = "Reflexology";
					 
					resultmenu[0] = 1; break;
				}
		
				else if (inputmenu == 3){
					JOptionPane.showMessageDialog(null,"Your Select Menu: "+m[2].getMenu_name());
					menuname = "Thai massage";
					 
					resultmenu[0] = 2; break;
				}

				else if (inputmenu == 4){
					JOptionPane.showMessageDialog(null,"Your Select Menu: "+m[3].getMenu_name());
					menuname = "Foot massage";
					 
					resultmenu[0] = 3; break;
				}

				else if (inputmenu == 5){
					JOptionPane.showMessageDialog(null,"Your Select Menu: "+m[4].getMenu_name());
					menuname = "Scrub massage";
					
					resultmenu[0] = 4; break;
				}

			}while(inputmenu!=5);

	}
	
	public void inputMasseuse(){
		int inputmasseuse;
		String masseusename;
			do{
				inputmasseuse = Integer.parseInt(JOptionPane.showInputDialog("Select Masseuse"
																+"\n1. Name: "+ ma[0].getMasseuse_name()+" Tel: "+ma[0].getMasseuse_phonenumber()
																+"\n2. Name: "+ ma[1].getMasseuse_name()+" Tel: "+ma[1].getMasseuse_phonenumber()
																+"\n3. Name: "+ ma[2].getMasseuse_name()+" Tel: "+ma[2].getMasseuse_phonenumber()
																+"\n4. Name: "+ ma[3].getMasseuse_name()+" Tel: "+ma[3].getMasseuse_phonenumber()
																+"\n5. Name: "+ ma[4].getMasseuse_name()+" Tel: "+ma[4].getMasseuse_phonenumber()));
				countmt[0] = inputmasseuse;
				if (inputmasseuse == 1){
					JOptionPane.showMessageDialog(null,"Your Select: "+ma[0].getMasseuse_name()+" Tel: "+ma[0].getMasseuse_phonenumber()); 
					masseusename = "John";
					resultmasseuse[0] = 0; break;
				}

				else if (inputmasseuse == 2){
					JOptionPane.showMessageDialog(null,"Your Select: "+ma[1].getMasseuse_name()+" Tel: "+ma[1].getMasseuse_phonenumber());
					masseusename = "Alice";
					resultmasseuse[0] = 1; break;
				}
		
				else if (inputmasseuse == 3){
					JOptionPane.showMessageDialog(null,"Your Select: "+ma[2].getMasseuse_name()+" Tel: "+ma[2].getMasseuse_phonenumber());
					masseusename = "Oliver";
					resultmasseuse[0] = 2; break;
				}

				else if (inputmasseuse == 4){
					JOptionPane.showMessageDialog(null,"Your Select: "+ma[3].getMasseuse_name()+" Tel: "+ma[3].getMasseuse_phonenumber());
					masseusename = "Susan";
					resultmasseuse[0] = 3; break;
				}

				else if (inputmasseuse == 5){
					JOptionPane.showMessageDialog(null,"Your Select: "+ma[4].getMasseuse_name()+" Tel: "+ma[4].getMasseuse_phonenumber());
					masseusename = "Jason";
					resultmasseuse[0] = 4; break;
				}

			}while(inputmasseuse!=5);
    	
	}

	public void inputMasseusetime(){
		int inputstarttime,inputendtime;
		String st="";
		String et="";
		String timetable_ [] = {"8.00","8.30","9.00","9.30","10.00","10.30","11.00","11.30","12.00","13.00","13.30","14.00","14.30","15.00","15.30","16.00","16.30","17.00","17.30","18.00"};
		boolean check = false;
		int[] cx = new int[1];
			do{
				inputstarttime = Integer.parseInt(JOptionPane.showInputDialog("- - - - Select Start Time - - - -"
																	+"\n1. 8.00 "
																	+"\n2. 8.30 "
																	+"\n3. 9.00 "
																	+"\n4. 9.30 "
																	+"\n5. 10.00 "
																	+"\n6. 10.30 "
																	+"\n7. 11.00 "
																	+"\n8. 11.30 "
																	+"\n9. 12.00 "
																	+"\n10. 13.00 "
																	+"\n11. 13.30 "
																	+"\n12. 14.00 "
																	+"\n13. 14.30 "
																	+"\n14. 15.00 "
																	+"\n15. 15.30 "
																	+"\n16. 16.00 "
																	+"\n17. 16.30 "
																	+"\n18. 17.00 "
																	+"\n19. 17.30 ")); 
	
				if(inputstarttime >= 20){ 
					JOptionPane.showMessageDialog(null,"Please input time again");
				}
				else { 
					

				inputendtime = Integer.parseInt(JOptionPane.showInputDialog("- - - - Select End Time - - - -"
																	+"\n1. 8.00 "
																	+"\n2. 8.30 "
																	+"\n3. 9.00 "
																	+"\n4. 9.30 "
																	+"\n5. 10.00"
																	+"\n6. 10.30"
																	+"\n7. 11.00 "
																	+"\n8. 11.30 "
																	+"\n9. 12.00 "
																	+"\n10. 13.00 "
																	+"\n11. 13.30 "
																	+"\n12. 14.00 "
																	+"\n13. 14.30 "
																	+"\n14. 15.00 "
																	+"\n15. 15.30 "
																	+"\n16. 16.00 "
																	+"\n17. 16.30 "
																	+"\n18. 17.00 "
																	+"\n19. 17.30 "
																	+"\n20. 18.00 "));
				
				if(inputendtime > 20){ 
					JOptionPane.showMessageDialog(null,"Please input time again");
				}
				else{
					

					
					
					for(int x=0;x<countR;x++){
					if(mt[countmt[0]][inputstarttime-1][x] == 1){
						cx[0] = cx[0]+1;}}
					
					if(cx[0] == 1){ 
						JOptionPane.showMessageDialog(null,"Masseuse is Busy");
						cx[0] = 0;
					}
					else{
						for(int i=inputstarttime-1;i<inputendtime-1;i++){

							mt[countmt[0]][i][result[0]] = 1;}
							check =true;
							cx[0] = 0;
							sd[countsd] = new showCustomerdata(R[result[0]].getCustomer_name(),m[resultmenu[0]].getMenu_name(),ma[resultmasseuse[0]].getMasseuse_name(),timetable_[inputstarttime-1],timetable_[inputendtime-1]);
							countsd++;
					}
				}

				}
				}while(check != true);
	}

	public void cancelall(){
		
		for(int i=0;i<5;i++){
			for(int j=0;j<19;j++){
				mt[i][j][result[0]] = 0;
				sd[countsd-1].setCustomer_username("None");
				sd[countsd-1].setCustomer_masseuse("None");
				sd[countsd-1].setCustomer_menu("None");
				sd[countsd-1].setCustomer_starttime("None");
				sd[countsd-1].setCustomer_endtime("None");
			}
		}
		JOptionPane.showMessageDialog(null,"Cancel successful");
	}

	public void showuserdata(){
		JOptionPane.showMessageDialog(null,"Username : "+sd[countsd-1].getCustomer_username()
										+"\nUser Masseuse : "+sd[countsd-1].getCustomer_masseuse()
										+"\nUser Menu : "+sd[countsd-1].getCustomer_menu()
										+"\nUser Time : "+sd[countsd-1].getCustomer_starttime()+" "+sd[countsd-1].getCustomer_endtime());
		
	}
	
}//end class