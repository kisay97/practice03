package prob7;

public class Prob7 {
	public static void main(String[] args) {
		Bird bird01 = new Duck();
		bird01.setName( "꽥꽥이" );
		bird01.fly();
		bird01.sing();
		System.out.println( bird01 );
		
		Sparrow bird02 = new Sparrow();
		bird02.setName( "짹짹이" );
		bird02.fly();
		bird02.sing();
		System.out.println( bird02 );
	}
}

class Bird{
	protected String name;
	protected int legs;
	protected double length;

	public void fly(){
		System.out.println("새(" + name + ")는 날아다닙니다.");
	}
	
	public void sing(){
		System.out.println("새" + name + ")는 소리내어 웁니다.");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String toString(){
		return "새의 이름은 " + name + " 입니다.";
	}
}

class Duck extends Bird{
	public void fly(){
		System.out.println("오리(" + name + ")는 날지 않습니다.");
	}
	
	public void sing(){
		System.out.println("오리" + name + ")는 소리내어 웁니다.");
	}
	
	public String toString(){
		return "오리의 이름은 " + name + " 입니다.";
	}
}

class Sparrow extends Bird{
	public void fly(){
		System.out.println("참새(" + name + ")는 날아다닙니다.");
	}
	
	public void sing(){
		System.out.println("참새" + name + ")는 소리내어 웁니다.");
	}
	
	public String toString(){
		return "참새의 이름은 " + name + " 입니다.";
	}
}