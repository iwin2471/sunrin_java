import java.io.Serializable;

public class Member implements Serializable{
	private String name;
	transient private String secretInfo;
	
	public Member(String name) {
		this.name = name;
		this.secretInfo = "���";
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", secretInfo=" + secretInfo + "]";
	}
		
}
