package com.company;

import com.sun.istack.internal.NotNull;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        args = new String[]{"ali", "Mohammad"};
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
