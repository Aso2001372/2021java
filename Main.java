Skip to content Search or jump to…

Pull requests Issues Marketplace Explore

@Aso2001372 Aso2001372/2021 java 1 00 Code Issues Pull requests Actions Projects Wiki Security Insights 2021 java/Main.java/@Aso2001372 Aso2001372 Add files via upload Latest commit 3 c32120 yesterday History 1 contributor 101 lines(85 sloc)2.93 KB

import java.util.*;

public class Main {
    public static int[][] array = { { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

    public static void main(String[] args) {
        System.out.println("**************");
        System.out.println("   戦艦ゲーム　");
        System.out.println("**************");
        Scanner sc = new Scanner(System.in);
        ship ship1 = new ship();
        ship ship2 = new ship();
        ship ship3 = new ship();
        Random rd = new Random();
        ship1.ship = 1;
        ship1.ship_x = rd.nextInt(5) + 1;
        ship1.ship_y = rd.nextInt(5) + 1;
        array[ship1.ship_y][ship1.ship_x] = ship1.ship;
        ship2.ship = 2;
        ship2.ship_x = rd.nextInt(5) + 1;
        ship2.ship_y = rd.nextInt(5) + 1;
        array[ship2.ship_y][ship2.ship_x] = ship2.ship;
        ship3.ship = 3;
        ship3.ship_x = rd.nextInt(5) + 1;
        ship3.ship_y = rd.nextInt(5) + 1;
        array[ship3.ship_y][ship3.ship_x] = ship3.ship;
        for (int n = 0; n < array.length; n++) {
            for (int m = 0; m < array.length; m++) {
                System.out.print(array[n][m]);
            }
            System.out.print("\n");
        }
        while (!(ship1.flag && ship2.flag && ship3.flag)) {
            System.out.println("爆弾のX座標(1~5)を入力してください");
            int X = sc.nextInt();
            System.out.println("爆弾のY座標(1~5)を入力してください");
            int Y = sc.nextInt();

            attacked(ship1, X, Y);
            attacked(ship2, X, Y);
            attacked(ship3, X, Y);

            if (ship1.count == 0) {
                ship1.flag = true;
                System.out.println("撃沈");
            } else {
                System.out.println("生存");
            }
            if (ship2.count == 0) {
                ship2.flag = true;
                System.out.println("撃沈");
            } else {
                System.out.println("生存");
            }

            if (ship3.count == 0) {
                ship3.flag = true;
                System.out.println("撃沈");
            } else {
                System.out.println("生存");
            }
        }
        sc.close();
        System.out.println("ゲーム終了");

    }

    public static void attacked(ship sp, int X, int Y) {
        if (array[Y][X] == sp.ship) {
            System.out.println("戦艦に当たった");
            sp.count--;
        } else if (array[Y - 1][X] == sp.ship) {
            System.out.println("波たかしくん");
        } else if (array[Y][X - 1] == sp.ship) {
            System.out.println("波たかしくん");
        } else if (array[Y + 1][X] == sp.ship) {
            System.out.println("波たかしくん");
        } else if (array[Y][X + 1] == sp.ship) {
            System.out.println("波たかしくん");
        } else {
            System.out.println("何もない");
        }
    }

}

©2021 GitHub,Inc.Terms Privacy Security Status Docs

Contact GitHub
Pricing
API
Training Blog
About
Loading
complete