package com.test;


import com.mapper.foreach;

public class Main {
    /**
     * 用来测试resultMap
     * @param args
     * @throws Exception
     */
//    public static void main(String args[]) throws  Exception{
//
//         resultMapTest resultMapTest = new resultMapTest();
//         resultMapTest.doItResultMap();
//    }

    /**
     * 用来将测试foreach
     * @param args
     * @throws Exception
     */
//    public static void main(String args[]) throws  Exception{
//         foreachTest foreachTest = new foreachTest();
//         foreachTest.doIt();
//
//    }

    /**
     * 用来测试 sql片段
     * @param args
     * @throws Exception
     */
//    public static void main(String args[]) throws  Exception{
//        sql sql = new sql();
//        sql.doIt();
//    }

    /**
     * 用来测试使用collection
     * @param args
     * @throws Exception
     */
//    public static void main(String args[]) throws  Exception{
//        collectionTest collectionTest = new collectionTest();
//        collectionTest.doItCollection();
//    }

    /**
     * 测试使用association
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws  Exception{
       associationTest associationTest = new associationTest();
       associationTest.doIt();
    }
}
