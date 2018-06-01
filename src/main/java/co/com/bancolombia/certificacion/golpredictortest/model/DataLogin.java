package co.com.bancolombia.certificacion.golpredictortest.model;

public class DataLogin {
	private String user;
	private String password;

	public DataLogin (String user, String password) {
		this.user=user;
		this.password= password;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getPassword() {
		return password;
	}
	
}
