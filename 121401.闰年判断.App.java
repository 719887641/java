import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int year;
        while(true){
            System.out.println("请输入一个年份：");
            Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();
            if(year<-3200 || year >3200 || year==0){
                System.out.println("年份有误！");
            }
            else if(year>0 && year%4==0&&year%100!=0||year%400==0){
                System.out.println(+year+"年是闰年");
            }else if(year%4==-1 || year%400==1){
                System.out.println(year+"年是闰年");
            }else{
                System.out.println(year+"年不是闰年");
            }
        }

    }
}
