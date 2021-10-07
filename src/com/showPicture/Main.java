package com.showPicture;

public class Main {
    public static void main(String[] args) {
        for(int i = 0;i < 3;i++){
            System.out.println();
            for(int j = 0;j < 7;j++){
                System.out.print("*");
            }
        }
        for(int i = 0;i < 6;i++){
            System.out.println();
            for(int j = 0;j < i;j++){
                System.out.print("*");
            }
        }
        for(int i = 5;i >= 1;i--){
            System.out.println();
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
        }
    }
}
