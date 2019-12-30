package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
        public static List<String> IO(File file) {
            FileReader fr = null;
            BufferedReader br = null;
            StringBuffer txt = new StringBuffer();
            List<String> ls = new ArrayList<>();
            try {

                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String line = null;

                while((line = br.readLine()) != null){
                    ls.add(line);
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
            return ls;
        }

    public static void main(String[] args) {
        test test=new test();
        File file=new File("/Users/chenlong/Desktop/output.json");
        List list=test.IO(file);
        for(Object list1:list)
        {
            System.out.println(list1);
        }
    }

    }


