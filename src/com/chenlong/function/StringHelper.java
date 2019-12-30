package com.chenlong.function;

public class StringHelper {
    public String StringHelper(String []data){
        String res="";

        for(int i=0;i<data.length;i++)
        {
            res=res+data[i]+" ";
        }
        return res;
    }
}
