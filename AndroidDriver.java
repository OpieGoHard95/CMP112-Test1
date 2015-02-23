public class AndroidDriver {
	public static void main(String [] args) {
		Android phone = new Android();
		System.out.println(phone.toString());
		Android gs = new Android("Galaxy S5", "Lolipop", 2);
		System.out.println(gs.toString());
		Android lgg = new Android("LG G3", "KitKat");
		System.out.println(lgg.toString());
		Android lgf = new Android("LG Optimus F3");
		System.out.println(lgf.toString());
	}
}
