import java.util.*;
class hewan{
    void detail(String warna){
        System.out.println("Anda ingin hewan yang berwarna"+ warna);
    }

}
class carajalan extends hewan{
    void detail(String jalan){
        System.out.println("n\Anda ingin hewan yang cara berjalannya menggunakan"+ jalan);
    }
}
class hidup extends hewan{

    void detail(String hidupp){
        System.out.println("\nAnda ingin hewan yang hidup di "+ hidupp);

    }
}

public class poly{

public static void main(String[] args) {
    hewan hasil;
    hasil = new hewan();
    hasil.detail("abu-abu");
    hasil = new carajalan();
    hasil.detail("kaki");
    hasil = new hidup();
    hasil.detail("daratan");

    }
}
