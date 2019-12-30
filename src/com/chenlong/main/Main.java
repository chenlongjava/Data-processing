package com.chenlong.main;

import com.chenlong.function.*;
import com.chenlong.pojo.Keyword;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{


            TurnToLowercase turnToLowercase=new TurnToLowercase();
            //JsonToList jsonToList=new JsonToList();
            Output output=new Output();
            File file=new File("/Users/chenlong/Desktop/output.json");
            //String s= String.valueOf(IOfunction.IO(file));
            //String s=String.valueOf(IOfunction.IO(file));
            // Keyword keyword=JsonToList.jsonToPojo(s,Keyword.class);
            //List<Keyword> list = jsonToList.jsonToList(s, Keyword.class);

            List list1=IOfunction.IO(file);
            //全部数据
            List<Keyword> list=new ArrayList<>();
            //只存有desc的list
            List<String> descList=new ArrayList<>();
            //处理后的list
            List<String> afterDescList=new ArrayList<>();
            for(int i=1;i<list1.size();i++)
             {
                //System.out.println(list.get(i));
                list.add(JsonToList.jsonToPojo(list1.get(i).toString(),Keyword.class));
             }
             for(int i=1;i<list.size();i++)
             {
                 System.out.println("名字："+list.get(i).getEntity());
                 System.out.println("介绍："+list.get(i).getDesc());
             }


            for(int i = 0 ; i < list.size() ; i++) {
                if(list.get(i).getDesc().length()>2)
                {
//                System.out.println("****"+list.get(i).getEntity()+
//                        //"----"+list.get(i).getParentNode()+
//                        //"-"+list.get(i).getSonNode()+
//                        "----"+list.get(i).getDesc()+
//                        "----"+list.get(i).getCurrentUrl()+"***");
                    Entityfilter entityfilter=new Entityfilter();
                    System.out.println("-------------------这是一份数据--------------------------");
                    System.out.println("------------------------------------------------------");
                    System.out.println("名字是:"+list.get(i).getEntity());
                    System.out.println("介绍是："+list.get(i).getDesc());
                    String afterName=entityfilter.SolEntity(list.get(i).getEntity());
                    String afterDesc=entityfilter.SolDesc(list.get(i).getDesc());
                    descList.add(afterDesc);
                    System.out.println("NAME修改后"+afterName);
                    System.out.println("DESC修改后"+afterDesc);
                    EntityToArrary entityToArrary=new EntityToArrary();

                    String lowName=turnToLowercase.toLoweracase(afterName);
                    String lowDesc=turnToLowercase.toLoweracase(afterDesc);

                    //System.out.println("小写名字："+lowName);
                    //System.out.println("小写DESC："+lowDesc);
                    String res=entityToArrary.DividToArray(lowName,lowDesc);
                    System.out.println("最终结果："+res);
                    afterDescList.add(res);
                    //output.OutputData(list.get(i).getDesc(),res);
                    System.out.println("******************************************************");


                }
            }
            output.output(descList,afterDescList);
    }
}
