package HW2;

public class HW2 {
	
	public static <E extends Comparable<E>> E max(E [] list) {
	 
		E max = list[0];
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;   
	}
	
	public static <E extends Comparable<E>> E min(E [] list) {
		 
		E min = list[0];
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;	    
	}
	
	public static void main(String[] args) {
		
		//Integer List
		Integer[] intList = new Integer[5];
		intList[0] = 9;
		intList[1] = 4;
		intList[2] = 15;
		intList[3] = 1;
		intList[4] = 11;
        System.out.println("Integer List Min = " + min(intList));
        
        //String List
        String[] strList = new String[5];
        strList[0] = "cherry";
        strList[1] = "pear";
        strList[2] = "apple";
        strList[3] = "orange";
        strList[4] = "banana";      
        System.out.println("String List Min = " + min(strList));
        
        //Cat Age List
        Double[] catList = new Double[5];
        catList[0] = new Cat("Gary",4).age;
        catList[1] = new Cat("Tom",6).age;
        catList[2] = new Cat("Jerry",9).age;
        catList[3] = new Cat("Sam",2).age;
        catList[4] = new Cat("Onyx",3).age;
        System.out.println("Cat List Age Min = " + min(catList));
        
    }
}
