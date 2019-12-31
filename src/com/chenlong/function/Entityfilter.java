package com.chenlong.function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  author：chenlong
 *  作用：过滤名字中的符号；
 */

public class Entityfilter {


    public String SolEntity(String Entity){

        String regEx="[ _ ( )]";

        //可以在中括号内加上任何想要替换的字符，实际上是一个正则表达式



        Pattern p1 = Pattern.compile(regEx);


        String The_replace=" ";

        Matcher m = p1.matcher(Entity);//这里把想要替换的字符串传进来

        String newString = m.replaceAll(The_replace).trim();

       // System.out.println(newString);

        return newString;
    }
    public String SolDesc(String Desc){

        String regEx="[ _ ( )]";

        //可以在中括号内加上任何想要替换的字符，实际上是一个正则表达式

        Pattern p1 = Pattern.compile(regEx);

        String The_replace=" ";

        Matcher m = p1.matcher(Desc);//这里把想要替换的字符串传进来

        String newString = m.replaceAll(The_replace).trim();

        newString=newString.replace("/<[^>]+>/g","");

        // System.out.println(newString);

        return newString;
    }

}
