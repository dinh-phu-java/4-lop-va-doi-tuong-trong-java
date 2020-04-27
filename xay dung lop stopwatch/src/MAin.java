import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StopWatch myWatch= new StopWatch();

        System.out.print("nhập vào chiều dài của mảng :");
        int length= in.nextInt();
        int[] myArr=generateArray(length);

        myWatch.start();
        int[] sortArray=selectionSort(myArr);
        myWatch.stop();
        int ellapseTime= myWatch.getElapseTime();
        System.out.println("thời gian để sắp xếp mảng với thuật toán section sort là: "+ellapseTime+" miliseconds");
        System.out.println(Arrays.toString(sortArray));

    }
    public static int[] selectionSort(int[] myArr){
        int max=myArr[0];
        for (int i =0; i<myArr.length;i++){
            for (int j=i+1; j<myArr.length;j++){
                if(myArr[i] > myArr[j]){
                    int temp = myArr[i];
                    myArr[i]=myArr[j];
                    myArr[j]=temp;
                }
            }
        }
        return myArr;
    }

    public static int[] generateArray(int length){
        int[] myArr=new int[length];
        for (int i=0;i < length;i++){
            myArr[i]=(int)Math.floor(Math.random()*10000);
        }
        return myArr;
    }
    public static int findMin(int i,int[] myArr){
        int min=myArr[i];
        int minIndex=0;
        for(;i<myArr.length;i++){
            for (int j=i+1; j<myArr.length-1;j++){
                if(myArr[j] < min){
                    minIndex=j;
                }
            }
        }
        return minIndex;
    }
}
