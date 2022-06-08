class Palindrome{
	public static void main(String[] args){
		String x="civics";
		String x1="";
		
		for(int i=x.length()-1;i>=0;i--){
			x1=x1+x.charAt(i);
		}
		if(x.toLowerCase().equals(x1.toLowerCase())){
			System.out.println(x+" palindrome.");
		}else{
			System.out.println(x+" not palindrome.");
		}
	}
}

