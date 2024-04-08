//package OS;

import java.util.Arrays;

public class FCFS {
    static void fcfs(int[] arrival, int[] burst) {
        int ps  =  arrival.length;
    int[] pid =  new int[ps];
    for (int i = 0; i < ps; i++) {
        pid[i] = i+1;
        }
//        for (int i = 0; i < ps-1; i++) {
//            if (arrival[i]>arrival[i+1]){
//                swap(arrival,i,i+1);
//                swap(burst,i,i+1);
//                swap(pid,i,i+1);
//            } else if (arrival[i]==arrival[i+1] && pid[i] > pid[i+1]) {
//                    swap(arrival,i,i+1);
//                    swap(burst,i,i+1);
//                    swap(pid,i,i+1);
//
//            }
//        }
        for (int i = 0; i < ps/2 ; i++) {
            loop(ps,arrival ,burst ,pid );
        }

//        int j = 0;
//        while (arrival[j]<arrival[j+1] |(arrival[j]!=arrival[j+1] && pid[j] < pid[j+1]) ){
//            if(j == ps-2){j=0;}
//            else{
//                swap(arrival,j,j+1);
//                swap(burst,j,j+1);
//                swap(pid,j,j+1);
//            j++;}
//        }


        System.out.println("PID"+"  "+" AT"+"  "+"BT"+"  "+"CT"+"  "+"TAT"+"  "+"WT");
        int ct = 0 ;
        int[] tat = new int[ps];
        int[] wt = new int[ps];
        for (int i = 0; i < ps; i++) {
            int sum  =burst[i];
            for (int j = 0; j < i; j++) {
                sum += burst[j];
            }
            ct = sum;
            tat[i] = ct - arrival[i];
            wt[i] = ct - burst[i];
            System.out.println(pid[i]+"    "+arrival[i]+"    "+burst[i]+"    "+ct+"    "+tat[i]+"    "+wt[i]);
        }
        System.out.println("Average Completion Time: "+ct/ps+"\n"+"Average Turn Around Time: "+average(tat)+"\n"+"Average Waiting Time: "+average(wt));
    }
    static  void loop(int ps, int[] arrival ,int[] burst ,int[] pid ){
        for (int i = 0; i < ps-1; i++) {
            if (arrival[i]>arrival[i+1]){
                swap(arrival,i,i+1);
                swap(burst,i,i+1);
                swap(pid,i,i+1);
            } else if (arrival[i]==arrival[i+1] && pid[i] > pid[i+1]) {
                swap(arrival,i,i+1);
                swap(burst,i,i+1);
                swap(pid,i,i+1);

            }
        }
    }
    static void  swap(int[] arr , int first ,int second){
        int  temp  = arr[first];
        arr[first] =  arr[second]  ;
        arr[second] =  temp;
    }
    static int average(int[] arr ){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/ arr.length;
    }
    public static void main(String[] args) {
        int[] arrival_times = {3,3,6,8,10,4,4,9,5};
        int[] burst_times = {12,14,18,16,6,5,3,2,1};
        fcfs(arrival_times,burst_times);

    }
}