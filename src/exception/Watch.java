package exception;

public class Watch  {
	String brand;
	int price;
	String color;
	boolean isWaterproof;
	public String findWaterproof(Watch[] watch) throws WaterProofException {
			for(Watch w:watch) {
			if(w.isWaterproof!=true) {
				throw new WaterProofException("no");
			}
			else {
				return "isWaterproof";
			}	
		}
					return "";
	}

}
