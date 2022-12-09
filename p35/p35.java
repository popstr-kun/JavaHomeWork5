/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-12-10 01:32:45
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-12-10 01:37:00
 */
package p35;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class p35 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("test1.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            pw.println("hello");
            pw.println("GoodBye!");

            pw.close();

            System.out.println("資料已經寫入檔案了");
        }
        catch(IOException e){
            System.out.println("輸入輸出有誤");
        }
    }
}
