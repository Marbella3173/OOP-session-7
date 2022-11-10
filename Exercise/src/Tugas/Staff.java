package Tugas;

import java.time.LocalDate;

public class Staff extends Pegawai {

	public Staff(String name, String address, String phone, String email, String office, int salary, LocalDate date) {
		super(name, address, phone, email, office, salary, date);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
