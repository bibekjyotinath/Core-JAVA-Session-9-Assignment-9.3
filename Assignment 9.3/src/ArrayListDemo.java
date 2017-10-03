import java.util.*;      //importing java.util package to use ArrayList

class HDTV {				//creation of class HDTV
	String BrandName;		//String type variable Declared
	int Size;				//integer type variable Declared
	HDTV(String bname, int size) {	//constructor created which contains two variables bname and size which is taken from the object
		this.BrandName = bname;		//assigning the value of bname to BrandName
		this.Size = size;			//assigning the value of size to Size
	}
}

public class ArrayListDemo {				//main class of the program

	public static void main(String[] args) {		//main method of the program
		
		HDTV hdtv = new HDTV("LG", 42);			//creation of object of class HDTV and passing parameter for the constructor
		HDTV hdtv1 = new HDTV("SAMSUNG", 55);	//creation of object of class HDTV and passing parameter for the constructor
		HDTV hdtv2 = new HDTV("SONY", 60);		//creation of object of class HDTV and passing parameter for the constructor
		
		ArrayList <HDTV> hdtvd = new ArrayList<HDTV>(); 		//creation of  ArrayList hdtvd
		
		//adding data to hdtvd ArrayList using the object of class HDTV
		hdtvd.add(hdtv);
		hdtvd.add(hdtv1);
		hdtvd.add(hdtv2);
		
		 //Getting Iterator  
		Iterator itr=hdtvd.iterator();  
		
		//traversing elements of ArrayList object  
		while(itr.hasNext()) {	
			HDTV tv = (HDTV)itr.next();  
		    System.out.println(tv.BrandName+", "+tv.Size);  //displaying the contents on the console

		}
	}

}
