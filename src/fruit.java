
public class fruit implements Comparable<fruit> {
	int no;
	String name;
	int price;

	public int compareTo(fruit o) {
		return name.compareTo(o.name);
	}

	public fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
}
