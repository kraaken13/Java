package com.kraaken.introcsv.lesson1;

public class CsvParser {
    private int nums;
    public void checkTime(){
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }


    public static void main(String[] args) {
        CsvParser csvParser =new CsvParser();
        csvParser.checkTime();

    }
    public void main1(String[] args) {
        int nums;
        nums = 2;
        Integer nums1 = nums;
        this.nums=nums;

    }
}
