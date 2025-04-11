package hw8; // done

import java.util.*;

public class TestTrain {
	public static void main(String[] args) {
		Train trains[] = new Train[7];
		trains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		trains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		trains[2] = new Train(118, "自強", "高雄", "台北", 500);
		trains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		trains[4] = new Train(122, "自強", "台中", "花蓮", 600);
		trains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		trains[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		
		showDistinctTrains(trains);
		System.out.println("---------------------------------");
		showSortedTrains(trains);
		System.out.println("---------------------------------");
		showDistinctSortedTrains(trains);
	}
	
	public static void showDistinctTrains(Train[] trains) {
		Set<Train> trainsSet = new HashSet<>();
		for(Train train : trains) {
			trainsSet.add(train);
		}
		System.out.println("不重複的Train:");
		for(Train train : trainsSet) {
			System.out.println(train);
		}
	}
	
	public static void showSortedTrains(Train[] trains) {
		System.out.println("班次大到小排序的Train:");
		Arrays.sort(trains);
		for(int i = trains.length-1; i >= 0; i--) {
			System.out.println(trains[i]);
		}
	}
	
	public static void showDistinctSortedTrains(Train[] trains) {
		Set<Train> trainsTreeSet = new TreeSet<>();
		for(Train train : trains) {
			trainsTreeSet.add(train);
		}
		List<Train> trainsList= new ArrayList<>(trainsTreeSet);
		System.out.println("班次大到小排序且不重複的Train:");
		for(int i = trainsList.size()-1; i >= 0; i--) {
			System.out.println(trainsList.get(i));
		}
	}
}
