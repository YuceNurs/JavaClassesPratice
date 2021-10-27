package MaasHesap;

public class Employee {
  String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public double tax() {
		if(this.salary < 1000) {
			return this.salary;
		}
		else {
			return (this.salary*1.03)-this.salary;
		}
		
	}
	public double bonus() {
		if(this.workHours>40) {
			return (this.workHours-40)*30;
		}
		else {
			return 0;
		}
	}
	
	public double raiseSalary() {
		if(2021-this.hireYear<10) {
			return this.salary*1.05;
		}
		else if(2021-this.hireYear>10 && 2021-this.hireYear<20) {
			return this.salary*1.1;
		}
		else {
			return this.salary*1.15;
		}
	}
	public void print() {
		System.out.println("Ad : " + this.name);
		System.out.println("Maas : " + this.salary);
		System.out.println("Calisma Saati : " + this.workHours);
		System.out.println("Baslangic Yil : " + this.hireYear);
		System.out.println("Vergi : "+ tax() );
		System.out.println("Bonus : " + bonus());
		System.out.println("Maas Artisi : " + (raiseSalary()+bonus()));
		System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (raiseSalary()+bonus()-tax()));
	}

}
