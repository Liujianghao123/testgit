package com.itheima.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 测试用例
 * 
 * @author ljh
 * @version 1.0, 2020-1-1 12:51:42
 */
public class TestDemo {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setAge(12);
		person.setName("刘江浩");
		person.setFirstName("刘");
		person.setLastName("江浩");
		Object json = JSONObject.toJSON(person);
		System.out.println(person);
		
		System.out.println(json);
		
		System.out.println(JSONObject.toJSONString(person));
	}


	private static void test05() {
		List<Person> list = new ArrayList<Person>();
		for(int i = 1;i<=5;i++){
			Person person = new Person();
			person.setId(i);
			person.setAge(12);
			person.setName("刘江浩");
			person.setFirstName("刘");
			person.setLastName("江浩");
			list.add(person);
		}
		PersonList personList = new PersonList();
		personList.setPersons(list);
		
		String personListJsonStr = JSONObject.toJSONString(personList);
		System.out.println(personListJsonStr);
		
		PersonList parseObject = JSONObject.parseObject(personListJsonStr, PersonList.class);
		System.out.println(parseObject.toString());
		
		JSONObject jsonObject = JSONObject.parseObject(personListJsonStr);
		List<Person> pers = (List<Person>) jsonObject.get("persons");
		System.out.println(pers+"个数为:"+pers.size());
	}


	private static void test04() {
		List<Person> list = new ArrayList<Person>();
		for(int i = 1;i<=5;i++){
			Person person = new Person();
			person.setId(i);
			person.setAge(12);
			person.setName("刘江浩");
			person.setFirstName("刘");
			person.setLastName("江浩");
			list.add(person);
		}
		String listJsonStr = JSONObject.toJSONString(list);
		System.out.println(listJsonStr);
		
		List<Person> list2 = JSONObject.parseArray(listJsonStr, Person.class);
		List<Person> list3 = JSONArray.parseArray(listJsonStr, Person.class);
		Object json = JSONObject.toJSON(list3.get(0));
		System.out.println(list2+"===="+list2.size());
		System.out.println(list3);
	}
	

	private static void test03() {
		Person person = new Person();
		person.setId(1);
		person.setAge(12);
		person.setName("刘江浩");
		person.setFirstName("刘");
		person.setLastName("江浩");
		String jsonStr = JSONObject.toJSONString(person);
		System.out.println(jsonStr);
		
		JSONObject jsonObject = JSONObject.parseObject(jsonStr);
		Integer id = jsonObject.getInteger("id");
		System.out.println();
	}

	private static void test02() {
		List<Person> list = new ArrayList<Person>();
		for(int i = 1;i<=5;i++){
			Person person = new Person();
			person.setId(i);
			person.setAge(12);
			person.setName("刘江浩");
			person.setFirstName("刘");
			person.setLastName("江浩");
			list.add(person);
		}
		String listJsonStr = new Gson().toJson(list);
		System.out.println(listJsonStr);
		
		List<Person> result = new Gson().fromJson(listJsonStr,new TypeToken<List<Person>>() {}.getType());
		System.out.println(result);
		String str = new Gson().toString();
		System.out.println(str);
	}

	private static void test01() {
		Person person = new Person();
		person.setId(1);
		person.setAge(12);
		person.setName("刘江浩");
		person.setFirstName("刘");
		person.setLastName("江浩");
		String jsonStr = new Gson().toJson(person);
		System.out.println(jsonStr);
		
		Person per = new Gson().fromJson(jsonStr, Person.class);
		System.out.println(per.toString());
	}

}
