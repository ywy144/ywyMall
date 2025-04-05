package com.ywy144.ywyMallCommon.utils;

import org.springframework.util.CollectionUtils;

import java.util.List;

public final class YwyListUtils {

    public static <T> void printListOnMultipleLines(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            System.out.println("[]");
            return;
        }
        StringBuffer sb = new StringBuffer();
        sb.append('[').append("\n");
        for (T t : list) {
            sb.append("--").append(t).append("\n");
        }
        sb.append(']').append("\n");
        System.out.println(sb);
    }
}
