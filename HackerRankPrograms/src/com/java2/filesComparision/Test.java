package com.java2.filesComparision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

    public class Test {
        public Test(){
            System.out.println("Test.Test()");
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br1 = null;
            BufferedReader br2 = null;
            String sCurrentLine;
            List<String> list1 = new ArrayList<String>();
            List<String> list2 = new ArrayList<String>();
            br1 = new BufferedReader(new FileReader("C:\\Users\\jagdis.CORPDOM\\Desktop\\To san\\c2.txt"));
            br2 = new BufferedReader(new FileReader("C:\\Users\\jagdis.CORPDOM\\Desktop\\To san\\c3.txt"));
            while ((sCurrentLine = br1.readLine()) != null) {
                list1.add(sCurrentLine);
            }
            while ((sCurrentLine = br2.readLine()) != null) {
                list2.add(sCurrentLine);
            }
            List<String> tmpList = new ArrayList<String>(list1);
            tmpList.removeAll(list2);
            System.out.println("content from test.txt which is not there in test2.txt");
            /*for(int i=0;i<tmpList.size();i++){
                System.out.println(tmpList.get(i)); //content from c2.txt which is not there in c3.txt
            }*/
            
            FileWriter writer = new FileWriter("C:\\Users\\jagdis.CORPDOM\\Desktop\\To san\\output_c2.txt"); 
            for(String str: tmpList) {
              writer.write(str);
            }
            writer.close();

            System.out.println("content from test2.txt which is not there in test.txt");

            tmpList = list2;
            tmpList.removeAll(list1);
          /*  for(int i=0;i<tmpList.size();i++){
                System.out.println(tmpList.get(i)); //content from c3.txt which is not there in c2.txt
            }*/
        }
    }