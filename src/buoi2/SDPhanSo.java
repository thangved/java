package buoi2;

import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        a.hienThi();
        b.hienThi();

        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        x.nhap();
        y.nhap();

        x.giaTriNghichDao().hienThi();

        x.cong(y).hienThi();

        System.out.println("Nhap danh sach phan so:");

        int n = scanner.nextInt();

        PhanSo[] phanSos = new PhanSo[n];
        PhanSo tong = new PhanSo(0, 1);
        PhanSo lonNhat = new PhanSo(Integer.MIN_VALUE, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            phanSos[i] = new PhanSo();
            phanSos[i].nhap();
            tong = tong.cong(phanSos[i]);
            lonNhat = lonNhat.lonHon(phanSos[i]) ? lonNhat : phanSos[i];
        }

        System.out.println("Tong: ");
        tong.hienThi();
        System.out.println("Lon nhat: ");
        lonNhat.hienThi();

        System.out.println("Sap xep: ");
        sort(phanSos);

        for(PhanSo phanSo: phanSos)
            phanSo.hienThi();

        scanner.close();
    }

    public static void sort(PhanSo[] phanSos) {
        for (int i = 0; i < phanSos.length; i++)
            for (int j = i + 1; j < phanSos.length; j++)
                if (phanSos[i].lonHon(phanSos[j])) {
                    PhanSo temp = new PhanSo(phanSos[i]);
                    phanSos[i] = new PhanSo(phanSos[j]);
                    phanSos[j] = new PhanSo(temp);
                }
    }
}
