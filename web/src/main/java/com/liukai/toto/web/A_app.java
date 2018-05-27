package com.liukai.toto.web;

/**
 * Created by liukai on 2017/8/28.
 *
 * @author liukai
 */
public class A_app {

  // public static void main(String[] args) throws ParseException {
  //
  //   List<Req> list = new ArrayList<>();
  //
  //   list.add(new Req("a", 1));
  //   list.add(new Req("a", 2));
  //   list.add(new Req("v", 3));
  //   list.add(new Req("b", 4));
  //   Map<String, List<Req>> map = list.stream().collect(Collectors.groupingBy(Req::getName));
  //   map.forEach((k, v) -> {
  //     v.forEach(i -> {
  //       i.setFaile(true);
  //     });
  //   });
  //   System.out.println(list);
  //   System.out.println(map);
  //   String a = "a";
  //   String b = "b";
  //   a = b;
  //   System.out.println("a=" + a);
  //   b = "c";
  //   System.out.println("a=" + a);
  //   System.out.println("b=" + b);
  //
  //   String time = "2017-10-18 00:00:00";
  //   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  //   Date parse = dateFormat.parse(time);
  //   System.out.println(parse);
  //   System.out.println(parse.getTime());
  //
  // }

  public static class Req {

    private String name;

    private long age;

    private boolean isFaile;

    public Req(String name, long age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public long getAge() {
      return age;
    }

    public void setAge(long age) {
      this.age = age;
    }

    public boolean isFaile() {
      return isFaile;
    }

    public void setFaile(boolean faile) {
      isFaile = faile;
    }

    @Override
    public String toString() {
      return "Req{" + "name='" + name + '\'' + ", age=" + age + ", isFaile=" + isFaile + '}';
    }
  }
}
