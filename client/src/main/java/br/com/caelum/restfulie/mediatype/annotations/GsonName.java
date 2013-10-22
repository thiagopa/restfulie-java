package br.com.caelum.restfulie.mediatype.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Quer serializar com o nome que bem entender!!!
 * @author Thiago Pagonha
 * @version Out/2013
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface GsonName {
  /**
   * @return the desired name of the field when it is serialized
   */
  String value();
}