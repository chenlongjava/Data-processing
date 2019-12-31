package com.chenlong.function;

import java.io.*;
import java.util.List;

public class Output {
//    public void OutputData(String Desc,String res) throws Exception
//    {
//        String DescArray[]=Desc.split(" ");
//        String resArray[]=res.split(" ");
//
////        FileOutputStream fos=new FileOutputStream(new File("/Users/chenlong/Desktop/result.txt"));
////        OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
////        BufferedWriter bw=new BufferedWriter(osw);
////        //简写如下：
////        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
////        //        new FileOutputStream(new File("E:/phsftp/evdokey/evdokey_201103221556.txt")), "UTF-8"));
////
////        for(int i=0;i<DescArray.length;i++){
////            bw.write(DescArray[i]+"\t\t\t\t\t"+resArray[i]+"\t\n");
////        }
////        bw.write("---------------------------");
////        //注意关闭的先后顺序，先打开的后关闭，后打开的先关闭
////        bw.close();
////        osw.close();
////        fos.close();
//        for(int i=0;i<DescArray.length-1;i++)
//        {
//            System.out.println(DescArray[i]+"----"+resArray[i]);
//        }
//    }
    public void output(List<String> desc,List<String> afterdesc) throws IOException
    {
        FileOutputStream fos=new FileOutputStream(new File("/Users/chenlong/Desktop/result.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);

        for(int i=0;i<desc.size();i++)
        {
            System.out.println("输出的desc：  "+desc.get(i));
            System.out.println("输出的处理后的："+afterdesc.get(i));
            String s1[]=desc.get(i).split(" ");
            String s2[]=afterdesc.get(i).split(" ");

            bw.write("*****新的关键字*****\n");
            bw.write("----------------------------------\n");

            for(int j=0;j<s1.length;j++)
            {
                System.out.println(s1[j]+"---"+s2[j]);
                bw.write(s1[j]+"\t"+s2[j]+"\n");
            }

            bw.flush();
        }
            bw.close();
            osw.close();
            fos.close();

    }
}
