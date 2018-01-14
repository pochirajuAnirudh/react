package model;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class demo {
	   @NotNull
	   @Size(max = 140)
	    private String name;
	   @NotNull
	    private String gender;
	   @NotNull
	   @Size(max = 12)
	    private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	   

}
