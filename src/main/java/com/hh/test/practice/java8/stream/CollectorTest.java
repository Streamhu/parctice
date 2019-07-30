package com.hh.test.practice.java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/7/30 11:01
 */
public class CollectorTest {

    public static void main(String[] args) {
        // 测试一个对象转换成另一个对象
        // testConvert();
        // 测试两个集合之间的关系（交集、差集、并集）
        testMath();
        // 测试分组
        // testGroup();
        // 统计类测试
        // testSummaryStatistics();
    }

    private static void testSummaryStatistics(){
        IntSummaryStatistics aStatistics = Stream.of(1,2,4,8,16,32).mapToInt(x -> x).summaryStatistics();
        System.out.println(" max = " + aStatistics.getMax());
        System.out.println(" min = " + aStatistics.getMin());
        System.out.println(" average = " + aStatistics.getAverage());
        System.out.println(" sum = " + aStatistics.getSum());
        System.out.println(" count = " + aStatistics.getCount());

        List<Student> studentsList1 = new ArrayList<>();
        studentsList1.add(new Student(1, "Tom", 18, "西西里"));
        studentsList1.add(new Student(2, "John", 8, "北京"));
        studentsList1.add(new Student(3, "Kim", 27, "布拉格"));
        studentsList1.add(new Student(4, "Mike", 36, "威尼斯"));

        IntSummaryStatistics bStatistics = studentsList1.stream().collect(Collectors.summarizingInt(Student::getAge));
        System.out.println(" 年龄max = " + bStatistics.getMax());
        System.out.println(" 年龄min = " + bStatistics.getMin());
        System.out.println(" 年龄average = " + bStatistics.getAverage());
        System.out.println(" 年龄sum = " + bStatistics.getSum());
        System.out.println(" 年龄count = " + bStatistics.getCount());

    }

    private static void testGroup(){
        List<Student> studentsList1 = new ArrayList<>();
        studentsList1.add(new Student(1, "Tom", 18, "西西里"));
        studentsList1.add(new Student(2, "John", 8, "塞尔维亚"));
        studentsList1.add(new Student(3, "Kim", 27, "布拉格"));
        studentsList1.add(new Student(4, "Kim", 36, "威尼斯"));
        studentsList1.add(new Student(4, "Charles", 18, "塞尔维亚"));
        // group by简单用法, 注意返回类型
        Map<Integer, List<Student>> group1 = studentsList1.stream().collect(Collectors.groupingBy(Student::getAge));
        group1.forEach((key, value) -> System.out.println("key = " + key + "/value = " + value));

        // 分组完求个数
        Map<String, Long> groupByCount = studentsList1.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        groupByCount.forEach((key, value) -> System.out.println("key = " + key + "/value = " + value));

        // 分组完求总数（所有年龄之和）
        Map<String, Integer> groupBySum = studentsList1.stream().collect(Collectors.groupingBy(Student::getAddress, Collectors.summingInt(Student::getAge)));
        groupBySum.forEach((key, value) -> System.out.println("key = " + key + "/value = " + value));

        // 分组完映射需要的字段
        Map<Integer, List<String>> groupByMapping = studentsList1.stream().collect(Collectors.groupingBy(Student::getId, Collectors.mapping(Student::getName, Collectors.toList())));
        groupByMapping.forEach((key, value) -> System.out.println("key = " + key + "/value = " + value));

        // partitioningBy方法，接受一个Predicate函数，该函数返回boolean值，用于将内容分为两组
        Map<Boolean, List<Integer>> partitioningBy = Stream.of(1,2,3,4).collect(Collectors.partitioningBy((i) -> i % 2 == 0));
        partitioningBy.forEach((key, value) -> System.out.println("key = " + key + "/value = " + value));

        // 分组网再求分组里面的math计算
        Map<String, Double> groupByAverage = studentsList1.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingInt(Student::getAge)));
        groupByAverage.forEach((key, value) -> System.out.println("groupByAverage key = " + key + "/value = " + value));

    }

    private static void testMath(){

       List<Integer> integerList1 = Arrays.asList(1,4,9,16,25,36);
       List<Integer> integerList2 = Arrays.asList(1,2,4,8,16,32,64);

       // 交集
       integerList1.stream().filter(integerList2::contains).forEach((c) -> System.out.print(c + " "));

       // 差集（list1-list2）
        integerList1.stream().filter(a -> !integerList2.contains(a)).forEach((c) -> System.out.print(c + " "));

        // 并集
        List<Integer> listAll1 = integerList1.parallelStream().collect(Collectors.toList());
        List<Integer> listAll2 = integerList2.parallelStream().collect(Collectors.toList());
        listAll1.addAll(listAll2);
        listAll1.stream().distinct().sorted().forEach(item -> System.out.print("/" + item));


        List<Student> studentsList1 = new ArrayList<>();
        studentsList1.add(new Student(1, "Tom", 18, "西西里"));
        studentsList1.add(new Student(2, "John", 8, "北京"));
        studentsList1.add(new Student(3, "Kim", 27, "布拉格"));
        studentsList1.add(new Student(4, "Mike", 36, "威尼斯"));
        // 计算平均值
        Double average = studentsList1.stream().collect(Collectors.averagingInt(s -> s.getAge()));
        System.out.println("average = " + average);

        // 计算最大值
        Integer max1 = studentsList1.stream().collect(Collectors.maxBy((Student o1, Student o2) -> o1.getAge() - o2.getAge())).get().getAge();
        System.out.println("max1 = " + max1);
        Integer max2 = studentsList1.stream().sorted(Comparator.comparing(Student::getAge).reversed()).findFirst().get().getAge();
        System.out.println("max2 = " + max2);
        Integer max3 = studentsList1.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getAge))).get().getAge();
        System.out.println("max3 = " + max3);
    }

    public static void testConvert() {
        List<Student> studentsList1 = new ArrayList<>();
        studentsList1.add(new Student(1, "Tom", 18, "西西里"));
        studentsList1.add(new Student(2, "John", 8, "北京"));
        studentsList1.add(new Student(3, "Kim", 27, "布拉格"));
        studentsList1.add(new Student(4, "Mike", 36, "威尼斯"));

        Map<Integer, String> map1 = new HashMap<>(4);
        map1.put(1, "Tome");
        map1.put(2, "John");
        map1.put(3, "Kim");
        map1.put(4, "Mike");

        // 一个对象的集合转化为另一个对象的集合
        studentsList1.stream().map((student) -> new Class(student.getId(), null, student.getAddress())).forEach((c) -> System.out.println(c.toString()));

        // map集合转list
        List<Student> mapToList = map1.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey())).map(e -> new Student(e.getKey(), e.getValue(), null, null)).collect(Collectors.toList());
        mapToList.forEach((c) -> System.out.println(c.toString()));

        // list转map
        Map<Integer, Student> listToMap = studentsList1.stream().collect(Collectors.toMap(Student::getId, item -> item));
        listToMap.forEach((key, value) -> System.out.println("key = " + key + "/value = " + value));
        // 只获取list中的两个属性
        Map<Integer, String> listToMap2 = studentsList1.stream().collect(Collectors.toMap(Student::getId, Student::getName));
        listToMap2.forEach((key, value) -> System.out.println("key = " + key + "/value = " + value));

        // list转 List<Map<String,Object>>
        List<Map<String, Object>> listToListMap = studentsList1.stream().map((item) -> {
            Map<String,Object> map = new HashMap<>(studentsList1.size());
            map.put("id", item.getId());
            map.put("name", item.getName());
            map.put("address", item.getAddress());
            return map;
        }).collect(Collectors.toList());
        listToListMap.forEach((c) -> System.out.println(c.toString()));

        // List<String> 转String
        List<String> webs = Arrays.asList("www.baidu.com", "www.google.com", "www.qq.com");
        String allWebs = webs.stream().collect(Collectors.joining("/"));
        System.out.println("allWebs = " + allWebs);
    }

}
