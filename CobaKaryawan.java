public class CobaKaryawan{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("===jabatan PM===");
	Pm p = new Pm();
	p.setNama("Fitriana");
	p.setAlamat("indramayu");
	p.setGaji(90);
	System.out.println(" ");

	System.out.println("===jabatan Programmer===");
	Program pr = new Program();
	pr.setNama("Lucy");
	p.setAlamat("Lelea");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("===jabatan Desainer===");
	Desain d = new Desain();
	d.setNama("Karan");
	d.setAlamat("Widasari");
	d.setGaji(50);
	}
}