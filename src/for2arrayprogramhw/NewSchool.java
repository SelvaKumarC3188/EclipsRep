package for2arrayprogramhw;

public class NewSchool {
	public static void main(String[]args) {
		School school1=new School();
		school1.name="ram school";
		school1.location="Chennai1";
		school1.rating=3.1f;
		school1.strength=600;
		school1.iscoed=true;
		
		School school2=new School();
		school2.name="kk school";
		school2.location="Chennai2";
		school2.rating=3.4f;
		school2.strength=780;
		school2.iscoed=false;
		
		School school3=new School();
		school3.name="sr school";
		school3.location="Chennai3";
		school3.rating=3.8f;
		school3.strength=665;
		school3.iscoed=true;
		
		School school4=new School();
		school4.name="sky school";
		school4.location="Chennai4";
		school4.rating=3.9f;
		school4.strength=400;
		school4.iscoed=false;
		School[] scl= {school1,school2,school3,school4};
		for(int i=0;i<scl.length;i++) {
			if(scl[i].iscoed==true&&scl[i].rating>3) {        //find coed and star rating above 3
				System.out.println(scl[i].name+" "+scl[i].location);
							}
		}
		
	}
	}
