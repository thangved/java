package buoi2;

public class SDDate {
    public static void main(String[] args) {
        Date D1 = new Date();
        D1.nhap();
        D1.hienThi();

        Date D2 = new Date(27, 9, 2002);
        D2.hienThi();

        D2.ngayHomSau().hienThi();
        D2.congNgay(10).hienThi();
    }
}
