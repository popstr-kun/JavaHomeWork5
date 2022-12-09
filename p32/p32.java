/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-12-10 01:20:38
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-12-10 01:27:10
 */
package p32;

public class p32 {
    public static void main(String[] args)throws CarException{
        Car car1 = new Car();
        car1.setCar(100, -22.1);
        car1.show();
    }
}

class CarException extends Exception{
    
}

class Car{
    private int num ;
    private double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("已生產了汽車");
    }

    public void setCar(int n, double g)throws CarException{
        if(g<0){
            CarException e = new CarException();
            throw e;
        }
        else{
            num = n;
            gas = g;
            System.out.println("將車號設為"+num+"汽油量設為"+gas);
        }
    }

    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}