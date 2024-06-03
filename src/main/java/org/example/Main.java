package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> filterExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(i);
        }
        // filter : 조건문에 맞는 원소들만 넣은 스트림 반환
        return lists.stream().filter(num -> num >= 3).toList();
    }

    public int findFirstExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(i);
        }
        // findFirst : 현재 스트림의 가장 첫번째 원소를 Optional 객체로 반환
        return lists.stream().filter(num -> num >= 3).findFirst().get();
    }

    public List<Integer> forEachExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(i);
        }
        // forEach : stream 내의 모든 원소에, 입력된 행동을 적용
        lists.stream().forEach(num -> num++);
        return lists;
    }

    public List<String> mapExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(i);
        }
        // map : stream 내의 모든 원소에, 입력된 행동을 적용한 stream 반환 ( 반환해주는게 forEach 와의 차이점 )
        List<String> result = lists.stream().map(num -> num.toString()).toList();
        return result;
    }

    public boolean allMatchExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(i);
        }
        // allMatch : stream 내의 모든 원소가 조건을 만족하면 true 반환
        return lists.stream().allMatch(num -> num >= 0);
    }

    public boolean anyMatchExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(i);
        }
        // anyMatch : stream 내의 모든 원소 중, 하나라도 조건에 맞으면 true 반환
        return lists.stream().anyMatch(num -> num % 2 == 0);
    }

    public boolean noneMatchExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            lists.add(i);
        }
        // noneMatch : stream 내의 모든 원소 중, 조건에 부합하는 것이 하나도 없으면 true 반환
        return lists.stream().noneMatch(num -> num % 7 == 0);
    }

    public long countExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(i);
        }
        // count : stream 내의 원소의 개수 반환
        return lists.stream().count();

    }

    public List<Integer> distinctExample() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(10);
        }
        // distinct : stream 내의 원소들의 중복을 제거한 stream 반환
        return lists.stream().distinct().toList();
    }

}