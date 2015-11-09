import java.io.* ;

class ReverserVersion1
{
  public static float Median(int[] array) {
	
	  if (array.length % 2 == 0) {
		  float median = (float) ((array[array.length/2] + array[(array.length/2)-1]) / 2.0);
		  return median;
	  } else {
		  float median = (array[array.length]/2);
	  }
	  return 0;
	  
  }
  public static void main(String[] args) 
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    // reverse the data
    for ( int i = 0, c = data.length - 1; i < data.length; i++, c--)
    {
    	float middle = (float) Median(data);
    	int first = data[i];
    	int last = data[c];
    	
    	
    	if (i < middle){
    		data[c] = data[i];
    		last = first;
    	} 
    	
    }
      
    // write out the new data
    for ( int j=0; j < data.length; j++)
    {
    	System.out.print(data[j] + " ");
    }

  }
} 
