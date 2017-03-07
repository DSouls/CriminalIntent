package com.bignerdranch.android.criminalintent.database;

/**
 * Created by Administrator on 2017/3/7.
 * 这种定义方式给修改字段名称或新增表元素带来了方便
 */

public class CrimeDbSchema {
    public static final class CrimeTable{
        // Class name
        public static final String NAME = "crimes";
        // Data field name
        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
