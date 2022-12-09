/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-12-10 01:43:55
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-12-10 01:46:50
 */
package p40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p40 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("請指定正確的案名稱");
            System.exit(1);
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String str;

            while((str = br.readLine())!=null){
                System.out.println(str);
            }

            br.close();
        }
        catch(IOException e){
            System.out.println("輸入輸出有誤");
        }
    }
}
