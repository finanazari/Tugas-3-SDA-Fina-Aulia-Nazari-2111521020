import java.util.LinkedList;

public class tugas3
{
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        nama_mahasiswa.add("Fina Aulia Nazari");
        no_bp.add("2111521020");
        alamat.add("Padang");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menambahkan Data Mahasiswa : ");
        //menambahkan data mahasiswa
        nama_mahasiswa.addFirst("Aidha Safitri");
        nama_mahasiswa.add("Nurul Alawiah");
        nama_mahasiswa.add("Fitria Ruwaida");
        nama_mahasiswa.addLast("Citra Larasati");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        no_bp.addFirst("2111522010");
        no_bp.add("2111523018");
        no_bp.add("2111523005");
        no_bp.addLast("2111521027");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        alamat.addFirst("Sijunjung");
        alamat.add("Yogyakarta");
        alamat.add("Pekanbaru");
        alamat.addLast("Solo");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menghapus Data Mahasiswa : ");
        //menghapus data mahasiswa
        nama_mahasiswa.removeFirst();
        nama_mahasiswa.remove();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        no_bp.removeFirst();
        no_bp.remove();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        alamat.removeFirst();
        alamat.remove();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menyisipkan Data Mahasiswa : ");
        //menyisipkan data mahasiswa
        nama_mahasiswa.set(0,"Jessica Nasution");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        no_bp.set(0,"2111523014");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        alamat.set(0,"Batam");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Mencari Data Mahasiswa : ");
        //mencari data mahasiswa
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.get(1));
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast());
        System.out.println("");

        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.get(1));
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast());
        System.out.println("");

        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.get(1));
        System.out.println("Alamat Mahasiswa : " +alamat.getLast());
        System.out.println("");

        System.out.println("Output pop Data Mahasiswa : ");         
        //mengeluarkan daftar pertama data mahasiswa         
        no_bp.pop();         
        nama_mahasiswa.pop();         
        alamat.pop();         
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);         
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);         
        System.out.println("Alamat Mahasiswa : " +alamat);         
        System.out.println("");

        System.out.println("Output push Data Mahasiswa : ");         
        //menambahkan daftar pertama data mahasiswa         
        nama_mahasiswa.push("Alya Risdi");         
        no_bp.push("2111521042");         
        alamat.push("Malang");         
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);         
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);         
        System.out.println("Alamat Mahasiswa : " +alamat);         
        System.out.println("");

        System.out.println("Output set Data Mahasiswa : ");         
        //menyisipkan data mahasiswa         
        no_bp.set(1,"2111522020");         
        nama_mahasiswa.set(1,"Annisa Innayah");         
        alamat.set(1,"Palembang");         
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);         
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);         
        System.out.println("Alamat Mahasiswa : " +alamat);         
        System.out.println(""); 

        System.out.println("Output isEmpty Data Mahasiswa : ");         
        //megecek apakah ada data mahasiswa yang kosong
        System.out.println("Apakah data nama kosong? "+nama_mahasiswa.isEmpty());
        no_bp.clear();
        System.out.println("Apakah data Nomor Induk Mahasiswa kosong? "+no_bp.isEmpty());
        System.out.println("Apakah data alamat kososng? "+alamat.isEmpty());
        System.out.println(""); 
    }
}