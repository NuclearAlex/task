import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        String[][] field = new String[x][y];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                String a = "* ";
                field[i][j] = a;
            }
        }
        System.out.println("Initial field");
        field[2][3] = "0 ";
        for (String[] s : field) {
            for (String str : s) {
                System.out.print(str);
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        for (int k = 0; k < field.length; k++) {
            for (int z = 0; z < field[k].length; z++) {
                String s = sc.nextLine();
                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field[i].length; j++) {
                        if (s.equalsIgnoreCase("w")) {
                            try {
                                if (field[i][j] == "0 ") {
                                    String temp = "* ";
                                    field[i - 1][j] = field[i][j];
                                    field[i][j] = temp;
                                    System.out.println("You are moving to one cell up");
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("You are going bounds, don't press \"w\" until press \"s\". Press \"exit\" for exit");
                            }
                        }
                        if (s.equalsIgnoreCase("s")) {
                            try {
                                if (field[i][j] == "0 ") {
                                    String temp = "* ";
                                    field[i + 1][j] = field[i][j];
                                    field[i][j] = temp;
                                    i++;
                                    System.out.println("You are moving to one cell down");
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("You are going bounds, don't press \"s\" until press \"w\". Press \"exit\" for exit");
                            }
                        }
                        if (s.equalsIgnoreCase("a")) {
                            try {
                                if (field[i][j] == "0 ") {
                                    String temp = "* ";
                                    field[i][j - 1] = field[i][j];
                                    field[i][j] = temp;
                                    System.out.println("You are moving to one cell left");
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("You are going bounds, don't press \"a\" until press \"d\". Press \"exit\" for exit");
                            }
                        }
                        if (s.equalsIgnoreCase("d")) {
                            try {
                                if (field[i][j] == "0 ") {
                                    String temp = "* ";
                                    field[i][j + 1] = field[i][j];
                                    field[i][j] = temp;
                                    j++;
                                    System.out.println("You are moving to one cell right");
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("You are going bounds, don't press \"d\" until press \"a\". Press \"exit\" for exit");
                            }
                        }
                        if (s.equalsIgnoreCase("exit")) {
                            return;
                        }
                    }
                }
                System.out.println("-----------------------");
                for (String[] q : field) {
                    for (String str : q) {
                        System.out.print(str);
                    }
                    System.out.println();
                }
            }
        }
    }
}
