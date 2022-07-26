package org.demo.constants;

import java.util.HashMap;
import java.util.Map;

public enum UploadType {
    未知(0,"未知"),
    压缩包(1,"压缩包"),
    图片(2,"图片"),
    文件(3,"文件"),
    表格(4,"表格");
    private int code;
    private String desc;
    private static Map<Integer, UploadType> map = new HashMap<>();
    static {
        for (UploadType value : UploadType.values()) {
            map.put(value.code, value);
        }
    }

    UploadType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static UploadType getByCode(Integer code) {
        return map.get(code);
    }

}
