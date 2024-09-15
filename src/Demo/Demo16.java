package Demo;

public class Demo16 {

	public static void main(String[] args) {
		String a="selenium";
		String b="selenium";
		System.out.println(a.length());//8
		System.out.println(a.toUpperCase());//SELENIUM
		System.out.println(a.toLowerCase());//selenium
		System.out.println(a.startsWith("sel"));//true
		System.out.println(a.endsWith("um"));//true
		System.out.println(a.contains("ni"));//true
		System.out.println(a.equals(b));//true
		System.out.println(a.equalsIgnoreCase(b));//true
		System.out.println(a==b);//true
		System.out.println(a.concat(b));//seleniumselenium
		System.out.println(a+b);//seleniumselenium
		System.out.println(a.charAt(5));//i
		System.out.println(a.trim());//selenium
		System.out.println(a.replace("sel", "cucumber"));//cucumberenium
		System.out.println(a.replaceAll("cucumber", "sel"));//selenium
		System.out.println(a.substring(5));//ium
		System.out.println(a.substring(0,5));//selen
		System.out.println(a.replace("\\s+", " "));//selenium
		System.out.println(a.indexOf('e'));//1
		System.out.println(a.lastIndexOf('e'));//3
		System.out.println(String.valueOf(100.34f));//100.34
		
	
	}

}