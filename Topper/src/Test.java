import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		Emp ram = new Emp();
		ram.setId(1);
		ram.setName("Ram");
		ram.setCity("Kanpur");
		list.add(ram);
		Emp shyam = new Emp();
		shyam.setId(2);
		shyam.setName("Ram");
		shyam.setCity("Kanpur");
		list.add(shyam);
		System.out.println(list);
		Emp obj = new Emp();
		obj.setId(1);
		obj.setName("Ram");
		obj.setCity("Kanpur");
		System.out.println(obj);
		if (list.contains(obj)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
