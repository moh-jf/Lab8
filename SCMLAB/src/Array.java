public class Array { 
 
	 	private static int [] AA; 
 	 
	 	public Array() { 
	 		AA = new int[100]; 
	 	} 
 	 
	 	public void setArray(int[] v){ 
	 	 	AA = v; 
	 	} 
 	 
	 	public int OCCUR(int key) { 
	 		
	 	 	int count = 0; 
	 	 	
	 	 	for (int i=0; i < AA.length - 1; i++)  	 	
 	 		
	 	 		if (AA[i]==key) 
	 	 			count++;  	 
 	 	
 	 			return count; 
	 	} 
	 	
} 
