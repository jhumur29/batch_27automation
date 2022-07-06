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
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionPractice {
	int [] myArray= {10,20};
	
	String name="jhumu";
	String myString=new String("jhumur");
	StringBuffer MyStringBuffer= new StringBuffer("jhumur");
	StringBuilder myStringBuilder= new StringBuilder("jhumur");
	
	List<Integer> myArrayList = new ArrayList<>();
	List<String> myLinkedList = new LinkedList<>();
	List<Double> myVector = new Vector<>();
	List<Boolean> myStack = new Stack<>();
	
	
	Set<String> MySet =new HashSet<>();
	Set<String> MyLinkedHashSet =new LinkedHashSet<>();
	Set<String> MyTreeSet =new TreeSet<>();
	
	
	Map<String,Integer> myMap =new HashMap<>();
	Map<String,String> myLinkedMap =new LinkedHashMap<>();
	Map<Double,String> myTreeMap =new TreeMap<>();
	Map<String,Boolean> myHashTable =new Hashtable<>();
	Map<String,Integer> myConcurrentHashMap =new ConcurrentHashMap<>();

}
