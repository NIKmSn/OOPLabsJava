import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {
    public static void mergeSort(Student[] students, int n)
    {
        if (n < 2){
            return;
        }
        int mid = n / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = students[i];
        }

        for (int i = mid; i < n; i++){
            right[i - mid] = students[i];
        }

        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(students, left, right, mid, n-mid);
    }

    public static void merge(Student[] students, Student[] left, Student[] right, int leftLength, int rightLength) {

        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i].getId() <= right[j].getId()) {
                students[k++] = left[i++];
            }
            else {
                students[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            students[k++] = left[i++];
        }
        while (j < rightLength) {
            students[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Student[] students1 = new Student[10];
        Student[] students2 = new Student[10];
        for (int i = 0; i < 10; i++) {
            students1[i] = new Student(new Random().nextInt(100));
            students2[i] = new Student(new Random().nextInt(100));
        }
        System.out.print("Students1: ");
        for (Student student : students1) {
            System.out.print(student.toString());
        }
        System.out.println();
        System.out.print("Students2: ");
        for (Student student : students2) {
            System.out.print(student.toString());
        }
        System.out.println();

        mergeSort(students1, students1.length);
        mergeSort(students2, students2.length);
        Student[] students = new Student[20];
        merge(students, students1,students2, students1.length, students2.length);
        System.out.println("Sorted: ");
        for (Student student : students) {
            System.out.print(student.toString());
        }
        System.out.println();
    }
}
