class PrintNumber{
	static void printn(boolean a){
		System.out.println(a);
	}
	static void printn(String b){
		System.out.println(b);
	}
	static void printn(int c){
		System.out.println(c);
	}
	static void printn(long d){
		System.out.println(d);
	}
	static void printn(float e){
		System.out.println(e);
	}
	static void printn(char f){
		System.out.println(f);
	}
	static void printn(double g){
		System.out.println(g);
	}
	

	public static void main(String[]args){
		printn(50);
		printn(20.3f);
		printn(112);
		printn(60.8);
		printn("java");
		printn(true);
		printn('N');
		
	}
}