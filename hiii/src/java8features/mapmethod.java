package java8features;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapmethod {
	public static <K, V> Stream<Map.Entry<K, V> > 
    convertMapToStream(Map<K, V> map) 
    { 
  
        // Return the obtained Stream 
        return map 
  
            // Convert the Map to Set 
            .entrySet() 
  
            // Convert the Set to Stream 
            .stream(); 
    } 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Mapusingkeys> hm = new HashMap<Integer, Mapusingkeys>(); 
		//int cid, String name, int pswd, String city, double price
	Encoder enc=Base64.getEncoder();
		 
	hm.put(1,new Mapusingkeys(10,"Poornima",enc.encodeToString("1234".getBytes()),"Guntur",10000)); 
	     hm.put(2,new Mapusingkeys(20, "vai",enc.encodeToString("5647".getBytes()),"bnglore",20000)); 
	     hm.put( 3,new Mapusingkeys (30, "bhavi",enc.encodeToString("1234".getBytes()),"chennai",30000)); 
	     hm.put( 4,new Mapusingkeys(40, "anu",enc.encodeToString("1234".getBytes()),"hyd",40000)); 
	     hm.put(5,new Mapusingkeys(50, "tanu",enc.encodeToString("1234".getBytes()),"goa",50000));
	     hm.put(6,new Mapusingkeys(60, "manu",enc.encodeToString("1234".getBytes()),"noida",70000));
	     hm.put( 7,new Mapusingkeys(80, "abhi",enc.encodeToString("1234".getBytes()),"vij",80000));
         hm.put(9,new Mapusingkeys (70, "rina",enc.encodeToString("1234".getBytes()),"manglore",90000));
         hm.put(10,new Mapusingkeys (90, "Poornima",enc.encodeToString("1234".getBytes()),"jeypore",100000));
         hm.put(11,new Mapusingkeys (100, "indu",enc.encodeToString("1234".getBytes()),"mp",200000));
         hm.put(12,new Mapusingkeys (12, "sindu",enc.encodeToString("1234".getBytes()),"mh",30000));
         hm.put(13,new Mapusingkeys (13, "chandu",enc.encodeToString("1234".getBytes()),"tirupati",11000));
         hm.put(14,new Mapusingkeys (14, "vandana",enc.encodeToString("1234".getBytes()),"odisha",120000));
         hm.put(15,new Mapusingkeys (15, "vamsi",enc.encodeToString("1234".getBytes()),"jabalpur",13000));
         hm.put(16,new Mapusingkeys (16, "sasi",enc.encodeToString("1234".getBytes()),"ooty",14000));
         hm.put(17,new Mapusingkeys (17, "rupa",enc.encodeToString("1234".getBytes()),"mussorie",15000));
         hm.put(18,new Mapusingkeys (15, "prakash",enc.encodeToString("1234".getBytes()),"tamilnadu",16000));
         hm.put(19,new Mapusingkeys (1999, "ishwarya",enc.encodeToString("1234".getBytes()),"vizag",17000));
         hm.put(20,new Mapusingkeys (45, "komali",enc.encodeToString("1234".getBytes()),"coimbatore",18000));
         
        // Map.Entry<Integer,Mapusingkeys>s=hm.entrySet().stream().max()
         
         
         //Map<Integer,Mapusingkeys>m=hm.entrySet().stream().min(c1,c2)->c1.price<c2.price?-1:1).get();
        // Stream.iterate(1, e->e+1).filter(e->e%2==0).limit(5).forEach(System.out::println);
         //Mapusingkeys m=hm.stream().max((c1,c2)->c1.price>c2.price?-1:1).get();
        
         long c=hm.entrySet().stream().filter(s->s.getValue().city.equalsIgnoreCase("mh")).count();
         System.out.println(c);
         
         //max min 
         Entry<Integer,Mapusingkeys>max=hm.entrySet().stream().max((s1,s2)->s1.getValue().price<s2.getValue().price?-1:1).get();
        System.out.println(max);
        
        
        Entry<Integer,Mapusingkeys>min=hm.entrySet().stream().min((s1,s2)->s1.getValue().price<s2.getValue().price?-1:1).get();
        System.out.println(min);
        
        
        
        System.out.println("encoded "+enc);
        //Decoder basicDecoder=Base64.getDecoder();
       // System.out.println("decoded :"+new String (basicDecoder.decode()));
        
        
}
}        
        
        


