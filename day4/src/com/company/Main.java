
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner inputN = new Scanner(System.in);
        n = inputN.nextInt();

        int l;
        Scanner inputL = new Scanner(System.in);
        l = inputL.nextInt();

        String pass = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                for (char k = 'a'; k < 'a' + l; k++) {
                    for (char m = 'a'; m < 'a' + l; m++) {
                        int maxNum = Math.max(i, j);
                        for (int o = maxNum + 1; o <= n; o++) {
                            System.out.println(String.format("%d%d%c%c%d",i,j,k,m,o));
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
