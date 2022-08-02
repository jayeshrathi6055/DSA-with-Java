public class pattern_questions {
    static void printRectange(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void hollowRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < column; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 0; j < column; j++) {
                    if (j == 0 || j == column - 1) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void halfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void halfPyramidWithNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void halfPyramidRotate(int num) {
        for (int i = 1; i <= num; i++) {
            int l = num - i;
            for (int j = 0; j < num; j++) {
                if (l == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                    l--;
                }
            }
            System.out.println();
        }
    }

    static void reverseHalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void floydsTriangle(int num) {
        int k = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    static void zeroOneTriangle(int num) {
        int k;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                k = 0;
            } else {
                k = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                if (k == 1) {
                    k = 0;
                } else {
                    k = 1;
                }
            }
            System.out.println();
        }
    }

    static void butterflyPattern(int num) {
        int k, l, n;
        for (int i = 0; i < num + num; i++) {
            k = i + 1;
            l = num - (i + 1);
            n = i-num;
            n = n+n;
            if (i < num) {
                for (int j = 0; j < num; j++) {
                    if (k == 0) {
                        System.out.print(" ");
                    } else {
                        k--;
                        System.out.print("*");
                    }
                }
                for (int m = 0; m < num; m++) {
                    if (l == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                        l--;
                    }
                }
                System.out.println();
            } else {
                for (int j = i-num; j < num; j++) {
                    System.out.print("*");
                }
                for(int j = 0;j<n;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<(num+num-i);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    static void rhombus(int num){
        int space;
        for(int i = 1;i<=num;i++){
            space = num-i;
            for(int j = 0;j<space;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pyramidNumbers(int num){
        int space,count =1;
        for(int i = 1;i<=num;i++){
            space = (num-i);
            for(int j = 0;j<space;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){
                System.out.print(count);
                System.out.print(" ");
            }
            count++;
            System.out.println();
        }
    }

    static void palindronePattern(int num){
        int count,spaces,k;
        for(int i = 0;i<num;i++){
            k = 2;
            count = i+1;
            spaces = num-i+1;
            for(int j = 0;j<spaces;j++){
                System.out.print(" ");
            }
            while(count>0){
                System.out.print(count);
                count--;
            }
            count = 1;
            while(count<i+1){
                System.out.print(k);
                k++;
                count++;
            }
            System.out.println();
        }
    }

    static void diamondPattern(int num){
        for(int i = 0;i<num*2;i++){
            if(i<num){
                for(int j = 0;j<num-(i+1);j++){
                    System.out.print(" ");
                }
                for(int j = num-(i+1);j<num;j++){
                    System.out.print("*");
                }
                for(int j = num-(i+1);j<num-1;j++){
                    System.out.print("*");
                }
            }else{
                for(int j= 0;j<(i-num);j++){
                    System.out.print(" ");
                }
                for(int j = (i-num);j<num;j++){
                    System.out.print("*");
                }
                for(int j = (i-num);j<num-1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printRectange(4, 5);
        // hollowRectangle(4, 50);
        // halfPyramid(6);
        // reverseHalfPyramid(6);
        // halfPyramidRotate(6);
        // halfPyramidWithNumbers(5);
        // floydsTriangle(5);
        // zeroOneTriangle(5);
        // butterflyPattern(6);
        // rhombus(4);
        // pyramidNumbers(5);
        // palindronePattern(4);
        // diamondPattern(3);
    }
}