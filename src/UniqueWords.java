/*Project: Lab2
 * Class: UniqueWords.java
 * Author: Lior Polischouk
 * Date: 9/29/2024
 * Our task was to finish the countUnique method to return the count of unique Strings in an ArrayList
 */

import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  boolean unique = true;
	  
      for (int i = 0; i < list.size(); i++)
      {		 for (int j = 0; j < list.size(); j++)
		 {
			if (list.get(i).equals(list.get(j))) { // if element i is equal to any element of the array, unique = false
				unique = false;
				break;
			}
		 }
	      if (unique) { // if unique is still true, that means element i was not equal to any other element, and count increases by 1
	    	  count++;
	      }
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
