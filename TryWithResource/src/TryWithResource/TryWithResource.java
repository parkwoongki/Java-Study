package TryWithResource;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}
