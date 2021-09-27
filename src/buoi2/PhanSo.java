package buoi2;

import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo(PhanSo a) {
        tu = a.tu;
        mau = a.mau;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        do {
            tu = scanner.nextInt();
            mau = scanner.nextInt();
        } while (mau == 0);

        scanner.close();
    }

    public void hienThi() {
        if (tu * mau < 0) {
            System.out.format("-%d / %d\n", Math.abs(tu), Math.abs(mau));
        } else {
            System.out.format("%d / %d\n", Math.abs(tu), Math.abs(mau));
        }
    }

    public void nghichDao() {
        if (tu == 0)
            return;

        int temp = tu;
        tu = mau;
        mau = temp;
    }

    public PhanSo giaTriNghichDao() {
        if (tu == 0)
            return new PhanSo();
        return new PhanSo(mau, tu);
    }

    public float giaTriThuc() {
        return (float) tu / (float) mau;
    }

    public boolean lonHon(PhanSo a) {
        return giaTriThuc() > a.giaTriThuc();
    }

    public PhanSo cong(PhanSo a) {
        return new PhanSo(tu * a.mau + a.tu * mau, mau * a.mau);
    }

    public PhanSo tru(PhanSo a) {
        return new PhanSo(tu * a.mau - a.tu * mau, mau * a.mau);
    }

    public PhanSo nhan(PhanSo a) {
        return new PhanSo(tu * a.tu, mau * a.mau);
    }

    public PhanSo chia(PhanSo a) {
        return new PhanSo(tu * a.mau, mau * a.tu);
    }
}
