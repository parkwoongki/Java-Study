package RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RemoteControl rc;
		// rc = new Television();
		// rc = new Audio(); 

		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
