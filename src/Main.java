public class Main {
    public static void main(String[] args) {

        //        Первое задание
        int i=1;
        while(i<=10){
            System.out.print(i);
            i++;
        }
        System.out.println();


        for( i=10;i>0;i=i-1){
            System.out.print(i);
        }
        System.out.println();

//        Второе задание
        int f=3;
        for (;f<=31;f++){
            if (f%7==3){
                System.out.println("Сегодня пятница "+f+" число");
            }
        }
//        Третье задание
        int s=1822;
        int e=2122;
        for (int y=0;y<=2122;y=y+79){
            if (y>=1822){
                System.out.println("Комета появлялась или появиться "+y);
            }
        }
    }

}