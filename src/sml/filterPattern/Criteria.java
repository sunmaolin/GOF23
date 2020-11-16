package sml.filterPattern;

import java.util.List;

/**
 * 过滤器模式，也叫标准模式
 */
public interface Criteria {
    /**
     * 过滤方法
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
