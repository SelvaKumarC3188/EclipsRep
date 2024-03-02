package for2arrayprogramhw;

public class NewStudent {
	public static void main(String[]args) {
		Student st1=new Student();
		st1.name="Selvakumar";
		st1.age=28;
		st1.mobile=8754687102l;
		st1.rollnumber=23;
		st1.ispresent=true;
		st1.schoolfees=1000;
		
		Student st2=new Student();
		st2.name="Murali";
		st2.age=25;
		st2.mobile=8668002831l;
		st2.rollnumber=14;
		st2.ispresent=true;
		st2.schoolfees=1000;
		
		
		Student st3=new Student();
		st3.name="Siranjeevi";
		st3.age=25;
		st1.mobile=9344487102l;
		st1.rollnumber=3;
		st1.ispresent=false;
		st1.schoolfees=1000;
		
		Student st4=new Student();
		st4.name="Ashok";
		st4.age=24;
		st4.mobile=9454687102l;
		st4.rollnumber=21;
		st4.ispresent=true;
		st4.schoolfees=1000;
		
		Student[] sdt= {st1,st2,st3,st4};
		for(int i=0;i<sdt.length;i++) {
			if(sdt[i].rollnumber>=1&&sdt[i].rollnumber<20) {
				System.out.println("Section A "+sdt[i].name+" "+sdt[i].rollnumber);
			}
			else if(sdt[i].ispresent==true) {
				System.out.println(sdt[i].schoolfees*8/100+" "+sdt[i].name);
			}
				
			}
		}
	}


