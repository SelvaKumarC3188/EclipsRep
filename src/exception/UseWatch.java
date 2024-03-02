package exception;

public class UseWatch {
	public static void main(String[] args) throws WaterProofException{
		Watch watch1=new Watch();
		watch1.brand="Rolex";
		watch1.price=12000000;
		watch1.color="Silver";
		watch1.isWaterproof=true;
		Watch watch2=new Watch();
		watch2.brand="Casio";
		watch2.price=12000;
		watch2.color="Black";
		watch2.isWaterproof=true;
		Watch watch3=new Watch();
		watch3.brand="Timix";
		watch3.price=1200;
		watch3.color="White";
		watch3.isWaterproof=false;
		Watch watch4=new Watch();
		watch4.brand="Fastrack";
		watch4.price=750;
		watch4.color="Red";
		watch4.isWaterproof=false;
		Watch[] watch= {watch1,watch2,watch3,watch4};
		System.out.println(watch2.findWaterproof(watch));
	}

}
