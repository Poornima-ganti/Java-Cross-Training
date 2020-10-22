package java8features;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Stream;


public class Mapusingkeys implements Comparator {
	int cid;
	String name;
	String pswd;
	String city;
	double price;
	
	public Mapusingkeys(int cid, String name, String password, String city, double price) {
		super();
		this.cid = cid;
		this.name = name;
		this.pswd = pswd;
		this.city = city;
		this.price = price;
	}
	
	public String toString() {
		return "Mapusingkeys[id=" + cid + ", name=" +name + ", pswd=" + pswd + ",city=" + city + ",price="+ price+"]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
     
}
