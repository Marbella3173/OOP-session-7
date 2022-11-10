package Tugas;

import java.time.LocalDate;

public class Dosen extends Pegawai {

	int hour;
	String jabatan;
	
	public Dosen(String name, String address, String phone, String email, String office, int salary, LocalDate date,
			int hour, String jabatan) {
		super(name, address, phone, email, office, salary, date);
		this.hour = hour;
		this.jabatan = jabatan;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nHour: " + this.getHour() + "\nJabatan: " + this.getJabatan();
	}
	
}
