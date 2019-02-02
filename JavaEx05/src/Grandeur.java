
public class Grandeur {
		
		public String Color;
		public String gear;
		public int price;
		
		public Grandeur(String co, String ge, int pr) {
			System.out.println("Grandeur constructor");
			this.Color = co;
			this.gear = ge;
			this.price = pr;
		}
		
		public void run() {
			System.out.println("--run--");
		}
		
		public void stop() {
			System.out.println("--stop--");
		}
		
		public void info() {
			System.out.println("--info--");
			System.out.println("color : " + Color);
			System.out.println("gear : " + gear);
			System.out.println("price : " + price);
		}
	
}
