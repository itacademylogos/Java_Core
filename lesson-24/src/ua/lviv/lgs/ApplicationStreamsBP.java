package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class ApplicationStreamsBP {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] { 2, 54, 13, 68, 34, 23, 17 }));
		List<Integer> collect = list.stream().sorted(reverseOrder()).collect(toList());
		System.out.println(collect);
	}
}
