package Week4CodingProject;

import java.lang.reflect.Array;
import java.security.spec.NamedParameterSpec;

public class CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// task 1
		// first we create an array called 'AGES' and give it values
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// then take the last value and subtract the first value from it
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		// then we create a new array called 'AGES2' and give it a length of 9
		int[] ages2 = new int[9];
		// here we will take the last value and subtract the first value from it again
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(result2);
		// here we set an int called 'SUM' with a starting value of 0
		int sum = 0;
		// we declare an int called 'AGE' and get each 'age' from the 'AGES' array
		for (int age : ages) {
		// then we take the sum of 0 and add each 'age' to it
			sum += age;
		}
		// we create an array of double and name it 'AVERAGE'
		// we give 'AVERAGE' the value of SUM divided by the number of values in AGES
		double average = (double)sum / ages.length;
		System.out.println(average);
		
		// task 2
		// create an array of string called 'NAMES'
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// create a 0-value int to use as a placeholder
		int totalLetters = 0;
		// we gather each 'name' from the 'NAMES' array
		for (String name : names) {
		// then we add to 'totalLetters' the length or size of each 'name'
		totalLetters += name.length();
		// create a double and set it to totalLetters divided by the number of
		// letters there are in each 'name'
		double nameAverage = (double)totalLetters / names.length;
		System.out.println(nameAverage);
		}
		 // we create an empty string called
		String finalNames = "";
		// using a loop, we set i to hold value of 0 but less than the
		// size of 'NAMES'
		for (int i = 0; i <= names.length; i++) {
		}
		// give 'finalNames' the element indexed in 'names'
		finalNames += names[0] + ", " + names[1] + ", " + names[2] + ", " + names[3] + ", " + names[4] + ", " + names[5];
		System.out.println(finalNames);
		
		// task 3
		// to access the last element of any array, take the length and minus 1 from it
		// array[array.length - 1]
		// int lastElement = array.[array.length - 1];
		
		// task 4
		// to access first element of an array, get the value of 0, which is always first
		// array[0]
		// int firstElement = array[0]
		
		// task 5
		// create an array called nameLength
		// then we set it the size the same as of 'names' array
		int[] nameLengths = new int[names.length];
		// use for loop to initialize i as 0, set it less than the size of 'names'
		for (int i = 0; i < names.length; i++) {
		// each name's character count will be calculated by length()
		nameLengths[i] = names[i].length();
		}
		
		// task 6
		// we set an int to be a placeholder for the result
		int sumNameLengths = 0;
		// then we retrieve each length stored in nameLengths
        for (int length : nameLengths) {
        // we set sumNameLength to receive the length of each name
        // in each iteration
            sumNameLengths += length;
        }
        System.out.println(sumNameLengths);
	}
		
		// task 7
        public static String concWord (String word, int n) {
            String longString  = " ";
            for (int x = 0; x < n; x++) {
            	longString += word;   
            }
                return longString;
        }

        // task 8
        // create array with values called firstName and lastName
        public static String wholeName(String firstName, String lastName) {
        // set a string variable that concatenates the two elements
        // separated by a space
        	String fullName = firstName + " " + lastName;
        // method should return a string
        	return fullName;
        }

        //  task 9
        // write a boolean method, name it, and give it values of an unknown
        // int array
        // {int[] array) means the method expects an array of integers as argument
        public static boolean isGreaterThanHundred(int[] array) {
        //create a variable with value of 0
        int emptyNumbers = 0;
        // set a for loop with i at 0 but less than the size/number of numbers
        // in the array
        for (int i = 0; i < array.length; i++) {
        // set emptyNumbers to receive each number from the int array
        	emptyNumbers += array[i];
        	}
        // create if/else statement
        if (emptyNumbers > 100) {
    		return true;
    		} else {    			
    		} return false;
        }
        
        // task 10
        public static double newDouble(double[] array) {
        	double emptyDouble = 0;
        	for (int i = 0; i < array.length; i++) {
        	emptyDouble += array[i];
        	}
        	double doubleResult = emptyDouble / array.length;
			return doubleResult;
        }
        // task 11
        public static boolean comparedAverage(double[] array1, double[] array2) {
        	double firstSet = 0;
        	double secondSet = 0;
        	for (int a = 0; a < array1.length; a++) {
        		for (int b = 0; b < array2.length; b++) {
        			firstSet += array1[a];
        			secondSet += array2[b];
        		}
        	}
        	double firstAverage = firstSet / array1.length;
        	double secondAverage = secondSet / array2.length;
        	if (firstAverage > secondAverage) {
        		return true;
        	} else {
        		return false;
        	}
        }
        
        // task 12
        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        	if (isHotOutside == true && (moneyInPocket > 10.50)) {
        	return true;
        	} else {
        	return false;
        	}
        }
        
        // task 13
        public static boolean shouldISaveMoney(int moneySpent) {
        	if (moneySpent > 250) {
        		return true;
        	} else {
        		return false;
        	}
        }



        
        
        
        
        
        
}
        
        
        
        
        
        
        
        
        

