package hwprgs;

public class UseAirConditioner {
	public static void main(String[] args) {
		String[] ss = args[0].split("-");
		Airconditioner ac1 = new Airconditioner();
		ac1.brand = ss[0];
		ac1.price = Integer.parseInt(ss[1]);
		ac1.isAutomatic = Boolean.parseBoolean(ss[2]);
		if (ac1.brand.contains("a") || ac1.brand.contains("e") || ac1.brand.contains("i") || ac1.brand.contains("o")
				|| ac1.brand.contains("u")) {
			System.out.println("contains vowels");
		} else {
			System.out.println("not");
		}

	}

}
