package me.william278.huskhomes2.util;

import java.util.regex.Pattern;

public final class RegexUtil {

    // 添加中文字符支持 [\u4e00-\u9fa5]
    public static final Pattern DESCRIPTION_PATTERN = Pattern.compile("^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$");
    public static final Pattern NAME_PATTERN = Pattern.compile("^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$");
    public static final Pattern OWNER_NAME_PATTERN = Pattern.compile("^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$\\.^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$");

}
