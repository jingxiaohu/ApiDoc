package apidoc.jxh.cn;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在SpringMvc control 方法上使用，用于指定接口方法汉子名称
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD})
public @interface ActionComment {
    String value() default "";//描述信息
}
