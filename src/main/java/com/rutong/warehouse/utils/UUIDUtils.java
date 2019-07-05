package com.rutong.warehouse.utils;

import java.util.UUID;

/**
 * @author 冯怿
 * @since 2019/2/7 10:54
 */
public class UUIDUtils {
    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
