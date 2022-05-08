class Masseuse{

	public String Masseuse_name;
	public String Masseuse_phonenumber;

public Masseuse(){
}

public Masseuse(String name,String phonenumber){
	this.Masseuse_name = name;
	this.Masseuse_phonenumber = phonenumber;
	}

public void setMasseuse_name(String name){
   this.Masseuse_name = name;
}

public String getMasseuse_name(){
   return Masseuse_name;
}

public void setMasseuse_phonenumber(String phonenumber){
	this.Masseuse_phonenumber = phonenumber;
}

public String getMasseuse_phonenumber(){
	return Masseuse_phonenumber;
}

}