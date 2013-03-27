import java.util.Random;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = new Main().Generate();
		System.out.println(a);
	}
	
	// check if someone wins
	public boolean Wins(int a){
		
		if(a == 3){
			return true;
		}
		return false;
	}
	
	//generate random number between 0 and 8
	public int Generate(){
		Random r = new Random();
		int a = r.nextInt(8);
		
		return a;
	}
	
	//draw panel
	public void Draw(){
		
	}

}
