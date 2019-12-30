package com.chenlong.function;

import java.util.Arrays;

/**
 *  author：chenlong
 *  作用：将过滤好的名字，分割成数组；
 */
public class EntityToArrary {
    public String DividToArray(String AfterFilename,String Des){

        StringHelper stringHelper=new StringHelper();
        String []name=AfterFilename.split(" ");
        String []DesArray=Des.split(" ");

        if(name.length==1)
        {
            String ex="qa";
            //String res=ex[0];
            //String Desres=stringHelper.StringHelper(DesArray);
            String test=Des.replace(AfterFilename,ex);
            //System.out.println("测试"+AfterFilename+ex);
            //System.out.println("DES检查关键字后："+test);

            String resArray[]=test.split(" ");

            for(int i=0;i<resArray.length;i++)
            {
                if(resArray[i].equals("qa")||resArray[i].equals("qb")||resArray[i].equals("qc"))
                {
                    continue;
                }else {
                    resArray[i] = "o";
                }
            }

            String res=stringHelper.StringHelper(resArray);
            //System.out.println("最终结果："+res);
            return res;

        }else if(name.length==2)
        {
            String ex[]=new String[2];
            ex[0]="qa";
            ex[1]="qc";

            String AfterEx=stringHelper.StringHelper(ex);
            String Desres=stringHelper.StringHelper(DesArray);
            //System.out.println(AfterEx);
            System.out.println(Desres);
            String test=Desres.replace(AfterFilename,AfterEx);
            //System.out.println("DES检查关键字后："+test);
            String resArray[]=test.split(" ");

            for(int i=0;i<resArray.length;i++)
            {
                if(resArray[i].equals("qa")||resArray[i].equals("qb")||resArray[i].equals("qc"))
                {
                    continue;
                }else {
                    resArray[i] = "o";
                }
            }

            String res=stringHelper.StringHelper(resArray);
           // System.out.println("最终结果："+res);
            return res;

        }else if(name.length>2)
        {
            String ex[]=new String[name.length];
            ex[0]="qa";
            ex[ex.length-1]="qc";
            for(int i=1;i<ex.length-1;i++)
            {
                ex[i]="qb";
            }


            String AfterEx=stringHelper.StringHelper(ex);
            String Desres=stringHelper.StringHelper(DesArray);
            //System.out.println(AfterEx);
            //System.out.println(Desres);
            String test=Desres.replace(AfterFilename,AfterEx);
            //System.out.println("DES检查关键字后："+test);
            String resArray[]=test.split(" ");

            for(int i=0;i<resArray.length;i++)
            {
                if(resArray[i].equals("qa")||resArray[i].equals("qb")||resArray[i].equals("qc"))
                {
                    continue;
                }else {
                    resArray[i] = "o";
                }
            }
            String res=stringHelper.StringHelper(resArray);
           //System.out.println("最终结果："+res);
            return res;
        }
        return null;
    }
}
