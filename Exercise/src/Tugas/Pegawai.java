package Tugas;

import java.time.LocalDate;

public class Pegawai extends Persona {

	String office;
	int salary;
	LocalDate date;
	
	public Pegawai(String name, String address, String phone, String email, String office, int salary, LocalDate date) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nOffice: "+ this.getOffice() + "\nSalary: " + this.getSalary() + "\nDate: " + this.getDate();
	}
	
}
