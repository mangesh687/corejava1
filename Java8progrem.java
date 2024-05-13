package com.basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8progrem {
	public static void main(String[] args) {
		List<Integer> sc1=Arrays.asList(1,2,3,1,2,5,6,7,9,1);
		Set<Integer> sc2=new HashSet<>();//1,2,3,5,6,7,9
		List<Integer> output=sc1.stream().filter(x-> !sc2.add(x) ).collect(Collectors.toList());
		System.out.println(output);
		
		
		
		
		
		
		List<Empolerr> sc=new ArrayList<>();
		sc.add(new Empolerr(12,"rahul","bobade",23000,24));
		sc.add(new Empolerr(14,"yash","gobanshi",45000,29));
		sc.add(new Empolerr(1,"aman","parate",44000,40));
		sc.add(new Empolerr(16,"nitin","zabra",18000,89));
		sc.add(new Empolerr(77,"amit","sewatkar",50000,18));
		sc.add(new Empolerr(128,"gopal","rahut",99000,77));
		
		System.out.println("=================================");
		Optional<Empolerr> salary1= Optional.of(sc.stream().sorted(Comparator.comparingInt(Empolerr::getSalary).reversed())
				.skip(1)
				.findFirst().get());
		System.out.println(salary1);
		System.out.println("=======================");
		List<Empolerr> personsalary=sc.stream().filter(x->x.getSalary()==23000).collect(Collectors.toList());
		
		System.out.println(personsalary);
		
		List<Empolerr> age=sc.stream().filter(x->x.getAge()>50).collect(Collectors.toList());
		System.out.println(age);
		
		List<Empolerr> sortname=sc.stream().sorted(Comparator.comparing(Empolerr::getName))
				.collect(Collectors.toList());
		System.out.println(sortname);
		
		List<Empolerr> sortlastname=sc.stream().sorted(Comparator.comparing(Empolerr::getLastname))
				.collect(Collectors.toList());
		System.out.println(sortlastname);
		
		Integer sumage=sc.stream().map(x->x.getAge())
				.reduce(0, (a,b)->a+b);
		System.out.println(sumage);
		
		
		List<Empolerr> salaey=sc.stream().filter(x->x.getSalary()==50000).collect(Collectors.toList());
		System.out.println(salaey);
		
		List<Integer> j=Arrays.asList(1,2,3,11,23,33,13,55);
		List<String> p=j.stream().map(x->x.toString()).filter(x->x.startsWith("1")).collect(Collectors.toList());
		System.out.println(p);
		List<Integer> duplicateNumber = Arrays.asList(1,2,1,2,3,4,4);
		Set<Integer> unique = new HashSet<>();
		List<Integer> error = duplicateNumber.stream()
		.filter(x->!unique.add(x))
		.collect(Collectors.toList());
		System.out.println(error);
		
	}

}
