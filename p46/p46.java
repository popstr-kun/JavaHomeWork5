/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-12-10 01:51:58
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-12-10 02:02:54
 */
package p46;

public class p46 {
    public static void main(String[] args) {
        Car car1 = new Car("1號車");
        car1.start();

        for(int i=0;i<5;i++){
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class Car extends Thread{
    private String name;

    public Car(String nm){
        name = nm;
    }

    public void run(){
        for(int i=0;i<5;i++){
            try{
                sleep(1000);
                System.out.println("正在進行"+name+"的處理工作");
            }
            catch(InterruptedException e){

            }
        }
    }
}