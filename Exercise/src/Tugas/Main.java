package Tugas;

import java.time.LocalDate;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
		Persona p =  new Persona("Andi", "Jl. Mangga", "0812111111", "andi@gmail.com");
		Murid m = new Murid("Student Andi", "Jl. Mangga 2", "0852111111", "andi@binus.ac.id", "Junior");
		Pegawai e = new Pegawai("Pegawai Andi", "Jl. Mangga 3", "081311111111", "andi@employee.ac.id", "Binus Staff", 10000000, LocalDate.now());
		Dosen d = new Dosen("Dosen Andi", "Jl. Mangga 4", "08111111111", "andi@dosen.ac.id", "Dosen Calculus", 2000000000, LocalDate.now(), 8, "Rektor");
		Staff s = new Staff("Staff Andi", "Jl. Mangga 5", "087811111111", "andi@staff.ac.id", "Registrasi", 5000000, LocalDate.now());
		
		System.out.println(p);
		System.out.println("");
		System.out.println(m);
		System.out.println("");
		System.out.println(e);
		System.out.println("");
		System.out.println(d);
		System.out.println("");
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main();
		
	}

}
