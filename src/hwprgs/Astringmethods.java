package hwprgs;

public class Astringmethods {
	public static void main(String[]args) {
		String name="Ravikumar";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.concat("Ram"));
		System.out.println(name.equals("ravikumar"));
		System.out.println(name.equalsIgnoreCase("ravikumar"));
		System.out.println(name.contains("Vi"));
		System.out.println(name.startsWith("ra"));
		System.out.println(name.endsWith("ar"));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.indexOf("k"));
		System.out.println(name.substring(4));
		System.out.println(name.substring(0,4));
		char[] name2=name.toCharArray();
		System.out.println(name2[0]+" "+name2[1]+" "+name2[3]+" "+name2[4]+" "+name2[5]);
	}
	

}
