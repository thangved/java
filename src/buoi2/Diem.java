package buoi2;

import java.util.Scanner;

public class Diem {
    private int x;
    private int y;

    public Diem() {
        x = 0;
        y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();
    }

    public void hienThi() {
        System.out.format("(%d, %d)\n", x, y);
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int giaTriX() {
        return x;
    }

    public int giaTriY() {
        return y;
    }

    public float khoangCach() {
        return khoangCach(new Diem(0, 0));
    }

    public float khoangCach(Diem d) {
        return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
    }

}
