package InterviewPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class JavaCollectionPractice { 
	List<String> myList=new ArrayList<>();
	List<String> myList2=new LinkedList<>();
	List<String> myList3=new Vector<>();
	
	
	Set<Integer> mySet= new HashSet<>();
	Set<Integer> mySet2= new LinkedHashSet<>();
	Set<Integer> mySet3= new TreeSet<>();
	
	Map<Double,String> myMap=new HashMap<>();
	Map<Double,String> myMap2=new LinkedHashMap<>();
	Map<Double,String> myMap3=new TreeMap<>();
	Map<Double, String> myMap4=new Hashtable<>();
	Map<Double,String> myMap5=new ConcurrentHashMap<>();

}
