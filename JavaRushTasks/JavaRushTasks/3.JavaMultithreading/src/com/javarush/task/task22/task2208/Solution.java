package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
{name=Ivanov, country=Ukraine, city=Kiev, age=null}
Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
*/

public class Solution {
    public static void main(String[] args) {
       Map<String, String> m = new HashMap<>();
       m.put("name", null);
        m.put("country", null);
        m.put("city", null);
        m.put("age", null);

        System.out.println(getQuery(m));

    }

    public static String getQuery(Map<String, String> params) {
//        {name=Ivanov, country=Ukraine, city=Kiev, age=null}
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> item : params.entrySet()) {
            if (item.getValue() != null)
                stringBuilder.append(item.getKey() + " = '" + item.getValue() + "' and ");
        }
        if (stringBuilder.length()  == 0) return  stringBuilder.append("").toString();
        stringBuilder.delete(stringBuilder.length() - 5, stringBuilder.length());

        return stringBuilder.toString();
    }
}
