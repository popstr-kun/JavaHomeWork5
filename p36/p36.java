/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-12-10 01:38:17
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-12-10 02:21:43
 */
package p36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class p36 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new  BufferedReader(new FileReader("test1.txt"));

            String str1 = br.readLine();
            String str2 = br.readLine();

            System.out.println("寫入到案中的兩個字串是");
            System.out.println(str1);
            System.out.println(str2);
        }
        catch(IOException e){
            System.out.println("輸入輸出有誤");
        }
    }
}
