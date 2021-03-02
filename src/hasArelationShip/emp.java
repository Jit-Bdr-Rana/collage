package hasArelationShip;

public class emp {
	int id;
	String name;
	address address;
	public emp(int id,String name,address address)
	{
		 this.id=id;
		 this.name=name;
		 this.address=address;
		 
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		
	}
	public static void main(String[] args) {
		address address1=new address("maitidevi","baneshow","nepal");
		address address2=new address("sallaghri","gandaki","nepa;");
		emp e=new emp(111,"jit",address1);
		emp e2=new emp(112,"roshan",address2);
		e.display();
		e2.display();
	}

}
