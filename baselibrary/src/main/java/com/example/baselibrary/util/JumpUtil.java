package com.example.baselibrary.util;

public class JumpUtil {
    /**
     * begin和home要跟module_XXX的一样
     * */
    public static final String MainActivity = "/begin/MainActivity";
    public static final String HomeActivity = "/home/HomeActivity";

//    ===========================================================
    public static final  String PAGE_MAIN = "/main";
    public static final class PageMain{
        public static final String MAIN_ACTIVITY = PAGE_MAIN + "/mainActivity";
    }

    public static final  String PAGE_BEGIN = "/begin";
    public static final class PageBegin{
        public static final String BEGIN_ACTIVITY = PAGE_BEGIN + "/beginActivity";
    }

    public static final  String PAGE_HOME = "/home";
    public static final class PageHome{
        public static final String HOME_ACTIVITY = PAGE_HOME + "/homeActivity";
    }

    public static final  String PAGE_MODULE_ONE = "/moduleOne";
    public static final class PageModuleOne{
        public static final String START_ACTIVITY = PAGE_MODULE_ONE + "/mainActivity";
    }

}
