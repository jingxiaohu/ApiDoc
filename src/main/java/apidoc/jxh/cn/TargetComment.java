package apidoc.jxh.cn;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在类属性上使用，用于指定 属性注释
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD})
public @interface TargetComment {
    String value() default "";//描述信息
    String isnull() default "是";//是否可以为空
    String lenth() default "无";//限制长度
}
