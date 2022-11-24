package lab7;
import java.util.Arrays;
import java.util.List;
	  
	class maxmin{
	  
	    public static void main(String[] args)
	    {
	        List<Integer> stud= Arrays.asList(123,45,22,79,13,88);

	        Integer I = stud.stream().min(Integer::compare).get();
	        Integer J = stud.stream().max(Integer::compare).get();
	    	   System.out.println(I);
	           System.out.println(J);
	       
	    }
	}

