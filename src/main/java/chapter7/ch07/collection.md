# 컬렉션 프레임워크

- 프로그램 구현에 필요한 자료구조를 구현해 놓은 JDK 라이브러리
- java.util 패키지에 구현되어 있음
- 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
- 컬렉션프레임워크에는 Collection Interface와 Map Interface로 나누어져 있다.

### Collection Interface란?

Collection Interface는 선형 자료 구조이며 value만을 저장한다. </br>
Collection Interface에는 List Interface와 Set Interface가 있다.  </br>

List Interface 는 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스이고 중복을 허용한다. </br>
List Interface 구현체로는 ArrayList, Vector, LinkedList 가 있다. </br> 

Set Interface 는 중복을 허용하지 않고 유일한 값을 관리하는데 필요한 메서드가 선언된다. </br>
Set Interface 저장되는 순서와 출력되는 순서는 다를 수 있다. </br>
Set Interface 구현체로는 HashSet과 TreeSet가 있다. </br>

### Map Interface란?

Map Interface에는 비 선형 자료 구조이며 Key, Value가 한쌍으로 저장한다. </br>
Map Interface는 key의 중복을 허용하지 않는다. </br>
Map Interface 구현체로는 HashTable, HashMap, TreeMap이 있다. </br>


