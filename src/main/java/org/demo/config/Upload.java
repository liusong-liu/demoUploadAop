package org.demo.config;

import org.demo.constants.UploadType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解用于标识切点
 * @author 刘松
 * @date 2022/7/26 15:30
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Upload {
    // 记录上传类型
    UploadType type() default UploadType.未知;
}
