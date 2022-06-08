public class Parameter{
	
	void sequence(int i,char c){
		System.out.println("int is:"+i+  "\tchar is:"+c);
	
		
	}
	
	void sequence(char c,int i){
		System.out.println("char is:"+c+   "\tint is:"+i);
		
	}
	
	public static void main(String[] args){
		Parameter p1=new Parameter();
		p1.sequence(10,'a');
		p1.sequence('b',20);
		
	}
}