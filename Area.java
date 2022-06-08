public class Area{
	
	void areaRectangle(int length, int width){
    int AreaR = length * width;
	   System.out.println(AreaR);
 
 }
 void areaSquare(float side){
       float AreaS=side*side;
	   System.out.println(AreaS);
}
   public static void main(String[] args){
	   
	   Area a = new Area();
	   a.areaRectangle(10,20);
	   a.areaSquare(10);
   } 

}