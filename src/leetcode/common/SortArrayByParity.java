package leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

class gg {
	
}

class ff extends Throwable {
	ff(){
		System.out.println("yyaa");
	}
	
	ff(String message) {
		super(message);
	}
}

class xyz {
	int i = 400;
	void display(Integer i) {
		System.out.println(i);
		System.out.println(this.i);
	}
}

class abc extends xyz{
	int i = 200;
	@Override
	void display(Integer i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}

public class SortArrayByParity extends abc{
	int i = 100;
	void display(Integer i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	
	
	public static int[] sortArrayByParity(int[] nums) {
        int p = nums.length;
        int n = 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                arr[n++] = nums[i];
            } else {
                arr[--p] = nums[i];
            }
        }
        return arr;
    }
	static String ab = "";
	
	static void as(String a, Integer b) {
		System.out.println(a);
	}
	
	static void as(Integer b, String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		try {
			int a = 1/0;
			System.out.println(a);
		} finally {
			System.out.println("1b");
		}
		
		Integer d = 100/0;
		
		System.out.println(d);
		
		final List<String> aab = new ArrayList<>();
		List<String> bc = new ArrayList<>();
		
		SortArrayByParity sb = new SortArrayByParity();
		
		sb.display(40);
		System.out.println(Arrays.toString(sortArrayByParity(new int[] {1,3,2,4})));
		String ab = "";
		
		
		List<String> ss = new ArrayList<>();
		ss.add("b");
		ss.add("c");
		Iterator<String> itr = ss.iterator();
		ListIterator<String> li = ss.listIterator();
		Spliterator<String> spli = ss.spliterator();
		li.add("a");
		li.add("d");
		System.out.println(ss);
		li = ss.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		try {
			ff ff = new ff();
			throw ff;
		} catch (ff e) {
			e.printStackTrace();
		}
		
		
	}

}
