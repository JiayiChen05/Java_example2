package Generics_and_reflection;
//在编译阶段检查类型
//用一个类型概括所有类型，不同数据类型使用相同代码
//可以替换手动转换的步骤，提高代码可读性

class Box<T>{
	private T value;
	public void setter(T value) {
		this.value = value;
	}
	public T getter() {
		return this.value;
	}
	
}
class Utils{
	public static <T> void printArray(T[] input_array) {
		//for (int i=0;i<input_array.length;i++) 
		for(T item : input_array) {
			System.out.println(item);
		}
	}

}

public class Generics {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.setter("abc");
		System.out.println(box1.getter());
		
		Box<Integer> box2 = new Box<>();
		box2.setter(2);
		System.out.println(box2.getter());
		
		String[] word = {"abc", "df"};
		Integer[] num = {1, 2, 3};
		Utils.printArray(word);
		Utils.printArray(num);
		
	}
}
