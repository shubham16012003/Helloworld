
public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String sc="Shubham";
    String r="Mehta";
       
       System.out.println(sc.length());
       System.out.println(sc.concat(r));
       System.out.println(sc.charAt(4));
       System.out.println(sc.equals(r));
       System.out.println(sc.compareTo(r));
       System.out.println(r.indexOf('h'));
       System.out.println(r.lastIndexOf('M'));
       System.out.println(sc.substring(3));
       System.out.println(sc.toLowerCase());
       System.out.println(sc.replace('h', 'm'));
       
	}

}
