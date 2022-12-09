/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-12-10 01:27:38
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-12-10 01:31:28
 */
package p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p34 {
    public static void main(String[] args) {
        System.out.println("請輸入字串");

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            System.out.println("已輸入字串"+str);
        }
        catch(IOException e){
            System.out.println("輸入輸出有誤");
        }
    }
}
