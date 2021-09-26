package buoi2;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public Date() {
        ngay = 1;
        thang = 1;
        nam = 2000;
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void hienThi() {
        System.out.format("%02d/%02d%02d\n", ngay, thang, nam);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        Date date;

        do {
            date = new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (!date.hopLe());

        scanner.close();
    }

    public boolean hopLe() {
        // 1 2 3 4 5 6 7 8 9 10 11 12
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
            days[2] = 29;

        if (ngay > days[thang] || ngay <= 0)
            return false;
        return true;
    }

    public Date ngayHomSau() {
        int ngay = this.ngay + 1, thang = this.thang, nam = this.nam;

        Date date = new Date(ngay, thang, nam);

        if (!date.hopLe()) {
            date.ngay = 1;
            date.thang++;
        }

        if (!date.hopLe()) {
            date.thang = 1;
            date.nam++;
        }

        return date;
    }

    public Date congNgay(int n) {
        Date date = new Date(ngay, thang, nam);

        for (int i = 0; i < n; i++)
            date = date.ngayHomSau();

        return date;
    }
}
