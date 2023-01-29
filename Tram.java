import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,prev=0,ent,ext,sum=0;
        for(int i=0;i<n;i++){
            ext=sc.nextInt();
            ent=sc.nextInt();
            prev=prev-ext;
            sum=prev+ent;
            prev=sum;
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
