package com.lilystudio.wheretosleepinnju.app;

import com.lilystudio.wheretosleepinnju.R;

/**
 * Created by mnnyang on 17-10-20.
 */

public class Constant {
    public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    public static final String INTENT_ADD="intent_course_add";
    public static final String INTENT_ADD_COURSE_ANCESTOR="intent_add_course_ancestor";

    public static final String[] WEEK = {"", "周一", "周二", "周三", "周四", "周五", "周六", "周日"};
    public static final String[] WEEK_SINGLE = {"一", "二", "三", "四", "五", "六", "日"};
    public static final String INTENT_EDIT_COURSE = "intent_course";
    public static final String DEFAULT_ALL_WEEK = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16";

    public static final String INTENT_SCHOOL_URL = "intent_school_url";
    public static String XH = "xh";

    public static int[] themeColorArray = {
            R.color.secondary_nanjing_blue,
            R.color.secondary_forgive_green,
            R.color.secondary_ms_blue,
            R.color.secondary_nju_purple,
            R.color.secondary_tomato_red,
            R.color.secondary_bubble_pink,
            R.color.secondary_lake_green,
            R.color.secondary_iris_purple,
            R.color.secondary_pine_blue,
//            R.color.primary_green,
//            R.color.primary_red,
//            R.color.accent_light_blue,
//            R.color.primary_pink,
//            R.color.primary_purple,
//            R.color.primary_purple_de,
//            R.color.primary_indigo,
//            R.color.primary_lime,
//            R.color.primary_blue_grey
    };

    public static int[] themeArray = {
//            R.style.greenTheme,
//            R.style.RedTheme,
//            R.style.light_blueTheme,
//            R.style.pinkTheme,
//            R.style.purpleTheme,
//            R.style.purple_deTheme,
//            R.style.indigoTheme,
//            R.style.limeTheme,
//            R.style.blue_greyTheme,
            R.style.nanjingBlueTheme,
            R.style.forgiveGreenTheme,
            R.style.MSBlueTheme,
            R.style.NJUPurpleTheme,
            R.style.tomatoRedTheme,
            R.style.bubblePinkTheme,
            R.style.lakeGreenTheme,
            R.style.irisPurpleTheme,
            R.style.pineBlueTheme,
    };

    public static String[] themeNameArray = {
            "蓝鲸蓝",
            "原谅绿",
            "微软蓝",
            "南大紫",
            "柿子红",
            "泡泡粉",
            "湖水绿",
            "鸢尾紫",
            "雪松青",

//            "原谅绿",
//            "姨妈红",
//            "知乎蓝",
//            "新初粉",
//            "基佬紫",
//            "同志紫",
//            "上天蓝",
//            "鸡蛋色",
//            "低调灰",
    };
    public static String PREFERENCE_USER_EMAIL = "user_email";
}
