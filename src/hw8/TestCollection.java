package hw8; // done

import java.math.BigInteger;
import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		// 請建立一個Collection物件並將以下資料加入：
		// Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、
		// “Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
		List list = new ArrayList();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add((short)100);
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		// 打印Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// 打印for
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// 打印foreach
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
		// 移除不是java.lang.Number相關的物件
		int i = 0;
		while(i < list.size()) {
			if(!(list.get(i) instanceof Number))
				list.remove(i);
			else
				i++;
		}
		
		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
