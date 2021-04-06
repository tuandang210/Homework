import java.util.Scanner;

public class Practice7 {
    static Scanner sc = new Scanner(System.in);

    static int size;

    public static void main(String[] args) {

        System.out.print("Nhập số lượng sinh viên: ");
        size = sc.nextInt();
        String[] id = new String[size];
        String[] name = new String[size];
        String[] dateOfBirth = new String[size];
        String[] score = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập id sinh viên " + i + " : ");
            id[i] = sc.next();
            System.out.print("Nhập tên sinh viên " + i + " : ");
            name[i] = sc.next();
            System.out.print("Nhập ngày sinh " + i + " : ");
            dateOfBirth[i] = sc.next();
            System.out.print("Nhập điểm số " + i + " : ");
            score[i] = sc.next();
        }
        display(id, name, dateOfBirth, score);
    }

    public static void display(String[] arr1, String[] arr2, String[] arr3, String[] arr4) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%2s%10s%10s%10s", arr1[i], arr2[i], arr3[i], arr4[i]);
            System.out.println();
        }
    }

    public static String[] addStudent(String[] arr) {
        System.out.print("Nhập số sinh viên muốn thêm: ");
        int count = sc.nextInt();
        String[] newArr = new String[size + 1];

        for (int i = 0; i < count; i++) {
            System.out.print("Nhập dữ liệu: ");
            String data = sc.next();

            int c = 0;
            for (String x : arr) {
                newArr[c] = x;
                c++;
            }
            newArr[size] = data;
        }
        return newArr;
    }

    public static String[] changeStudent(String[] arr1, String[] arr2) {
        System.out.print("Nhập id muốn chỉnh sửa: ");
        String fixId = sc.next();
        int i = 0;
        for (; i < arr1.length; i++) {
            if (fixId.equals(arr1[i])) {
                break;
            }
        }
        System.out.print("Nhập tên muốn sửa: ");
        arr2[i] = sc.next();
        return arr2;
    }

    public static String[] deleteStudent(String[] arr1) {
        System.out.print("Nhập id muốn chỉnh sửa: ");
        String fixId = sc.next();
        int i = 0;
        for (; i < arr1.length; i++) {
            if (fixId.equals(arr1[i])) {
                break;
            }
        }
        String[] newArr1 = new String[size - 1];
        for (int j = 0; j < i; j++) {
            arr1[j] = newArr1[j];
        }
        ;
        for (int j = i; j < size; j++) {
            newArr1[j] = arr1[j + 1];
        }
        return newArr1;
    }

    public static int findMax(String[] arr) {
        int i = 0;
        int max = Integer.parseInt(arr[0]);
        for (; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i]);
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    public static String[] sapXep(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int a = Integer.parseInt(arr[i]);
            int b = Integer.parseInt(arr[i + 1]);
            for (int j = i + 1; j < arr.length; j++) {
                if (a < b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
            }
        }
        return arr;
    }
}
