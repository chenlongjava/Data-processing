package com.chenlong.function;

/**
 *  author：chenlong
 *  作用：使用IO流读取文件（文件太大无法正确读取）；
 */

import com.chenlong.main.Main;
import com.chenlong.pojo.Keyword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOfunction {
    public static List<String>  IO(File file) {
        FileReader fr = null;
        BufferedReader br = null;
        StringBuffer txt = new StringBuffer();
        List<String> list=new ArrayList<>();
        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                txt.append(line);
                // System.out.println(line);
                list.add(line);
                //txt.append("\n");
            }
            br.close();
            fr.close();
        } catch (IOException
                e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // System.out.println(txt);
        return list;
    }

}
